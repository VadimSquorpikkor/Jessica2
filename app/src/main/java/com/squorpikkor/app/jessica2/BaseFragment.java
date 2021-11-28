package com.squorpikkor.app.jessica2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public abstract class BaseFragment extends Fragment {

    RecyclerView recyclerView;
    MainViewModel mViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        recyclerView = view.findViewById(R.id.recycler);
        AlgorithmAdapter adapter = new AlgorithmAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        setList(adapter);
        return view;
    }

    /**Адаптеру присваиваивается ArrayList*/
    protected void setList(AlgorithmAdapter adapter) {
        getList().observe(getViewLifecycleOwner(), adapter::setList);
    }

    /**
     * В этом методе выбирается для setList тот конкретный лист, который будет присваиваться адаптеру
     * в методе setList Каждый из наследующих BaseFragment классов реализовывает этот метод,
     * устанавливая тот лист из ViewModel, которых необходимо отобразить в этом конкретном наследнике
     */
    abstract MutableLiveData<ArrayList<Algorithm>> getList();

}
