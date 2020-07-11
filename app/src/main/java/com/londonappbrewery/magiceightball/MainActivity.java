package com.londonappbrewery.magiceightball;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.msg);

        final int[] ballArray = {
                R.mipmap.ball1,
                R.mipmap.ball2,
                R.mipmap.ball3,
                R.mipmap.ball4,
                R.mipmap.ball5,
        };

        final Random randomNumberGenerator = new Random();

        Button askButton = findViewById(R.id.askBtn);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number = randomNumberGenerator.nextInt(5);

                Log.d("Random Number","New Random Number is " + number);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });

    }








}
