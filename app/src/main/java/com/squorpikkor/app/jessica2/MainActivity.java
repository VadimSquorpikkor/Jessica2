package com.squorpikkor.app.jessica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
//import com.squorpikkor.library.SaveLoad;


public class MainActivity extends AppCompatActivity {

    public MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = new ViewModelProvider(MainActivity.this).get(MainViewModel.class);

        SectionsPagerAdapter4 sectionsPagerAdapter = new SectionsPagerAdapter4(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

//        SaveLoad saveLoad = new SaveLoad(this);

    }
}