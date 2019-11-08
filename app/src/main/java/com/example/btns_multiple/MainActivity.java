package com.example.btns_multiple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2,btn3,btn4,btn5,btn6,btnRV;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btnRV = findViewById(R.id.btnRV);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btnRV.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1){

        }
        if (v.getId() == R.id.btn2){

        }
        if (v.getId() == R.id.btn3){

        }
        if (v.getId() == R.id.btn4){

        }
        if (v.getId() == R.id.btn5){
        Intent table = new Intent(MainActivity.this, table_layout.class);
        startActivity(table);
        }
        if (v.getId() == R.id.btn6){
            Intent frame = new Intent(MainActivity.this, frame_layout.class);
            startActivity(frame);
        }

        if (v.getId() == R.id.btnRV){
            Intent rv = new Intent(MainActivity.this, RvActivity.class);
            startActivity(rv);
        }
    }
}
