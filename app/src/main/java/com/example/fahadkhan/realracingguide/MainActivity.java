package com.example.fahadkhan.realracingguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;

public class MainActivity extends AppCompatActivity {

    public  static String url;
    Button button,button1,button2,button3,button4,button5,button6;

    AdView fbAdView;
    public static InterstitialAd fbInterstitialAd, fbInterstitialAd2;

    @Override
    protected void onDestroy() {
        fbInterstitialAd.destroy();
        fbInterstitialAd2.destroy();
        fbAdView.destroy();
        super.onDestroy();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.image_button1);
        button1=(Button)findViewById(R.id.image_button2);
        button2=(Button)findViewById(R.id.image_button3);
        button3=(Button)findViewById(R.id.image_button4);
        button4=(Button)findViewById(R.id.image_button5);
        button5=(Button)findViewById(R.id.image_button6);
        button6=(Button)findViewById(R.id.image_button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://realracing3.9game.com/guide/news-83442.html";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="https://en.wikipedia.org/wiki/Doodle_Jump";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://www.gamerevolution.com/cheats/doodle-jump";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://www.getpcdownload.com/doodle-jump-pc-download/";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url="http://appcheaters.com/doodle-jump-race-cheats-tricks/";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://www.wikihow.com/Be-Good-at-Doodle-Jump";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url="http://www.ehow.com/how_8674008_play-doodle-jump.html";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                fbInterstitialAd.show();
            }
        });

        RelativeLayout adViewContainer = (RelativeLayout) findViewById(R.id.adViewContainer);
        fbAdView = new com.facebook.ads.AdView(this, "1568007433496063_1568007756829364", AdSize.BANNER_HEIGHT_50);
        adViewContainer.addView(fbAdView);
        fbAdView.loadAd();

        fbInterstitialAd = new com.facebook.ads.InterstitialAd(this, "1568007433496063_1568469900116483");
        fbInterstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                fbInterstitialAd.loadAd();
            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }
        });
        fbInterstitialAd.loadAd();



        fbInterstitialAd2 = new com.facebook.ads.InterstitialAd(this, "1568007433496063_1568469900116483");
        fbInterstitialAd2.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                MainActivity.this.finish();
            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {

            }

            @Override
            public void onAdClicked(Ad ad) {

            }
        });
        fbInterstitialAd2.loadAd();



    }
    @Override
    public void onBackPressed() {
        if (fbInterstitialAd2.isAdLoaded()){
            fbInterstitialAd2.show();
        } else {
            MainActivity.this.finish();
        }
    }

}






