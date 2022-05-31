package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.data.Data.FTL;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squorpikkor.app.jessica2.InfoActivity;
import com.squorpikkor.app.jessica2.MainViewModel;
import com.squorpikkor.app.jessica2.R;
import com.squorpikkor.app.jessica2.adapter.AlgorithmAdapter;
import com.squorpikkor.app.jessica2.data.Algorithm;

import java.util.ArrayList;

public class GridFragment extends Fragment {

    public static final String EXTRA_POSITION = "extra_position";
    public static final String EXTRA_TYPE = "extra_type";
    private MainViewModel mViewModel;

    private static final String COLUMN = "column";
    private static final String TYPE = "type";

    int type;

    public static GridFragment newInstance(int cols, int type) {
        GridFragment fragment = new GridFragment();
        Bundle args = new Bundle();
        args.putInt(COLUMN, cols);
        args.putInt(TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int column;
        if (getArguments() != null) {
            column = getArguments().getInt(COLUMN);
            type = getArguments().getInt(TYPE);
        } else {
            column = 5;
            type = FTL;
        }

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        AlgorithmAdapter adapter = new AlgorithmAdapter();
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), column));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        adapter.setList(getList());
        adapter.setOnItemClickListener(this::openInfo);

        return view;
    }

    private ArrayList<Algorithm> getList() {
        return mViewModel.getList(type);
    }

    public void openInfo(int position) {
        Intent intent = new Intent(requireActivity(), InfoActivity.class);
        intent.putExtra(EXTRA_POSITION, position);
        intent.putExtra(EXTRA_TYPE, type);
        startActivity(intent);
    }

}
