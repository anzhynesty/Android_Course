package com.example.activityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 333;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void btnGoToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    public void btnGoToSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    public void btnGoToFourth(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }
}
