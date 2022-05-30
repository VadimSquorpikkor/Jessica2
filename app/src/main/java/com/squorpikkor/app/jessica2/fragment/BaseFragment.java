package com.squorpikkor.app.jessica2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.jessica2.Algorithm;
import com.squorpikkor.app.jessica2.InfoActivity;
import com.squorpikkor.app.jessica2.adapter.AlgorithmAdapter;
import com.squorpikkor.app.jessica2.MainViewModel;
import com.squorpikkor.app.jessica2.R;

import java.util.ArrayList;

public abstract class BaseFragment extends Fragment {

    public static final String EXTRA_POSITION = "extra_position";
    public static final String EXTRA_TYPE = "extra_type";
    private MainViewModel mViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        AlgorithmAdapter adapter = new AlgorithmAdapter();
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 5));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        adapter.setList(getList());
        adapter.setOnItemClickListener(this::openInfo);

        return view;
    }

    //выбирается тот конкретный лист, который будет присваиваться адаптеру
    private ArrayList<Algorithm> getList() {
        return mViewModel.getList(getType());
    }

    //тип алгоритма
    abstract int getType();

    public void openInfo(int position) {
//        Fragment newFragment = PagerFragment.newInstance(position, getType());
//        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
//        transaction.replace(R.id.fragment_container, newFragment);
//        transaction.addToBackStack(null);
//        transaction.commit();

        Intent intent = new Intent(requireActivity(), InfoActivity.class);
        intent.putExtra(EXTRA_POSITION, position);
        intent.putExtra(EXTRA_TYPE, getType());
        startActivity(intent);
    }
}
