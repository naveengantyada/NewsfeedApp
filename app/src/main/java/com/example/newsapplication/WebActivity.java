package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView webView = findViewById(R.id.activity_web_wv);

//        AdView adView = new AdView(this);
//        adView=(AdView)findViewById(R.id.adView);
//        AdSize adSize = new AdSize(300, 50);
//        adView.setAdSize(adSize);
//adView.loadAd();
//        adView.setAdUnitId("ca-app-pub-4153042474311534/6087084010");


        final String url = getIntent().getStringExtra("url");

        webView.loadUrl(url);

    }
}