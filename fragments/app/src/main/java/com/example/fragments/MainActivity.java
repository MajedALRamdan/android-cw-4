package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp=findViewById(R.id.vp);
        TabLayout tl =findViewById(R.id.tablayout);

        FragmentAdapeter adapeter= new FragmentAdapeter(getSupportFragmentManager());
        vp.setAdapter(adapeter);

        tl.setupWithViewPager(vp);
        tl.getTabAt(0).setIcon(R.drawable.ic_baseline_home_24);
        tl.getTabAt(1).setIcon(R.drawable.ic_baseline_format_list_bulleted_24);
        tl.getTabAt(2).setIcon(R.drawable.ic_baseline_flare_24);







    }
}