package com.example.becresult;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class webplacement extends AppCompatActivity {
    private android.webkit.WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webplacement);
        WebView = findViewById(R.id.WebView);
        WebView.setWebViewClient(new WebViewClient());
        WebView.loadUrl("https://drive.google.com/folderview?id=1oQhJoujkuhpqKeHOJ6mTO_ec4CYSXU38");

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
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(webplacement.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
