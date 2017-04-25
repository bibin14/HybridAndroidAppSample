package com.bibzsoftworkz.hybridandroidappsample;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadNewContent();
    }

    @SuppressLint({ "SetJavaScriptEnabled", "JavascriptInterface" })
    public void LoadNewContent()
    {
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDomStorageEnabled(true);

        //load index.html from the assets folder
        mWebView.loadUrl("file:///android_asset/www/index.html");

        //load a web based URL
        //mWebView.loadUrl("https://github.com/bibin14/HybridAndroidAppSample");


    }
}
