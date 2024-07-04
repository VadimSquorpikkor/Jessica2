package com.squorpikkor.app.jessica2;

import static com.squorpikkor.app.jessica2.fragment.GridFragment.EXTRA_POSITION;
import static com.squorpikkor.app.jessica2.fragment.GridFragment.EXTRA_TYPE;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.squorpikkor.app.jessica2.pager.PagerFragment;

//не используется. только для варианта открытия инфо в отдельной активити
@Deprecated
public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        int position = getIntent().getIntExtra(EXTRA_POSITION, 0);
        int type = getIntent().getIntExtra(EXTRA_TYPE, 0);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, PagerFragment.newInstance(position, type))
                    .commitNow();
        }
    }
}