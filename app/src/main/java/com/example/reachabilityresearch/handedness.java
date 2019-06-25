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
                Intent intentaa = new Intent(handedness.this,screen1.class);
                Log.d(TAG, "Dominant hand : LEFT");
                startActivity(intentaa);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentbb = new Intent(handedness.this,screen1.class);
                Log.d(TAG, "Dominant hand : RIGHT");
                startActivity(intentbb);
            }
        });
    }
}
