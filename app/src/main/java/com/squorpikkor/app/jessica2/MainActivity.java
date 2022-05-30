package com.squorpikkor.app.jessica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import com.squorpikkor.app.jessica2.fragment.AlgoTypeSelectFragment;

public class MainActivity extends AppCompatActivity {

    public MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = new ViewModelProvider(MainActivity.this).get(MainViewModel.class);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container, AlgoTypeSelectFragment.newInstance(), null)
                    .commit();
        }
    }
}