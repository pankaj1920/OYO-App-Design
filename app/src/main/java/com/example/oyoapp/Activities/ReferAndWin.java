package com.example.oyoapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.oyoapp.R;

public class ReferAndWin extends AppCompatActivity {
 ImageView imgquestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer_and_win);
        imgquestion=findViewById(R.id.imgquestion);

        imgquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ReferAndWin.this,FAQActivity.class);
                startActivity(intent);
            }
        });
    }
}
