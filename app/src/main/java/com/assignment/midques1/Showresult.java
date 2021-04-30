package com.assignment.midques1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Showresult extends AppCompatActivity {
    TextView name, num, dpt;
    String nameval, numval, dptval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showresult);
        dpt=findViewById(R.id.dpt);
        name=findViewById(R.id.name);
        num=findViewById(R.id.num);

        Intent intent = getIntent();
        nameval= intent.getStringExtra("name");
        numval= intent.getStringExtra("number");
        dptval= intent.getStringExtra("dpt");

        name.setText(nameval);
        num.setText(numval);
        dpt.setText(dptval);
    }
}