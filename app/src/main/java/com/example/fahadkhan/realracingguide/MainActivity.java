package com.example.fahadkhan.realracingguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public  static String url;
    Button button,button1,button2,button3,button4,button5,button6;



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
                url="http://www.imore.com/real-racing-3-gameplay-guide-use-these-tips-and-tricks-get-top-step-podium";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://rr3.wikia.com/wiki/Strategy";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="https://levelskip.com/misc/Real-Racing-3-Tips-Hints-and-Real-Cheats";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url="https://levelskip.com/misc/Real-Racing-3-Strategy-Tips-and-Tricks-How-to-Have-Fun-Racing-Without-Spending-a-Dime";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://heavy.com/games/2013/11/real-racing-3-tips-tricks-cheats-ios-android-mobile-games/";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url="http://www.148apps.com/news/real-racing-3-tips-tricks-cheats/";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();
            }
        });

    }


}






