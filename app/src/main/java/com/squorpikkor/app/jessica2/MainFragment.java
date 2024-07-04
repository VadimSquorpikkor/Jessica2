package com.squorpikkor.app.jessica2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class MainFragment extends Fragment {

   public static MainFragment newInstance() {
      return new MainFragment();
   }

   @Override
   public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

      View view = inflater.inflate(R.layout.fragment_main, container, false);

      SectionsPagerAdapter4 sectionsPagerAdapter = new SectionsPagerAdapter4(requireActivity(), getChildFragmentManager());
      ViewPager viewPager = view.findViewById(R.id.view_pager);
      viewPager.setAdapter(sectionsPagerAdapter);
      TabLayout tabs = view.findViewById(R.id.tabs);
      tabs.setupWithViewPager(viewPager);

      return view;
   }

}
