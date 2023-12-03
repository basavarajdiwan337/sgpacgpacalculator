package com.example.becresult;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class bookcse extends AppCompatActivity {
    private Button bt1,bt2,bt3,bt4,bt5,bt6;
    FirebaseStorage firebaseStorage;
    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookcse);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);

        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download2();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download3();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download4();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download5();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                download6();
            }
        });
    }

    private void download() {
        storageReference = firebaseStorage.getInstance().getReference();
        StorageReference ref = storageReference.child("C programs.pdf");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url = uri.toString();
                DownloadFiles(bookcse.this, "C programs", ".pdf", DIRECTORY_DOWNLOADS, url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
    private void download2() {
        storageReference = firebaseStorage.getInstance().getReference();
        StorageReference ref2 = storageReference.child("C++.pdf");

        ref2.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess (Uri uri){
                String url=uri.toString();
                DownloadFiles(bookcse.this, "C++",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }

    private void download3() {
        storageReference = firebaseStorage.getInstance().getReference();
        StorageReference ref3 = storageReference.child("Java.pdf");
        ref3.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess (Uri uri){
                String url=uri.toString();
                DownloadFiles(bookcse.this, "Java",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }

    private void download4() {
        storageReference = firebaseStorage.getInstance().getReference();
        StorageReference ref4 = storageReference.child("Python.pdf");
        ref4.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess (Uri uri){
                String url=uri.toString();
                DownloadFiles(bookcse.this, "Python",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }
    private void download5() {
        storageReference = firebaseStorage.getInstance().getReference();
        StorageReference ref5 = storageReference.child("Php.pdf");
        ref5.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess (Uri uri){
                String url=uri.toString();
                DownloadFiles(bookcse.this, "Php",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
        }
    private void download6() {
        storageReference = firebaseStorage.getInstance().getReference();
        StorageReference ref6 = storageReference.child("java2.pdf");
        ref6.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess (Uri uri){
                String url=uri.toString();
                DownloadFiles(bookcse.this, "java2",".pdf",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener(){
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }

    public void DownloadFiles(Context context,String fileName, String fileExtension, String destinationDirectory, String url) {
        DownloadManager downloadManager = (DownloadManager) context.
                getSystemService(context.DOWNLOAD_SERVICE);
        Uri uri =Uri.parse(url);
        DownloadManager.Request req= new DownloadManager.Request(Uri.parse(url));

        req.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        req.setDestinationInExternalFilesDir(context,destinationDirectory, fileName + fileExtension);
        DownloadManager dm = (DownloadManager)getSystemService(DOWNLOAD_SERVICE);
        dm.enqueue(req);

        Toast.makeText(bookcse.this,"Downloading....", Toast.LENGTH_SHORT).show();
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(bookcse.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

}

