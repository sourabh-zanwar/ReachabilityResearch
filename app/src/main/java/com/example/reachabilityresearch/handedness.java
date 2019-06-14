package com.example.reachabilityresearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class handedness extends AppCompatActivity {

    Button left,right;
    private static final String TAG = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handedness);

        left = (Button) findViewById(R.id.leftbutton);
        right = (Button) findViewById(R.id.rightbutton);

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(handedness.this,leftscreen.class);
                Log.d(TAG, "Choose Strong Hand : Clicked Button LEFT");
                startActivity(intent3);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(handedness.this,rightscreen.class);
                Log.d(TAG, "Choose Strong Hand : Clicked Button 1");
                startActivity(intent4);
            }
        });
    }
}
