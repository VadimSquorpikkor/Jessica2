package com.squorpikkor.app.jessica2.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.squorpikkor.app.jessica2.MainViewModel;
import com.squorpikkor.app.jessica2.R;
import com.squorpikkor.app.jessica2.SectionsPagerAdapter;

public class AlgoTypeSelectFragment extends Fragment {
    View view;
    public AlgoTypeSelectFragment() {
        // Required empty public constructor
    }

    public MainViewModel mViewModel;

    public static AlgoTypeSelectFragment newInstance() {
        return new AlgoTypeSelectFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_algo_type_select, container, false);
        mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(requireActivity(), requireActivity().getSupportFragmentManager());
        ViewPager viewPager = view.findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = view.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        return view;
    }

}