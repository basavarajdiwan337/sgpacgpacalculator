package com.example.becresult;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class webresult extends AppCompatActivity {
    private WebView WebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webresult);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#D5143FBE"));
        actionBar.setBackgroundDrawable(colorDrawable);
        WebView = findViewById(R.id.WebView);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://becbgk.edu/ug_result.php");

        WebView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);

        WebSettings ws = WebView.getSettings();
        ws.setJavaScriptEnabled(true);
        WebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        WebView.clearCache(true);
        WebView.clearHistory();
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.getSettings().setLoadWithOverviewMode(true);
        WebView.getSettings().setUseWideViewPort(true);

        WebView.getSettings().setSupportZoom(true);
        WebView.getSettings().setBuiltInZoomControls(true);
        WebView.getSettings().setDisplayZoomControls(false);

        WebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        WebView.setScrollbarFadingEnabled(false);

        WebView.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                Toast.makeText(webresult.this,"Downloading....", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(webresult.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
