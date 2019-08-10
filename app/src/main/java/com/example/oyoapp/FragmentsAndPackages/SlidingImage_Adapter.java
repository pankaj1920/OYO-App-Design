package com.example.oyoapp.FragmentsAndPackages;



import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oyoapp.R;
import com.jgabrielfreitas.core.BlurImageView;

import java.util.ArrayList;


public class SlidingImage_Adapter extends PagerAdapter {


    private ArrayList<Integer> IMAGES;
    private LayoutInflater inflater;
    private Context context;
private ArrayList<String>TITLE;

    public SlidingImage_Adapter(Context context,ArrayList<Integer> IMAGES,ArrayList<String> TITLE) {
        this.context = context;
        this.IMAGES=IMAGES;
        this.TITLE=TITLE;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return IMAGES.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View imageLayout = inflater.inflate(R.layout.slider, view, false);

        assert imageLayout != null;
        final BlurImageView imageView =  imageLayout
                .findViewById(R.id.image);
        imageView.setBlur(19);
        TextView title=imageLayout.findViewById(R.id.title);

        imageView.setImageResource(IMAGES.get(position));
        title.setText(TITLE.get(position));

        view.addView(imageLayout, 0);

        return imageLayout;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }


}
