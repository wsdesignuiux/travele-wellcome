package com.example.wolfsoft3.travello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {


    private ImageView googleplus;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wellcome);


        googleplus=(ImageView)findViewById(R.id.google);




        googleplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(it);
            }
        });





    }
}
