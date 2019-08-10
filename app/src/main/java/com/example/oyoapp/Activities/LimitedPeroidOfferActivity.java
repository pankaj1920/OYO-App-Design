package com.example.oyoapp.Activities;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.oyoapp.FragmentsAndPackages.BlankFragment;
import com.example.oyoapp.R;

public class LimitedPeroidOfferActivity extends AppCompatActivity {
ImageView imgback;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limited_peroid_offer);

        imgback=findViewById(R.id.imgback);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadintent();
            }
        });


    }

    public void loadintent(){

        Fragment fragment=new BlankFragment();
        FragmentTransaction ts = getSupportFragmentManager().beginTransaction();
        ts.replace(R.id.frame2,fragment);
        ts.commit();
    }
}
