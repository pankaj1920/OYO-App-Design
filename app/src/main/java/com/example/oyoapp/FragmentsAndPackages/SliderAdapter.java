package com.example.oyoapp.FragmentsAndPackages;



import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.example.oyoapp.R;

import java.util.List;

public class SliderAdapter extends PagerAdapter {
    private List<StripFiveModel>sliderModelList;
    private Context context;
    private LayoutInflater layoutInflater;
    private int currentPage=0;
    private int[]img_resource={R.drawable.img1,R.drawable.img3,R.drawable.img3};

    public SliderAdapter(List<StripFiveModel>sliderModelList, Context context) {

        this.sliderModelList = sliderModelList;
        this.context = context;
        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return sliderModelList.size();
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view= LayoutInflater.from(container.getContext()).inflate(R.layout.slider,container,false);
if (currentPage>2)
    currentPage=0;
        ImageView banner=view.findViewById(R.id.image);

        ImageView imageView = new ImageView(context);
       banner.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(img_resource[position]);

        StripFiveModel sliderModel=sliderModelList.get(currentPage);
currentPage++;


        container.addView(view);

        return view;
    }

    @Override
    public boolean isViewFromObject( View view,  Object o) {
        return (view==(LinearLayout)o);

    }

    @Override
    public void destroyItem( ViewGroup container, int position,  Object object) {
        container.removeView((LinearLayout)object);
    }


}
