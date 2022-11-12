package com.example.sight;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView= (WebView) findViewById(R.id.webViewId);

        WebSettings webSettings= webView.getSettings();

        //
        webSettings.setJavaScriptEnabled(true);
        //webSettings.

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://cseaasust.org/");

    }
}
