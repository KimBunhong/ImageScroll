package com.example.user.imagescroll;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by user on 12/28/2016.
 */

public class MyViewPager extends PagerAdapter {

    private LayoutInflater inflater;
    private Context context;
     int[] images = {R.drawable.card_ct,R.drawable.card_hd,R.drawable.card_hn,
            R.drawable.card_ibk, R.drawable.card_kb};


    public MyViewPager(Context context){
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.image_layout,container,false);
        ImageView imageView= (ImageView) view.findViewById(R.id.my_image);

        imageView.setImageResource(images[position]);

        container.addView(view);

        return view;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout)object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((LinearLayout) object);
    }
}
