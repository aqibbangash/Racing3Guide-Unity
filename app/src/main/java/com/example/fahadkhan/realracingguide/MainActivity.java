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
                url="https://en.wikipedia.org/wiki/Doodle_Jump";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://www.gamerevolution.com/cheats/doodle-jump";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://www.getpcdownload.com/doodle-jump-pc-download/";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url="http://appcheaters.com/doodle-jump-race-cheats-tricks/";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url="http://www.wikihow.com/Be-Good-at-Doodle-Jump";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                url="http://www.ehow.com/how_8674008_play-doodle-jump.html";
                Intent intent = new Intent (MainActivity.this, webView.class);
                startActivity(intent);
                //fbInterstitialAd.show();
            }
        });
    }


}






