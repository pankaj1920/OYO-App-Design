package com.example.oyoapp.FragmentsAndPackages;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.RelativeLayout;

import com.example.oyoapp.Activities.BookingFirst;
import com.example.oyoapp.Activities.Bookingsecond;
import com.example.oyoapp.Activities.ExcitingOffersActivity;
import com.example.oyoapp.Activities.HomeHeaderActivity;
import com.example.oyoapp.Activities.InningsActivity;
import com.example.oyoapp.Activities.LimitedPeroidOfferActivity;
import com.example.oyoapp.Activities.ReferAndWin;
import com.example.oyoapp.Activities.WizardActivity;
import com.example.oyoapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private RecyclerView categoryRecyclerview;

    private List<HorizontalModel> horizontalModels;
    private ImageView imageView3;
    RelativeLayout rel;
    ///
    private List<HorizontalModel> sliderModelList;
    private List<HorizontalModel>slidertwoList;
    private ViewPager bannerSliderViewPager,strip,strip2,strip3,strip4;
    private int currentPage = 2;
    private Timer timer;
    final private long DELAY_TIME = 3000;
    final private long PERIOD_TIME = 9000;
    private Handler handler;
    private Runnable update;
    private RecyclerView horizontalRecyclerView;


    private RecyclerView stripTwo;
    private List<StripTwoModel>stripTwoModelList;
    private RecyclerView stripthree;
    private List<StripThreeModel>stripThreeModelList;
    RecyclerView stripFour;
    private List<StripFourModel>strFourList;
    RecyclerView stripFive;
    List <StripFiveModel>strFiveList;
    ImageView oyoiinings,imageoffer;
    CardView card1,card2;
    LinearLayout linear5,linear7;
    FrameLayout frame1;


    RecyclerView stripSix;
    private List<StripEigModel> stripEigList;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_blank, container, false);
        categoryRecyclerview = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        imageView3=view.findViewById(R.id.imageView3);
        LinearLayout linearLayout=view.findViewById(R.id.linear2);
        card1=view.findViewById(R.id.card1);
        card2=view.findViewById(R.id.card2);

        linear5=view.findViewById(R.id.linear5);
        linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getContext(), WizardActivity.class);
                startActivity(intent);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getContext(), Bookingsecond.class);
                startActivity(intent);
            }
        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), BookingFirst.class);
                startActivity(intent);
            }
        });

        oyoiinings=view.findViewById(R.id.oyoiinings);
        oyoiinings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getContext(), InningsActivity.class);
                startActivity(intent);
            }
        });

       linearLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent=new Intent(getContext(), ReferAndWin.class);
               startActivity(intent);
           }
       });

//        /////
        bannerSliderViewPager = view.findViewById(R.id.viewpager);

        sliderModelList = new ArrayList<HorizontalModel>();
        sliderModelList.add(new HorizontalModel(R.drawable.banner2));
        sliderModelList.add(new HorizontalModel(R.drawable.banner2));

        sliderModelList.add(new HorizontalModel(R.drawable.banner5));

        sliderModelList.add(new HorizontalModel(R.drawable.banner4));

        sliderModelList.add(new HorizontalModel(R.drawable.banner7));

       // sliderModelList.add(new HorizontalModel(R.drawable.banner9));



        HorizontalAdapter sliderAdapter = new HorizontalAdapter(sliderModelList);
//        bannerSliderViewPager.setAdapter(sliderAdapter);

