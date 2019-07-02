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

import java.util.Calendar;

public class screen2 extends AppCompatActivity implements SensorEventListener {

    Button c1,c2,c3,c4,next,c5,c6;
    TextView button_disp1,textView6;
    public float xco,yco,zco;
    private static final String TAG = "Activity";
    private SensorManager sensorManager;
    Sensor accelerometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        Log.d(TAG, "OnCreate : Initializing Sensor Services");
        button_disp1=(TextView) findViewById(R.id.button_disp1);
        button_disp1.setText("PRESS 3");
        textView6 =(TextView) findViewById(R.id.textView5);
        textView6.setText("Use Non-dominant Hand");
        sensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( screen2.this,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        Calendar calendar = Calendar.getInstance();
        String time = "\nTimestamp : "+calendar.getTimeInMillis();
        Log.d(TAG,"Screen 2 : onCreate : Registered accelerometerListener for Action Bar on Top"+time);
        Log.d(TAG,"\nOnTop2 : Expected 3");

        button_disp1=(TextView) findViewById(R.id.button_disp1);
        c1=(Button) findViewById(R.id.c3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp1.setText("PRESS 1");
                Calendar calendar1 = Calendar.getInstance();
                String time1 = "\nTimestamp : "+calendar1.getTimeInMillis();
                Log.d(TAG, "OnTop2 : Clicked 3 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time1);
                Log.d(TAG,"\nOnTop2 : Expected 1");
            }
        });

        c2=(Button) findViewById(R.id.c1);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp1.setText("PRESS 6");
                Calendar calendar2 = Calendar.getInstance();
                String time2 = "\nTimestamp : "+calendar2.getTimeInMillis();
                Log.d(TAG, "OnTop2 : Clicked 1 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time2);
                Log.d(TAG,"\nOnTop2 : Expected 6");
            }
        });

        c3=(Button) findViewById(R.id.c6);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp1.setText("PRESS 4");
                Calendar calendar3 = Calendar.getInstance();
                String time3 = "\nTimestamp : "+calendar3.getTimeInMillis();
                Log.d(TAG, "OnTop2 : Clicked 6 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time3);
                Log.d(TAG,"\nOnTop2 : Expected 4");
            }
        });

        c4=(Button) findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp1.setText("PRESS 2");
                Calendar calendar3 = Calendar.getInstance();
                String time3 = "\nTimestamp : "+calendar3.getTimeInMillis();
                Log.d(TAG, "OnTop2 : Clicked 4 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time3);
                Log.d(TAG,"\nOnTop2 : Expected 2");
            }
        });

        c5=(Button) findViewById(R.id.c2);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp1.setText("PRESS 5");
                Calendar calendar3 = Calendar.getInstance();
                String time3 = "\nTimestamp : "+calendar3.getTimeInMillis();
                Log.d(TAG, "OnTop2 : Clicked 2 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time3);
                Log.d(TAG,"\nOnTop2 : Expected 5");
            }
        });

        c6=(Button) findViewById(R.id.c5);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp1.setText("PRESS NEXT");
                Calendar calendar4 = Calendar.getInstance();
                String time4 = "\nTimestamp : "+calendar4.getTimeInMillis();
                Log.d(TAG, "OnTop2 : Clicked 5 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time4);
            }
        });

        next=(Button) findViewById(R.id.next1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentf = new Intent(screen2.this,rightscreen2.class);
                startActivity(intentf);
                Log.d(TAG, "OnTop2 : Clicked NEXT");
            }
        });
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        xco = sensorEvent.values[0];
        yco = sensorEvent.values[1];
        zco = sensorEvent.values[2];
    }
}