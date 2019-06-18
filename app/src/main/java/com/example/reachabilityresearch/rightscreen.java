package com.example.reachabilityresearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rightscreen extends AppCompatActivity{

    Button r1,r2,r3,r4,end2;
    TextView button_disp3;
    private static final String TAG = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rightscreen);

        Log.d(TAG, "OnCreate : Initializing Sensor Services");
        Log.d(TAG,"onCreate : Registered accelerometerListener");

        button_disp3=(TextView) findViewById(R.id.button_disp3);
        r1=(Button) findViewById(R.id.r1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 2");
            }
        });

        r2=(Button) findViewById(R.id.r2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 3");
            }
        });

        r3=(Button) findViewById(R.id.r3);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 4");
            }
        });

        r4=(Button) findViewById(R.id.r4);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("END");
            }
        });

        end2=(Button) findViewById(R.id.end2);
        end2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(rightscreen.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }

}
