package com.example.Mufee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signup4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup4);
    }

    public void widget(View view) {
        Intent in= new Intent(this, mufeewidget.class);
        startActivity(in);
    }

    public void feedpage(View view) {
        Intent in= new Intent(this, feed.class);
        startActivity(in);
    }
}
