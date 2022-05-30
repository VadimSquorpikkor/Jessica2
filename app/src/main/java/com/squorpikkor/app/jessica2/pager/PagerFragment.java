package com.squorpikkor.app.jessica2.pager;

import static com.squorpikkor.app.jessica2.Data.FTL;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.squorpikkor.app.jessica2.MainViewModel;
import com.squorpikkor.app.jessica2.R;

public class PagerFragment extends Fragment {

    private static final String POSITION = "position";
    private static final String TYPE = "type";

    // Required empty public constructor
    public PagerFragment() {
    }

    public static PagerFragment newInstance(int position, int type) {
        PagerFragment pageFragment = new PagerFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(POSITION, position);
        arguments.putInt(TYPE, type);
        pageFragment.setArguments(arguments);
        return pageFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int position;
        int type;
        if (getArguments() != null) {
            position = getArguments().getInt(POSITION);
            type = getArguments().getInt(TYPE);
        } else {
            position = 0;
            type = FTL;
        }
        View view = inflater.inflate(R.layout.fragment_pager, container, false);
        MainViewModel mViewModel = new ViewModelProvider(requireActivity()).get(MainViewModel.class);

        ViewPager pager = view.findViewById(R.id.pager);
        pager.setAdapter(new Pager(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mViewModel.getList(type).size(), type));

        pager.setCurrentItem(position);

        return view;
    }
}
