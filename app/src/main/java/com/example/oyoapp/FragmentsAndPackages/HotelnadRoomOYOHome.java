package com.example.oyoapp.FragmentsAndPackages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.oyoapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelnadRoomOYOHome extends Fragment {


    public HotelnadRoomOYOHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hotelnad_room_oyohome, container, false);


        RecyclerView recyclerView=view.findViewById(R.id.recyclehotelandroomfeature);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<RecyclehomeAndRoomFeatureModel> slist=new ArrayList<>();
        slist.add(new RecyclehomeAndRoomFeatureModel(R.drawable.hotel2,"hotel"));
        slist.add(new RecyclehomeAndRoomFeatureModel(R.drawable.hotel2,"hotel"));
        slist.add(new RecyclehomeAndRoomFeatureModel(R.drawable.hotel2,"hotel"));
        slist.add(new RecyclehomeAndRoomFeatureModel(R.drawable.hotel2,"hotel"));

        RecyclerHomeAndRoomfeatureAdapte obj=new RecyclerHomeAndRoomfeatureAdapte(slist);
        recyclerView.setAdapter(obj);


        RecyclerView recyclerviewhomeandroomcities=view.findViewById(R.id.recyclerviewhomeandroomcities);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext());
        recyclerviewhomeandroomcities.setLayoutManager(new GridLayoutManager(getContext(),2,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<HomeAndRoomrecyclerCitiesModel> cities=new ArrayList<>();
        cities.add(new HomeAndRoomrecyclerCitiesModel("Mysore"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Bangalore"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Delhi"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Madikeri"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Madikeri"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Madikeri"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Madikeri"));
        cities.add(new HomeAndRoomrecyclerCitiesModel("Madikeri"));

        HomeAndRoomrecyclercitesAdapter obj2=new HomeAndRoomrecyclercitesAdapter(cities);
        recyclerviewhomeandroomcities.setAdapter(obj2);


        RecyclerView recyclertopratedhome=view.findViewById(R.id.recyclertopratedhome);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getContext());
        layoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclertopratedhome.setLayoutManager(layoutManager3);

        ArrayList<TopRatedHomesRecyclermodel> home =new ArrayList<>();
        home.add(new TopRatedHomesRecyclermodel("Mysore"));
        home.add(new TopRatedHomesRecyclermodel("Bangalore"));
        home.add(new TopRatedHomesRecyclermodel("Delhi"));
        home.add(new TopRatedHomesRecyclermodel("Madikeri"));
        TopRatedHomesRecyclerAdapter obj3=new TopRatedHomesRecyclerAdapter(home);
        recyclertopratedhome.setAdapter(obj3);



        return view;
    }

}