//        bannerSliderViewPager.setClipToPadding(false);
//        bannerSliderViewPager.setPageMargin(20);
//  //      bannerSliderViewPager.setCurrentItem(currentPage);
//        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int i, float v, int i1) {
//
//            }
//
//            public void onPageSelected(int i) {
//                currentPage = i;
//            }
//
//
//            @Override
//            public void onPageScrollStateChanged(int i) {
//                if (i == ViewPager.SCROLL_STATE_IDLE) {
//                    pageLooper();
//                }
//            }
//
//        };
//        bannerSliderViewPager.addOnPageChangeListener(onPageChangeListener);
//        startBannerSlideShow();
//        bannerSliderViewPager.setOnTouchListener(new View.OnTouchListener() {
//
//
//            @Override
//
//            public boolean onTouch(View v, MotionEvent event) {
//                pageLooper();
//
//
//                if (event.getAction() == MotionEvent.ACTION_UP) {
//                    startBannerSlideShow();
//                }
//                return false;
//            }
//        });
        ////
        slidertwoList = new ArrayList<HorizontalModel>();
        slidertwoList.add(new HorizontalModel(R.drawable.banner12));

      //  strip=view.findViewById(R.id.viewpager1);
        HorizontalAdapter sliderAdapter1=new HorizontalAdapter(slidertwoList);
//        strip.setAdapter(sliderAdapter1);
        /////
        horizontalRecyclerView=view.findViewById(R.id.recycler_view1);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
      layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);


        horizontalRecyclerView.setLayoutManager(layoutManager1);
        horizontalModels = new ArrayList<>();
        horizontalModels.add(new HorizontalModel(R.drawable.limited1));
        horizontalModels.add(new HorizontalModel(R.drawable.limited2));
        horizontalModels.add(new HorizontalModel(R.drawable.limited3));
        horizontalModels.add(new HorizontalModel(R.drawable.limited4));
        TableAdapter adapter = new TableAdapter(horizontalModels);
        horizontalRecyclerView.setAdapter(adapter);
        //////
    //    strip2=view.findViewById(R.id.viewpager2);
      //  strip2.setAdapter(sliderAdapter);
        /////
        stripTwo=view.findViewById(R.id.recycle1);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        stripTwo.setLayoutManager(mLayoutManager);



        stripTwoModelList = new ArrayList<>();


        HorizontalModel id=sliderModelList.get(currentPage);
        if(id.equals(R.drawable.s)){
            Intent intent =new Intent(getContext(),LimitedPeroidOfferActivity.class);
            startActivity(intent);
        }
        stripTwoModelList.add(new StripTwoModel(R.drawable.hotel1,"HOME","Home stays with "));
        stripTwoModelList.add(new StripTwoModel(R.drawable.hotel1,"HOME","Home stays with "));
        stripTwoModelList.add(new StripTwoModel(R.drawable.hotel1,"HOME","Home stays with "));
        stripTwoModelList.add(new StripTwoModel(R.drawable.hotel1,"HOME","Home stays with "));





        StripTwoAdapter adapter1 = new StripTwoAdapter(stripTwoModelList);
      stripTwo.setAdapter(adapter1);
      //////
        stripthree=view.findViewById(R.id.recycler_view2);
        LinearLayoutManager sLayoutManager = new LinearLayoutManager(getContext());
sLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        stripthree.setLayoutManager(sLayoutManager);
        stripThreeModelList = new ArrayList<>();
        stripThreeModelList.add(new StripThreeModel(R.drawable.hotel1,"View TnC"));
        stripThreeModelList.add(new StripThreeModel(R.drawable.hotel1,"View TnC"));
        stripThreeModelList.add(new StripThreeModel(R.drawable.hotel1,"View TnC"));
        stripThreeModelList.add(new StripThreeModel(R.drawable.hotel1,"View TnC"));
        StripThreeAdapter adapter2 = new StripThreeAdapter(stripThreeModelList);
        stripthree.setAdapter(adapter2);
