package com.example.oyoapp.FragmentsAndPackages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyoapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeandRoomCollection extends Fragment {


    public HomeandRoomCollection() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_homeand_room_collection, container, false);

        RecyclerView recyclerviewhomeandroomcities=view.findViewById(R.id.recyclerviewhomeandroomcollectioncity);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerviewhomeandroomcities.setLayoutManager(new GridLayoutManager(getContext(),2,LinearLayoutManager.HORIZONTAL,false));

        ArrayList<CollectionrecyclerModel> cities=new ArrayList<>();
        cities.add(new CollectionrecyclerModel("Mysore"));
        cities.add(new CollectionrecyclerModel("Bangalore"));
        cities.add(new CollectionrecyclerModel("Delhi"));
        cities.add(new CollectionrecyclerModel("Madikeri"));
        cities.add(new CollectionrecyclerModel("Madikeri"));
        cities.add(new CollectionrecyclerModel("Madikeri"));
        cities.add(new CollectionrecyclerModel("Madikeri"));
        cities.add(new CollectionrecyclerModel("Madikeri"));

        HomeandRoomsCollectionrecyclerAdapter obj=new HomeandRoomsCollectionrecyclerAdapter(cities);
        recyclerviewhomeandroomcities.setAdapter(obj);


        RecyclerView recyclertopratedhome=view.findViewById(R.id.recyclertrending);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getContext());
        layoutManager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclertopratedhome.setLayoutManager(layoutManager3);

        ArrayList<CollectionTrendingmodel> home =new ArrayList<>();
        home.add(new CollectionTrendingmodel("Mysore"));
        home.add(new CollectionTrendingmodel("Bangalore"));
        home.add(new CollectionTrendingmodel("Delhi"));
        home.add(new CollectionTrendingmodel("Madikeri"));
        CollectionTrendingAdapter obj1=new CollectionTrendingAdapter(home);
        recyclertopratedhome.setAdapter(obj1);


        return view;
    }

}
