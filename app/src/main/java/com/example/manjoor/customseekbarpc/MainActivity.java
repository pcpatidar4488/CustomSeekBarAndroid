package com.example.manjoor.customseekbarpc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements SwagPoints.OnSeekBarChangedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SwagPoints swagPoints = findViewById(R.id.circular);
        swagPoints.setSeekBarChangeListener(MainActivity.this);

        swagPoints.setProgressDisplayAndInvalidate(100);

    }

    @Override
    public void onPointsChanged(SwagPoints swagPoints, int points, boolean fromUser) {
        //point.setText(String.valueOf(points));
        if (points==1010){
            swagPoints.setProgressDisplayAndInvalidate(0);
        }
    }

    @Override
    public void onStartTrackingTouch(SwagPoints swagPoints) {

    }

    @Override
    public void onStopTrackingTouch(SwagPoints swagPoints) {

    }
}
