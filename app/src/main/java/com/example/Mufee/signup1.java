package com.example.Mufee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signup1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);
    }

    public void next(View view) {
        Intent in1= new Intent(this, signup2.class);
        startActivity(in1);
    }

    public void abs(View view) {
        Intent in= new Intent(this, mufeewidget.class);
        startActivity(in);
    }
}
