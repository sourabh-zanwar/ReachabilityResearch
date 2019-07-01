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

public class leftscreen extends AppCompatActivity implements SensorEventListener{

    Button l1,l2,l3,l4,l5,l6,end1;
    TextView button_disp2;
    public float xco,yco,zco;
    private static final String TAG = "Activity";
    private SensorManager sensorManager;
    Sensor accelerometer;
    String timee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leftscreen);
        Log.d(TAG, "OnCreate : Initializing Sensor Services");
        sensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( leftscreen.this,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        Calendar calendar = Calendar.getInstance();
        String time = "\nTimestamp : "+calendar.getTimeInMillis();
        Log.d(TAG,"onCreate : Registered accelerometerListener for Action Bar on Left."+time);
        Log.d(TAG,"\nOnLeft1 : Expected 1");

        button_disp2=(TextView) findViewById(R.id.button_disp2);
        l1=(Button) findViewById(R.id.l1);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 4");
                Calendar calendar1 = Calendar.getInstance();
                String time1 = "\nTimestamp : "+calendar1.getTimeInMillis();
                Log.d(TAG, "OnLeft1 : Clicked 1 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time1);
                Log.d(TAG,"\nOnLeft1 : Expected 4");
            }
        });

        l2=(Button) findViewById(R.id.l4);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 2");
                Calendar calendar2 = Calendar.getInstance();
                String time2 = "\nTimestamp : "+calendar2.getTimeInMillis();
                Log.d(TAG, "OnLeft1 : Clicked 4 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time2);
                Log.d(TAG,"\nOnLeft1 : Expected 2");
            }
        });

        l3=(Button) findViewById(R.id.l2);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 5");
                Calendar calendar3 = Calendar.getInstance();
                String time3 = "\nTimestamp : "+calendar3.getTimeInMillis();
                Log.d(TAG, "OnLeft1 : Clicked 2 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time3);
                Log.d(TAG,"\nOnLeft1 Dominant Hand : Expected 5");
            }
        });

        l4=(Button) findViewById(R.id.l5);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 3");
                Calendar calendar4 = Calendar.getInstance();
                String time4 = "\nTimestamp : "+calendar4.getTimeInMillis();
                Log.d(TAG, "OnLeft1 : Clicked 5 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time4);
                Log.d(TAG,"\nOnLeft1 : Expected 3");
            }
        });

        l5=(Button) findViewById(R.id.l3);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS 6");
                Calendar calendar5 = Calendar.getInstance();
                String time4 = "\nTimestamp : "+calendar5.getTimeInMillis();
                Log.d(TAG, "OnLeft1 : Clicked 3 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time4);
                Log.d(TAG,"\nOnLeft1 : Expected 6");
            }
        });


        l6=(Button) findViewById(R.id.l6);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp2.setText("PRESS NEXT");
                Calendar calendar6 = Calendar.getInstance();
                String time4 = "\nTimestamp : "+calendar6.getTimeInMillis();
                Log.d(TAG, "OnLeft1 : Clicked 6 Accelerometer Data : X : "+xco+" Y : "+yco+" Z : "+zco+time4);
            }
        });


        end1=(Button) findViewById(R.id.end1);
        end1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenta = new Intent(leftscreen.this,rightscreen.class);
                startActivity(intenta);
                Log.d(TAG, "OnLeft1 : Clicked NEXT");
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
