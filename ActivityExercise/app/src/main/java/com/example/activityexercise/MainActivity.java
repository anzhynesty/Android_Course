package com.example.activityexercise;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String GO_TO_KEY = "goToKey";
    public static final int REQUEST_CODE = 123;
    public static final String MAIN_ACTIVITY = "1";
    public static final String SECOND_ACTIVITY = "2";
    public static final String THIRD_ACTIVITY = "3";
    public static final String FOURTH_ACTIVITY = "4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            String goTo = data.getStringExtra(MainActivity.GO_TO_KEY);
            switch (goTo) {
                case SECOND_ACTIVITY:
                    goToSecond();
                    break;
                case THIRD_ACTIVITY:
                    goToThird();
                    break;
                case FOURTH_ACTIVITY:
                    goToFourth();
                    break;
            }
        }
    }

        private void goToSecond () {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        }

        public void btnGoToSecond (View view){
            goToSecond();
        }

        private void goToThird () {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        }

        public void btnGoToThird (View view){
            goToThird();
        }


        private void goToFourth () {
            Intent intent = new Intent(this, FourthActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        }

        public void btnGoToFourth (View view){
            goToFourth();
        }
    }
