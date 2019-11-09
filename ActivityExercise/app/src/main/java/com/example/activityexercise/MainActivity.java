package com.example.activityexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGoToSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void btnGoToThird(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    public void btnGoToFourth(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }
}
