package com.usn.tzzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lamps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamps);

        Button buttonKalkuler = findViewById(R.id.buttonKalkuler);

        final Intent intentLamps = new Intent(this, LampKalkulert.class);

        buttonKalkuler.setOnClickListener(v -> startActivity(intentLamps));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return true;
    }

}
