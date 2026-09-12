package com.example.lighthead;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout bgElement = (ConstraintLayout)
                findViewById(R.id.activity_main);

        bgElement.setBackgroundColor(Color.WHITE);

        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                ConstraintLayout bgElement =
                        (ConstraintLayout) findViewById(R.id.activity_main);

                int color = ((ColorDrawable)
                        bgElement.getBackground()).getColor();

                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                }
                else {
                    bgElement.setBackgroundColor(Color.RED);
                }
            }
        });
    }
}