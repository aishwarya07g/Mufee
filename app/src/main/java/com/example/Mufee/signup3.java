package com.example.Mufee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class signup3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);

        Spinner aoi1= findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.aoi, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aoi1.setAdapter(adapter);
        aoi1.setOnItemSelectedListener(this);

        Spinner aoi2= findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.aoi, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aoi2.setAdapter(adapter2);
        aoi2.setOnItemSelectedListener(this);

        Spinner aoi3= findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(this,R.array.aoi, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aoi3.setAdapter(adapter3);
        aoi3.setOnItemSelectedListener(this);

        Spinner aoi4= findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(this,R.array.aoi, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aoi4.setAdapter(adapter4);
        aoi4.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text=parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void next2(View view) {
        Intent in3= new Intent(this, signup4.class);
        startActivity(in3);
    }

    public void jh(View view) {
        Intent in= new Intent(this, mufeewidget.class);
        startActivity(in);

    }
}

