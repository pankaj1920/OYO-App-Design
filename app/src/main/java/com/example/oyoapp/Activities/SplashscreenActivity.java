package com.example.oyoapp.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.oyoapp.FragmentsAndPackages.MainFragment;
import com.example.oyoapp.FragmentsAndPackages.OyoHome;
import com.example.oyoapp.R;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        /** Duration of wait **/
       final int SPLASH_DISPLAY_LENGTH = 1000;

        /** Called when the activity is first created. */

            /* New Handler to start the Menu-Activity
             * and close this Splash-Screen after some seconds.*/
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    /* Create an Intent that will start the Menu-Activity. */
                    Intent mainIntent = new Intent(SplashscreenActivity.this, MainActivity.class);
                    SplashscreenActivity.this.startActivity(mainIntent);
                  finish();
                }
            }, SPLASH_DISPLAY_LENGTH);
    }
}