///////
        stripFour=view.findViewById(R.id.recycler_view3);
        LinearLayoutManager sLayoutManager1 = new LinearLayoutManager(getActivity());
        sLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
     /*   stripFour.setLayoutManager(sLayoutManager1);
        strFourList = new ArrayList<>();
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        strFourList.add(new StripFourModel(R.drawable.img4,"Forts"));
        StripFourAdapter adapter3 = new StripFourAdapter(strFourList);
        stripFour.setAdapter(adapter3);*/
        /////
        stripFive=view.findViewById(R.id.recycler_view4);
        LinearLayoutManager sLayoutManager2 = new LinearLayoutManager(getContext());
        sLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
      /*  stripFive.setLayoutManager(sLayoutManager2);
        strFiveList=new ArrayList<>();
       strFiveList.add(new StripFiveModel(R.drawable.img3,"Book Your Meal"));
        strFiveList.add(new StripFiveModel(R.drawable.img3,"Book Your Meal"));
        strFiveList.add(new StripFiveModel(R.drawable.img3,"Book Your Meal"));
        strFiveList.add(new StripFiveModel(R.drawable.img3,"Book Your Meal"));
        strFiveList.add(new StripFiveModel(R.drawable.img3,"Book Your Meal"));
        strFiveList.add(new StripFiveModel(R.drawable.img3,"Book Your Meal"));
        StripSixAdapter adapter4 = new StripSixAdapter(strFiveList);
        stripFive.setAdapter(adapter4);*/


strip2 = view.findViewById(R.id.viewpager3);
      //  strip2.setAdapter(sliderAdapter);

stripSix=view.findViewById(R.id.recycler_view5);
        LinearLayoutManager sLayoutManager3 = new LinearLayoutManager(getActivity());
        sLayoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        stripEigList=new ArrayList<>();
        stripSix.setLayoutManager(sLayoutManager3);
        stripEigList.add(new StripEigModel(R.drawable.hills,"Beaches"));
        stripEigList.add(new StripEigModel(R.drawable.beachside,"Hills"));
        stripEigList.add(new StripEigModel(R.drawable.fort,"Forts"));
StripEigAdapter adapter5=new StripEigAdapter(stripEigList);
stripSix.setAdapter(adapter5);


        strip3 = view.findViewById(R.id.viewpager5);
       // strip3.setAdapter(sliderAdapter);
        strip4=view.findViewById(R.id.viewpager6);
        strip4.setAdapter(sliderAdapter);

//        Explore OYo hotels and rooms

// Category item
        RecyclerView recycle1=view.findViewById(R.id.recycle1);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        ArrayList<StripFourModel> slist=new ArrayList<>();
        slist.add(new StripFourModel("hotel"));
        slist.add(new StripFourModel("hotel"));
        slist.add(new StripFourModel("hotel"));
        slist.add(new StripFourModel("hotel"));

        StripFourAdapter obj=new StripFourAdapter(slist);
        recycle1.setAdapter(obj);




//Explore Oyo hotels and rooms

        // Category item
     RecyclerView recyclerView =view.findViewById(R.id.recycler_view);
     LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(getContext());
     recyclerView.setLayoutManager(layoutManager);

      ArrayList<Categorymodel> category= new ArrayList<>();
      category.add(new Categorymodel("Maharastra",R.drawable.bg1));
      category.add(new Categorymodel("Mumbai",R.drawable.bg2));
      category.add(new Categorymodel("Delhi",R.drawable.bg3));
      category.add(new Categorymodel("Chennai",R.drawable.bg4));
      category.add(new Categorymodel("Kashi",R.drawable.bg5));
      category.add(new Categorymodel("Mysore",R.drawable.bg6));
      category.add(new Categorymodel("Hydrabad",R.drawable.bg7));
      category.add(new Categorymodel("Rajasthan",R.drawable.bg8));
      category.add(new Categorymodel("Bangalore",R.drawable.bg9));

      CategoryAdapter cat=new CategoryAdapter(category);
      recyclerView.setAdapter(cat);
// Category item
        return view;
    }

    private void pageLooper() {
        if (currentPage == sliderModelList.size() - 2 ){
            currentPage = 2;
            bannerSliderViewPager.setCurrentItem(currentPage, false);
        }

        if (currentPage ==1){
            currentPage = sliderModelList.size()-3 ;
            bannerSliderViewPager.setCurrentItem(currentPage, false);
        }
    }
    private void startBannerSlideShow() {
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            public void run() {
                if (currentPage >= sliderModelList.size()) {
                    currentPage = 1;
                }
                bannerSliderViewPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);


            }
        }, DELAY_TIME, PERIOD_TIME);
    }


}
