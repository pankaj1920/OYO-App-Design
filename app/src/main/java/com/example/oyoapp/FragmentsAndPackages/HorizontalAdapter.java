package com.example.oyoapp.FragmentsAndPackages;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.oyoapp.R;

import java.util.List;

public class HorizontalAdapter extends PagerAdapter {
    public List<HorizontalModel>sliderModelList;
    public HorizontalAdapter(List<HorizontalModel>slideModelList)
    {this.sliderModelList=slideModelList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view=LayoutInflater.from(container.getContext()).inflate(R.layout.horizontal_layout,container,false);

        ImageView banner= view.findViewById(R.id.imageView2);
        banner.setImageResource(sliderModelList.get(position).getLink());
        container.addView(view,0);

        return view;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
       return view==object;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return sliderModelList.size();
 }
}