package com.example.reachabilityresearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start_main;
    private static final String TAG = "Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_main=(Button) findViewById(R.id.start_main);
        start_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,handedness.class);
                startActivity(intent1);
                Log.d(TAG, "Initialize : Clicked Button START");
                finish();
            }
        });
    }
}
