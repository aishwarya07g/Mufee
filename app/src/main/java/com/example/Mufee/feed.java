package com.example.Mufee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
    }

    public void about(View view) {
        Intent in = new Intent(this, mufeewidget.class);
        startActivity(in);
    }

    public void current(View view) {
        Intent in = new Intent(this, currenttrend.class);
        startActivity(in);
    }

    public void matchh(View view) {
        Intent in = new Intent(this, matchpage.class);
        startActivity(in);
    }

    public void pro(View view) {
        Intent in= new Intent(this, profile.class);
        startActivity(in);
    }
}
