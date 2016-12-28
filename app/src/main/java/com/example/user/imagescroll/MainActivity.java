package com.example.user.imagescroll;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MyViewPager myViewPager;
    private static final int[] images = {R.drawable.card_ct,R.drawable.card_hd,R.drawable.card_hn,
            R.drawable.card_ibk, R.drawable.card_kb};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager = new MyViewPager(this);
        viewPager= (ViewPager) findViewById(R.id.vp_image);
        viewPager.setAdapter(myViewPager);

    }
}
