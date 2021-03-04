package com.am.pankajfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button p;
     EditText e;
     String s;
     TextView textView;
     DatePickerDialog  datePickerDialog;
     TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=findViewById(R.id.button3);
        textView=findViewById(R.id.textView);
        e=findViewById(R.id.editTextTextPersonName);
        //usage pls wait mic disconnected
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        e.setText(i+"/"+i1+"/"+i2);
                    }
                }, 2005, 10, 10);
                datePickerDialog.show();
            }

        });
    }
}