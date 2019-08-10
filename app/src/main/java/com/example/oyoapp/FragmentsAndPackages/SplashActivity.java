package com.example.oyoapp.FragmentsAndPackages;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.oyoapp.Activities.MainActivity;
import com.example.oyoapp.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        SystemClock.sleep(1000);
        Intent intent=new Intent(SplashActivity.this, OyoHome.class);
        startActivity(intent);
     finish();
    }
}
