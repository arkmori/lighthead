package com.example.lighthead;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button upper = (Button) findViewById(R.id.upper);
    Button lower = (Button) findViewById(R.id.lower);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);

        bgElement.setBackgroundColor(Color.WHITE);

        myButtonListenerMethod();
    }

    public void myButtonListenerMethod() {

        button = (Button) findViewById(R.id.start);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
