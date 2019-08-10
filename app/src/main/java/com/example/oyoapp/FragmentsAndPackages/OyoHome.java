package com.example.oyoapp.FragmentsAndPackages;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.oyoapp.Activities.HomeHeaderActivity;
import com.example.oyoapp.Activities.NotificationActrivity;
import com.example.oyoapp.Activities.WizardActivity;
import com.example.oyoapp.R;

public class OyoHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private FrameLayout frameLayout;
    RelativeLayout relativeLayout;
    BottomNavigationView navigationView;
    private Menu menu;
    CollapsingToolbarLayout collapseToolbar;
    ImageView imgnotification;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyo_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener( navlisner);

        collapseToolbar = findViewById(R.id.collapseToolbar);

        imgnotification = findViewById(R.id.imgnotification);

        imgnotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OyoHome.this, NotificationActrivity.class);
                startActivity(intent);
            }
        });

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.logo);
        Palette.generateAsync(bitmap,
                new Palette.PaletteAsyncListener() {
                    @Override
                    public void onGenerated(Palette palette) {
                        Palette.Swatch vibrant =
                                palette.getVibrantSwatch();
                        int mutedColor = palette.getVibrantSwatch().getRgb();
                        if (vibrant != null) {
                            // If we have a vibrant color
                            // update the title TextView
                            collapseToolbar.setBackgroundColor(mutedColor);
                            //  mutedColor = palette.getMutedColor(R.attr.colorPrimary);
                            collapseToolbar.setStatusBarScrimColor(palette.getDarkMutedColor(mutedColor));
                            collapseToolbar.setContentScrimColor(palette.getMutedColor(mutedColor));

                        }
                    }
                });


        relativeLayout = findViewById(R.id.rel);

        frameLayout = findViewById(R.id.main_frame);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);


        navigationView.setNavigationItemSelectedListener(this);
        setFragment(new BlankFragment());

        View headerview = navigationView.getHeaderView(0);
        ConstraintLayout profilename = headerview.findViewById(R.id.rel);


        final ConstraintLayout header = (ConstraintLayout) headerview.findViewById(R.id.rel);
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Profile();
                FragmentTransaction ts = getSupportFragmentManager().beginTransaction();
                ts.replace(R.id.main_frame, fragment);
                ts.commit();
                drawer.closeDrawer(GravityCompat.START);
            }
        });

        final RelativeLayout header2 = (RelativeLayout) headerview.findViewById(R.id.rel2);
        header2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OyoHome.this, WizardActivity.class);
                startActivity(intent);
                drawer.closeDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.menu = menu;
        getMenuInflater().inflate(R.menu.oyo_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.nav_camera) {
            return true;
        }

        if (id == R.id.nav_camera) {
            menu.getItem(0).setIcon(getResources().getDrawable(R.drawable.paytm));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        gotoFragment(new OyoMoney());

        if (id == R.id.nav_camera) {


        } else if (id == R.id.nav_gallery) {
            gotoFragment(new AllWallets());

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        }// else if (id == R.id.nav_share) {

       // } else if (id == R.id.nav_send) {

       // }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void gotoFragment(Fragment fragment) {

        getSupportActionBar().setDisplayShowTitleEnabled(true);

//        getSupportActionBar().setTitle(title);
        invalidateOptionsMenu();
        setFragment(fragment);

    }

    private void setFragment(Fragment fragment) {


        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlisner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;

            switch (menuItem.getItemId()) {
                case R.id.one:
                    fragment=new BlankFragment();
                    break;
                case R.id.two:
                    fragment=new savedFragment();
                    break;
                case R.id.three:
                    fragment=new BookingFragment();
                    break;
                case R.id.four:
                    fragment=new InviteAndEarn();
                    break;
            }

            FragmentTransaction ts=getSupportFragmentManager().beginTransaction();
            ts.replace(R.id.main_frame,fragment);
            ts.commit();
            return  true;

        }
    };
}

