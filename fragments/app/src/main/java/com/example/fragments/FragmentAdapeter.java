package com.example.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragments.Fragments.Fragment1;
import com.example.fragments.Fragments.Fragment2;
import com.example.fragments.Fragments.Fragment3;

class FragmentAdapeter extends FragmentPagerAdapter {
    public  FragmentAdapeter(@NonNull FragmentManager fm){
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
