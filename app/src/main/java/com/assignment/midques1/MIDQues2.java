package com.assignment.midques1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MIDQues2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button submit;
    EditText name, num;
    String dptval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_i_d_ques2);
        Spinner spinner = findViewById(R.id.dpt);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dpt_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        submit = findViewById(R.id.submit);
        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Showresult.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("number", num.getText().toString());
                intent.putExtra("dpt", dptval);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        dptval = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}