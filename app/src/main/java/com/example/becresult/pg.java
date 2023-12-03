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
public class pg extends AppCompatActivity {
    private CardView first,second,third,fourth,fifth,sixth;
   private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third1);
        fourth=findViewById(R.id.fourth);
        fifth=findViewById(R.id.fifth);
        sixth=findViewById(R.id.sixth);
        send = findViewById(R.id.sendfile);
        final String url8 = "https://drive.google.com/folderview?id=11p7Uy2s8GBM38rnLqiea_cvDhmKhrQ1k";
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url8));
                startActivity(i);
            }
        });
        final String url1 = "https://drive.google.com/folderview?id=11lJU2RMlr5Md09WBR0RV46aLE7e2Z_r1";
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url1));
                startActivity(i);
            }
        });
        final String url2 = "https://drive.google.com/folderview?id=1Imr_eBqF7bWB2XeY8njsPAKbnNZCyj80";
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url2));
                startActivity(i);

            }
        });
        final String url3 = "https://drive.google.com/folderview?id=1InKznvDN5tpVCchl1A-XptSHfFwhtfMP";
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url3));
                startActivity(i);

            }
        });
        final String url4 = "https://drive.google.com/folderview?id=1IqRfcus2hrTLaGs-uCA8eRsj9SK1Pjs3";
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url4));
                startActivity(i);

            }
        });
        final String url5 = "https://drive.google.com/folderview?id=1SVfqBRwVNyr3CN7PPyWBBg7wKJec6kJI";
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url5));
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
        final AlertDialog.Builder alert =  new AlertDialog.Builder( pg.this);
        View mView =getLayoutInflater().inflate(R.layout.dailogsend,null);
        Button whatsapp =(Button)mView.findViewById(R.id.what);
        Button form =(Button)mView.findViewById(R.id.b2);
        alert.setView(mView);
        final  AlertDialog alertDialog =alert.create();
        alertDialog.setCanceledOnTouchOutside(true);
        whatsapp.setText(Html.fromHtml("<a href=\"http://api.whatsapp.com/send?phone=+919740512208&text=hello\"> WhatsApp</a>"));
        whatsapp.setMovementMethod(LinkMovementMethod.getInstance());
        final String url20 = "https://docs.google.com/forms/d/e/1FAIpQLScpjgGS49wVvFl2tWV8RGnIuIukcnZuk0Aw4_tDLINmZB4yww/viewform?usp=pp_url";
        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url20));
                startActivity(i);
            }
        });
       alertDialog.show();
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(pg.this,ugpg.class);
        startActivity(intent);
        finish();
    }
}