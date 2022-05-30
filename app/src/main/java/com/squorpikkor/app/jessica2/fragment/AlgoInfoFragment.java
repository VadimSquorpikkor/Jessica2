package com.squorpikkor.app.jessica2.fragment;

import static com.squorpikkor.app.jessica2.data.Data.FTL;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.squorpikkor.app.jessica2.data.Algorithm;
import com.squorpikkor.app.jessica2.MainViewModel;
import com.squorpikkor.app.jessica2.R;

public class AlgoInfoFragment extends Fragment {

    private static final String POSITION = "position";
    private static final String TYPE = "type";

    public static AlgoInfoFragment newInstance(int position, int type) {
        AlgoInfoFragment fragment = new AlgoInfoFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        args.putInt(TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int position;
        int type;
        if (getArguments() != null) {
            position = getArguments().getInt(POSITION);
            type = getArguments().getInt(TYPE);
        } else {
            position = 0;
            type = FTL;
        }

        View view = inflater.inflate(R.layout.fragment_algo_info, container, false);

        MainViewModel model = new ViewModelProvider(requireActivity()).get(MainViewModel.class);
        Algorithm algorithm = model.getList(type).get(position);
        TextView algo = view.findViewById(R.id.algorithm);
        algo.setText(algorithm.getAlgorithm()[0]);

        return view;
    }
}
