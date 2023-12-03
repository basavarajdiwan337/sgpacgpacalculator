package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {

    private CardView first,second,third,fourth,fifth,sixth,seven;
    private long backPressedTime;
    private Toast backToast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.c3);
        fourth = findViewById(R.id.c4);
        fifth = findViewById(R.id.c5);
        sixth = findViewById(R.id.c6);
        seven = findViewById(R.id.c7);



        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,sgpa_calculation.class);
                startActivity(intent);
                finish();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,cgpa_calculation.class);
                startActivity(intent);
                finish();
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,webplacement.class);
                startActivity(intent);
                finish();
            }
        });

        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,bookcse.class);
                startActivity(intent);
                finish();
            }
        });

        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,webresult.class);
                startActivity(intent);
                finish();
            }
        });

        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ugpg.class);
                startActivity(intent);
                finish();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Timetable.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mynewmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id){
            case R.id.about:
                Intent intent = new Intent(MainActivity.this,about.class);
                startActivity(intent);
                finish();
                break;
            case R.id.contact:
                Intent intent1 = new Intent(MainActivity.this,contactus.class);
                startActivity(intent1);
                finish();

                break;
            case R.id.mShare:
                Intent a = new Intent(Intent.ACTION_SEND);

                //this is to get the app link in the playstore without launching your app.
                final String appPackageName = getApplicationContext().getPackageName();
                String strAppLink = "";

                try
                {
                    strAppLink = "https://drive.google.com/folderview?id=1YL3tHD0oIrt0bigGUeRdvBguf8U8vpbq";
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    strAppLink = "https://drive.google.com/folderview?id=1YL3tHD0oIrt0bigGUeRdvBguf8U8vpbq";
                }
                // this is the sharing part
                a.setType("text/link");
                String shareBody = "Hey! download BECians App." +
                        "\n"+""+strAppLink;
                String shareSub = "BEC BRIGHT";
                a.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                a.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(a, "Share Using"));
                break;
            }
            return true;
        }
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }


}
