package com.example.abhishekthakur.spacehockey;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.example.abhishekthakur.spacehockey.Logic.Direction;
import com.example.abhishekthakur.spacehockey.Logic.Position;
import com.example.abhishekthakur.spacehockey.Logic.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;
        final Vector vector = new Vector((width / 2) - 10, (height / 2) - 10);
        vector.setPosition(new Position(0, 0));
        vector.setHorizontalDirection(Direction.Right);
        vector.setVerticalDirection(Direction.Top);

        ImageView ball = (ImageView) findViewById(R.id.ball);
        ball.setX(364);
        ball.setY(height);

//        while(true) {
//            ImageView ball = (ImageView) findViewById(R.id.ball);
//            vector.changePosition();
//            Position position = vector.currentPosition();
//            ball.setTranslationX(position.x);
//            ball.setTranslationY(position.y);
//        }



//        Handler handler = new Handler();
//        for (int a = 1; a < 10000; a++) {
//            final ImageView ball = (ImageView) findViewById(R.id.ball);
//            handler.postDelayed(new Runnable() {
//                @Override
//                public void  run() {
//                    Log.i("x = ", String.valueOf(ball.getX()));
//                    Log.i("y = ", String.valueOf(ball.getY()));
//                    vector.changePosition();
//                    Position position = vector.currentPosition();
//                    ball.setTranslationX(position.x);
//                    ball.setTranslationY(position.y);
//                }
//            }, 100 * a);
//        }
        return super.onTouchEvent(event);
    }
}
