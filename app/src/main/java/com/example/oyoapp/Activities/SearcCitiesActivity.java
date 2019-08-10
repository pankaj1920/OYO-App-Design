package com.example.oyoapp.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.oyoapp.FragmentsAndPackages.CollectionrecyclerModel;
import com.example.oyoapp.FragmentsAndPackages.RecyclerTopCityModel;
import com.example.oyoapp.FragmentsAndPackages.RecyclerTopCityModelAdapter;
import com.example.oyoapp.FragmentsAndPackages.StripEigAdapter;
import com.example.oyoapp.FragmentsAndPackages.StripEigModel;
import com.example.oyoapp.R;

import java.util.ArrayList;

public class SearcCitiesActivity extends AppCompatActivity {
RecyclerView recyclerView;
LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searc_cities);

        recyclerView=findViewById(R.id.recyclertopcity);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(linearLayoutManager);

      ArrayList<RecyclerTopCityModel> slist =new ArrayList<>();

        slist.add(new RecyclerTopCityModel("banglare"));
        slist.add(new RecyclerTopCityModel("Delhi"));
        slist.add(new RecyclerTopCityModel("Hydrabad"));
        RecyclerTopCityModelAdapter obj =new RecyclerTopCityModelAdapter(slist);
        recyclerView.setAdapter(obj);


    }
}