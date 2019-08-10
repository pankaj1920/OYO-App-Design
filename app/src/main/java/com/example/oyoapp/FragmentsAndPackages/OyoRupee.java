package com.example.oyoapp.FragmentsAndPackages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oyoapp.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OyoRupee extends Fragment {


    public OyoRupee() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_oyo_rupee, container, false);
    }

}
