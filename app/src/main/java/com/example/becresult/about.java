package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class about extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);





    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(about.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
