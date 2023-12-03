package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class contactus extends AppCompatActivity {
    private TextView gmail;
    private ImageView instagram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        gmail = findViewById(R.id.third);
        instagram = findViewById(R.id.insta);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);

        final String url = "https://www.instagram.com/basavaraj_diwan?r=nametag";
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        gmail.setText(Html.fromHtml("<a href=\"mailto:brightbecian@gmail.com\"> Email: brightbecian@gmail.com</a>"));
        gmail.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(contactus.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

   /* public void btn_showdailog(View view) {
        Uri uri = Uri.parse("smsto:" + "9845773989");
        Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
        intent.setPackage("com.gbwhatsapp");
        startActivity(intent);*/
    }