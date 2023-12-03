package com.example.becresult;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class view_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set add detail selected
        bottomNavigationView.setSelectedItemId(R.id.view_details);

        //perform item selectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.add_details:
                        startActivity(new Intent(getApplicationContext(),Timetable.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.view_details:
                        return true;
                }
                return false;
            }
        });
    }
}