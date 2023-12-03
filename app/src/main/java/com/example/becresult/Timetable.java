package com.example.becresult;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Timetable extends AppCompatActivity {
     Spinner Spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9, spinner10;

    DatabaseReference databaseReference;
    List<String> semesters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        Spinner1 = (Spinner) findViewById(R.id.ed1);
        semesters = new ArrayList<>();

        databaseReference = FirebaseDatabase.getInstance().getReference();
        //initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set add detail selected
        bottomNavigationView.setSelectedItemId(R.id.add_details);

        //perform item selectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.view_details:
                        startActivity(new Intent(getApplicationContext(), view_details.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.add_details:
                        return true;
                }
                return false;
            }
        });

        databaseReference.child("Spinner").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot childSnapshot : dataSnapshot.getChildren()) {
                    String spinnerName = childSnapshot.child("sem").getValue(String.class);
                    semesters.add(spinnerName);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Timetable.this, android.R.layout.simple_spinner_item, semesters);
                arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                Spinner1.setAdapter(arrayAdapter);

            }
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String text = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }

            /*public void onItemSelected(AdapterView<?> parent, View view, int pos,
                                       long id) {
                String item = parent.getItemAtPosition(pos).toString();

                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
            }*/
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }

        });
    }
}