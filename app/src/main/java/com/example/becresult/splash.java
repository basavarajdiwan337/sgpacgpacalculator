package com.example.becresult;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;


public class splash extends AppCompatActivity {
    ProgressBar bar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        bar=findViewById(R.id.pbar);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // This method will be executed once the timer is over

                Intent i;
                i = new Intent(splash.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 2000);

    }
}