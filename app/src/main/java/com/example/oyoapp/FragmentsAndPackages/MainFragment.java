package com.example.oyoapp.FragmentsAndPackages;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.oyoapp.Activities.MainActivity;
import com.example.oyoapp.R;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment<timer> extends Fragment {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    EditText editText;
    private static final Integer[] IMAGES = {R.drawable.img1, R.drawable.img3, R.drawable.img4};
    String[] TITLE = {"every oyo comes with wifi,ac,tv,spotless linen and a clean washroom", "south asia's largest hotel chain 10 countries 7000+ hotels and homes",
            "every oyo comes with wifi,ac,tv,spotless linen and a clean washroom"

    };
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();
    private ArrayList<String> Title = new ArrayList<String>();
    private LinearLayout dotscontain;
    private int custom_position = 0;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mPager = view.findViewById(R.id.pager);

        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new RemindTask(),5000,5000);

        editText = view.findViewById(R.id.editText);
        ImageButton ibTest = view.findViewById(R.id.ibTest);
        ibTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OyoHome.class);
                startActivity(intent);
            }
        });
        dotscontain = view.findViewById(R.id.linear1);
        prepareDots(custom_position++);
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (custom_position > 2)
                    custom_position = 0;
                prepareDots(custom_position++);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        init();
        return view;

    }

    private void init() {
        for (int i = 0; i < IMAGES.length; i++) {
            ImagesArray.add(IMAGES[i]);
            Title.add(TITLE[i]);
        }


        mPager.setAdapter(new SlidingImage_Adapter(getContext(), ImagesArray, Title));


        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius


        NUM_PAGES = IMAGES.length;

        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();


    }

    private void prepareDots(int currentslide) {
        if (dotscontain.getChildCount() > 0) {
            dotscontain.removeAllViews();
        }
        ImageView dots[] = new ImageView[4];
        for (int i = 0; i <= 2; i++) {
            dots[i] = new ImageView(getContext());
            if (i == currentslide) {
                dots[i].setImageDrawable(getActivity().getDrawable(R.drawable.active_bar));
            } else {
                dots[i].setImageDrawable(getActivity().getDrawable(R.drawable.inactive_bars));


            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(3, 3, 3, 3);
            dotscontain.addView(dots[i], layoutParams);
        }

    }



    private class RemindTask extends TimerTask {


        @Override
        public void run() {

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(mPager.getCurrentItem()==0){
                        mPager.setCurrentItem(1);
                    }
                    else if(mPager.getCurrentItem()==1){
                        mPager.setCurrentItem(2);
                    }
                    else
                        mPager.setCurrentItem(0);

                }
            });

        }

        }

}