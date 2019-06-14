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

public class leftscreen extends AppCompatActivity implements SensorEventListener {

    Button l1,l2,l3,l4,end1;
    TextView button_disp2;
    private static final String TAG = "Activity";
    private SensorManager sensorManager;
    Sensor accelerometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leftscreen);

        Log.d(TAG, "OnCreate : Initializing Sensor Services");
        sensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( leftscreen.this,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        Log.d(TAG,"onCreate : Registered accelerometerListener for Action Bar on Left");

        button_disp2=(TextView) findViewById(R.id.button_disp2);
        l1=(Button) findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 2");
            }
        });

        l2=(Button) findViewById(R.id.l2);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 3");
            }
        });

        l3=(Button) findViewById(R.id.l3);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 4");
            }
        });

        l4=(Button) findViewById(R.id.l4);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("END");
            }
        });

        end1=(Button) findViewById(R.id.end1);
        end1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(leftscreen.this,MainActivity.class);
                startActivity(intent2);
                finish();
            }
        });
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Log.d(TAG, "onSensorChanged : X: "+sensorEvent.values[0]+" Y: "+sensorEvent.values[1]+" Z: "+sensorEvent.values[2]);
    }
}
