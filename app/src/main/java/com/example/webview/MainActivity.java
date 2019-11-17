package com.example.webview;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = (WebView) findViewById(R.id.webview);
     //   WebSettings webSettings = webview.getSettings();
       // webSettings.setJavaScriptEnabled(true);
      //  WebViewImplement webViewClient = new WebViewImplement(this);
     //   webview.setWebViewClient(webViewClient);
        //If app want to show with url
        webview.loadUrl("https://www.journaldev.com");

        //If app want to show with html tag
        //webview.loadData("<html><body>Hello, world!</body></html>","text/html", "UTF-8");

    }
}
