package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ugpg extends AppCompatActivity {
    private CardView first,second;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugpg);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ugpg.this,ug.class);
                startActivity(intent);
                finish();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ugpg.this,pg.class);
                startActivity(intent);
                finish();
            }
        });

    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

      public void onBackPressed() {
            super.onBackPressed();
            Intent intent = new Intent(ugpg.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

}
