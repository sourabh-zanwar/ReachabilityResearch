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

public class rightscreen extends AppCompatActivity implements SensorEventListener{

    Button r1,r2,r3,r4,r5,r6,end2;
    TextView button_disp3;
    public float xco,yco,zco;
    private static final String TAG = "Activity";
    private SensorManager sensorManager;
    Sensor accelerometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rightscreen);
        Log.d(TAG, "OnCreate : Initializing Sensor Services");
        sensorManager =(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener( rightscreen.this,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);
        Calendar calendar = Calendar.getInstance();
        String time = "\nTimestamp : "+calendar.getTime();
        Log.d(TAG,"onCreate : Registered accelerometerListener for ActionBar on Right"+time);
        Log.d(TAG,"\nOnRight1 : Expected 2");

        button_disp3=(TextView) findViewById(R.id.button_disp3);
        r1=(Button) findViewById(R.id.r2);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 5");
                Calendar calendar1 = Calendar.getInstance();
                String time1 = "\nTimestamp : "+calendar1.getTime();
                Log.d(TAG, "OnRight1 : Clicked 2 Accelerometer Data : X :"+xco+" Y : "+yco+" Z : "+zco+time1);
                Log.d(TAG,"\nOnRight1 : Expected 5");
            }
        });

        r2=(Button) findViewById(R.id.r5);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 1");
                Calendar calendar2 = Calendar.getInstance();
                String time2 = "\nTimestamp : "+calendar2.getTime();
                Log.d(TAG, "OnRIght1 : Clicked 5 Accelerometer Data : X :"+xco+" Y : "+yco+" Z : "+zco+time2);
                Log.d(TAG,"\nOnRight1 : Expected 1");
            }
        });

        r3=(Button) findViewById(R.id.r1);
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 3");
                Calendar calendar3 = Calendar.getInstance();
                String time3 = "\nTimestamp : "+calendar3.getTime();
                Log.d(TAG, "OnRight1 : Clicked Button 1 Accelerometer Data : X :"+xco+" Y : "+yco+" Z : "+zco+time3);
                Log.d(TAG,"\nOnRight1 : Expected 3");
            }
        });

        r4=(Button) findViewById(R.id.r3);
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 4");
                Calendar calendar4 = Calendar.getInstance();
                String time4 = "\nTimestamp : "+calendar4.getTime();
                Log.d(TAG, "OnRight1 : Clicked Button 3 Accelerometer Data : X :"+xco+" Y : "+yco+" Z : "+zco+time4);
                Log.d(TAG,"\nOnRight1 : Expected 3");
            }
        });

        r5=(Button) findViewById(R.id.r4);
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS 6");
                Calendar calendar5 = Calendar.getInstance();
                String time5 = "\nTimestamp : "+calendar5.getTime();
                Log.d(TAG, "OnRight1 : Clicked Button 4 Accelerometer Data : X :"+xco+" Y : "+yco+" Z : "+zco+time5);
                Log.d(TAG,"\nOnRight1 : Expected 6");
            }
        });

        r6=(Button) findViewById(R.id.r6);
        r6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_disp3.setText("PRESS NEXT");
                Calendar calendar6 = Calendar.getInstance();
                String time6 = "\nTimestamp : "+calendar6.getTime();
                Log.d(TAG, "OnRight1 : Clicked Button 6 Accelerometer Data : X :"+xco+" Y : "+yco+" Z : "+zco+time6);
            }
        });

        end2=(Button) findViewById(R.id.end2);
        end2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentb = new Intent(rightscreen.this,leftscreen1.class);
                startActivity(intentb);
                Log.d(TAG, "OnRight1 : Clicked Button Next");
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
