package com.example.swift;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SliderAdapter extends FragmentStatePagerAdapter {
    public SliderAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public SliderAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        //add fragments here
        switch (position){
            case 0:
                return new ScreenOne();
            case 2:
                return  new ScreenTwo();
            case 3:
                return  new ScreenThree();
            default:
                return  new ScreenOne();
        }
    }

    @Override
    public int getCount() {
        //count of screen
        return 4;
    }
}
