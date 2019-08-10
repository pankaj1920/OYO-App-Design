package com.example.oyoapp.Activities;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.oyoapp.FragmentsAndPackages.HomeandRoomCollection;
import com.example.oyoapp.FragmentsAndPackages.HotelnadRoomOYOHome;
import com.example.oyoapp.R;

import java.util.ArrayList;

public class HotelAndRoomsActivity extends AppCompatActivity {
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_and_rooms);
        toolbar = findViewById(R.id.toolprofile);
        setSupportActionBar(toolbar);
        toolbar.setTitle("OYO hotel and homes");
        ViewPager view_pager = findViewById(R.id.vp);
        TabLayout tab = findViewById(R.id.tabL);
        tab.setupWithViewPager(view_pager);
        VpAdapter asd = new VpAdapter(getSupportFragmentManager());
        asd.addFr(new HotelnadRoomOYOHome(), "OYO Home");
        asd.addFr(new HomeandRoomCollection(), "Collection");
        view_pager.setAdapter(asd);
    }

    class VpAdapter extends FragmentPagerAdapter {

        ArrayList<Fragment> fglist;
        ArrayList<String> titles;

        public VpAdapter(FragmentManager fm) {
            super(fm);
            fglist = new ArrayList<>();
            titles = new ArrayList<>();
        }
        public Fragment getItem(int i) {
            return fglist.get(i);

        }
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {

            return titles.get(position);
        }

        @Override
        public int getCount()
        {
            return fglist.size();
        }

        public void addFr(Fragment af, String title) {
            fglist.add(af);
            titles.add(title);
        }
    }

}

