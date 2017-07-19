package com.example.abhishekthakur.spacehockey;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.abhishekthakur.spacehockey.Logic.Direction;
import com.example.abhishekthakur.spacehockey.Logic.Position;
import com.example.abhishekthakur.spacehockey.Logic.Vector;

public class MainActivity extends AppCompatActivity {
    Vector vector;
    ImageView ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
                ((ViewGroup) startButton.getParent()).removeView(startButton);
            }
        });
    }

    private void startGame() {
        int width = getLayoutWidth();
        int height = getLayoutHeight();
        vector = new Vector((width / 2) - 10, (height / 2) - 10);
        vector.setHorizontalDirection(Direction.Right);
        vector.setVerticalDirection(Direction.Top);
        vector.setPosition(new Position(0, 0));
        ball = (ImageView) findViewById(R.id.ball);
        handler.post(runnable);
    }

    private Handler handler = new Handler();

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            updateBallPosition();
            handler.postDelayed(runnable, 1);
        }
    };

    private void updateBallPosition() {
        vector.changePosition();
        Position position = vector.currentPosition();
        ball.setTranslationX(position.x);
        ball.setTranslationY(position.y);
    }

    private int getLayoutHeight() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_main);
        return layout.getHeight();
    }

    private int getLayoutWidth() {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_main);
        return layout.getWidth();
    }

}
