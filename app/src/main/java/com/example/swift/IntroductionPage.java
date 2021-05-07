package com.example.swift;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Objects;

public class IntroductionPage extends AppCompatActivity {
    ViewPager viewPager;
    TextView counter, next;
    int total =4, count =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        viewPager = findViewById(R.id.viewpager);
        counter  = findViewById(R.id.counter);
        next  = findViewById(R.id.next);
        counter.setText(count+" / "+total);

        Objects.requireNonNull(getSupportActionBar()).hide();


        viewPager.setAdapter(new SliderAdapter(getSupportFragmentManager()));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
               count =0;
                count = position+1;
                counter.setText(count+" / "+total);

                if (count == total)
                    next.setText("Finish");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}