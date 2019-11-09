package com.example.activityexercise;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public abstract class SetResultAndFinishActivity extends AppCompatActivity {
    public void setResultAndFinishActivity(String goToActivityValue) {
        Intent data = new Intent();
        data.putExtra(MainActivity.GO_TO_KEY, goToActivityValue);
        setResult(RESULT_OK, data);
        finish();
    }
}
