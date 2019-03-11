package com.example.task8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstButton;
    Button secondButton;
    Button thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = findViewById(R.id.buttonFirst);
        secondButton = findViewById(R.id.buttonSecond);
        thirdButton = findViewById(R.id.buttonThird);

        final Intent firstIntent = new Intent(this,firstText.class);
        final Intent secondIntent = new Intent(this,secondText.class);
        final Intent thirdIntent = new Intent(this,thirdText.class);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(firstIntent);
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(secondIntent);
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(thirdIntent);
            }
        });
    }
}
