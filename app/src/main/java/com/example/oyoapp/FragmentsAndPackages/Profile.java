package com.example.oyoapp.FragmentsAndPackages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.oyoapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Profile extends Fragment {
    public Profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_profile, container, false);



         return view;



    }




    }
