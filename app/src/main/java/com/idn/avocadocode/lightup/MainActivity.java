package com.idn.avocadocode.lightup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

   public void white(View view) {
            Intent intent = new Intent(MainActivity.this,Clearwhite.class);
            startActivity(intent);
    }

    public void yellow(View view) {
        Intent intent = new Intent(MainActivity.this,Yellow.class);
        startActivity(intent);
    }

    public void blue(View view) {
        Intent intent = new Intent(MainActivity.this,Blue.class);
        startActivity(intent);
    }
}
