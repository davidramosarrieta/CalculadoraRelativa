package com.programacion.movil.estemanp.proyectobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_between;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_x;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_minus;
    Button button_point;
    Button button_0;
    Button button_equual;
    Button button_sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_7 = (Button) findViewById(R.id.button_7);
        button_7.setOnClickListener(this);
        button_8 = (Button) findViewById(R.id.button_8);
        button_8.setOnClickListener(this);
        button_9 = (Button) findViewById(R.id.button_9);
        button_9.setOnClickListener(this);
        button_between = (Button) findViewById(R.id.button_between);
        button_between.setOnClickListener(this);
        button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(this);
        button_5 = (Button) findViewById(R.id.button_5);
        button_5.setOnClickListener(this);
        button_6 = (Button) findViewById(R.id.button_6);
        button_6.setOnClickListener(this);
        button_x = (Button) findViewById(R.id.button_x);
        button_x.setOnClickListener(this);
        button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(this);
        button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(this);
        button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(this);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_minus.setOnClickListener(this);
        button_point = (Button) findViewById(R.id.button_point);
        button_point.setOnClickListener(this);
        button_0 = (Button) findViewById(R.id.button_0);
        button_0.setOnClickListener(this);
        button_equual = (Button) findViewById(R.id.button_equual);
        button_equual.setOnClickListener(this);
        button_sum = (Button) findViewById(R.id.button_sum);
        button_sum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
