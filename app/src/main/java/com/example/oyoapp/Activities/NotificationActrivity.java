package com.example.oyoapp.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.oyoapp.FragmentsAndPackages.BlankFragment;
import com.example.oyoapp.FragmentsAndPackages.TableAdapter;
import com.example.oyoapp.FragmentsAndPackages.TableAdapter.ViewHolder;
import com.example.oyoapp.R;

public class NotificationActrivity extends AppCompatActivity {
ImageView imagespread,backarrow;
FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_actrivity);
        imagespread=findViewById(R.id.imagespread);
        backarrow=findViewById(R.id.backarrow);
        frameLayout=findViewById(R.id.main_frame);

        backarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        imagespread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(NotificationActrivity.this,ReferAndWin.class);
                startActivity(intent);
            }
        });

    }


}
