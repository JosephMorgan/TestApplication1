package com.deng.bin.testapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("hello world");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
