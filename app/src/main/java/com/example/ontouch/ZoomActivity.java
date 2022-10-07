package com.example.ontouch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class ZoomActivity extends AppCompatActivity implements View.OnTouchListener {
    int mBaseDistance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }


    public boolean onTouch(MotionEvent event){
        if(event.getPointerCount() == 2){
            int action = event.getAction();
            int puraction = action & MotionEvent.ACTION_MASK;
            if(puraction == MotionEvent.ACTION_POINTER_DOWN){
            }

        }
        return false;
    }

    int getDistance(MotionEvent motionEvent){
        int dx = (int)(motionEvent.getX(0)-motionEvent.getX(1));
        int dy = (int)(motionEvent.getX(0)-motionEvent.getX(1));
        return  (int)(Math.sqrt(dx * dx + dy * dy));
    }

}