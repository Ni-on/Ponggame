package com.example.androidgamepong;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {
    //attribute
    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        //initialize  mPongGame
        mPongGame = new PongGame(this, size.x, size.y);
        setContentView(mPongGame);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mPongGame.resume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        mPongGame.pause();
    }
}
