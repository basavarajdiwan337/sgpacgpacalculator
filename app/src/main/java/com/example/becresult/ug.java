package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ug extends AppCompatActivity {
    private CardView first,second,third,fourth,fifth,sixth,seven,eight,nine,ten;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);


        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        seven = findViewById(R.id.seven);
        fifth = findViewById(R.id.fifth);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        sixth = findViewById(R.id.sixth);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        send =  findViewById(R.id.sendfile);
        final String url = "https://drive.google.com/drive/u/2/folders/13KtGep3uSw-7c9uUXL7pf9sJ_Okoh1ql";
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        final String url1 = "https://drive.google.com/folderview?id=1-OhxJP0ScFI1NUh-aAoUN2IZWC3MJfIp";
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url1));
                startActivity(i);

            }
        });

        final String url2 = "https://drive.google.com/folderview?id=119ZqmEl2ciZGmQCW2EC_sUeKtxNDByba";
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url2));
                startActivity(i);

            }
        });

        final String url3 = "https://drive.google.com/folderview?id=1-cC_z8MJ5bnG0GHAu9E4LYmNcr06VbS9";
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url3));
                startActivity(i);

            }
        });

        final String url4 = "https://drive.google.com/folderview?id=1CCUgYzKkqHCczPsn04rt9ubIgazFbDkl";
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url4));
                startActivity(i);

            }
        });

        final String url5 = "https://drive.google.com/folderview?id=1AzRo_p7vPZAQfhC3PG1GlCepzjhiECcU";
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url5));
                startActivity(i);

            }
        });

        final String url6 = "https://drive.google.com/folderview?id=117KrXC6kt4wUZYnHq8csgVMAFnZJw8IZ";
                seven.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url6));
                startActivity(i);

            }
        });

        final String url7 = "https://drive.google.com/folderview?id=10vv_smMOdu_HjSrBfvRCh0aroQap73_y";
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url7));
                startActivity(i);

            }
        });

        final String url8 = "https://drive.google.com/folderview?id=11z_mJyRhHmLgoYdfJl1xV5E1Co5ecMBv";
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url8));
                startActivity(i);

            }
        });
        final String url9 = "https://drive.google.com/folderview?id=11vZtbh35ZZhEWbvkRGCbXc8d-pybWLat";
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url9));
                startActivity(i);

            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_showdailog();
            }
        });

    }
    public  void btn_showdailog(){
        final AlertDialog.Builder alert =  new AlertDialog.Builder( ug.this);
        View mView =getLayoutInflater().inflate(R.layout.dailogsend,null);
        Button whatsapp =(Button)mView.findViewById(R.id.what);
      Button form =(Button)mView.findViewById(R.id.b2);
        alert.setView(mView);
        final  AlertDialog alertDialog =alert.create();
        alertDialog.setCanceledOnTouchOutside(true);

        final String url20 = "https://docs.google.com/forms/d/e/1FAIpQLScpjgGS49wVvFl2tWV8RGnIuIukcnZuk0Aw4_tDLINmZB4yww/viewform?usp=pp_url";
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url20));
                startActivity(i);

            }
        });
        whatsapp.setText(Html.fromHtml("<a href=\"http://api.whatsapp.com/send?phone=+919740512208&text=sub name= ?  brach= ?  sem= ?\">WhatsApp</a>"));
        whatsapp.setMovementMethod(LinkMovementMethod.getInstance());
        alertDialog.show();
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(ug.this,ugpg.class);
        startActivity(intent);
        finish();

    }
}
