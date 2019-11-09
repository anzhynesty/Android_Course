package com.example.activityexercise;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends SetResultAndFinishActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void btnGoToMain(View view) {
        setResultAndFinishActivity(MainActivity.MAIN_ACTIVITY);
    }

    public void btnGoToThird(View view) {
        setResultAndFinishActivity(MainActivity.THIRD_ACTIVITY);
    }

    public void btnGoToFourth(View view) {
        setResultAndFinishActivity(MainActivity.FOURTH_ACTIVITY);
    }
}
