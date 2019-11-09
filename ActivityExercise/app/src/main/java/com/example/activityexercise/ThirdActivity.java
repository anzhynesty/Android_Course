package com.example.activityexercise;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends SetResultAndFinishActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void btnGoToMain(View view) {
        setResultAndFinishActivity(MainActivity.MAIN_ACTIVITY);
    }

    public void btnGoToSecond(View view) {
        setResultAndFinishActivity(MainActivity.SECOND_ACTIVITY);
    }

    public void btnGoToFourth(View view) {
        setResultAndFinishActivity(MainActivity.FOURTH_ACTIVITY);
    }
}
