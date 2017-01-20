package com.example.bzby.recevier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyService.class));
    }

    private static final String TAG = "MainActivity";

    public void clickHere(View view) {
        Log.d(TAG, "clickHere() called with: view = [" + view + "]");
        Intent intent = new Intent(MyService.ACTION);
        sendBroadcast(intent);
    }
}
