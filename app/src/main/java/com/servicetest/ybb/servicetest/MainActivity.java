package com.servicetest.ybb.servicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.servicetest.ybb.servicetest.Service.SimpleService;

public class MainActivity extends AppCompatActivity {

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initService();
    }

    private void initService() {
        i = new Intent(this, SimpleService.class);
        startService(i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopService(i);
    }
}
