package com.am.pankajfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    Spinner listView;
    ArrayList arrayList;

    ArrayAdapter  arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        listView=findViewById(R.id.lv);
        arrayList=new ArrayList();

        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar"); //       arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");        arrayList.add("ramu");        arrayList.add("somu");        arrayList.add("kumar");        arrayList.add("rajesh");        arrayList.add("suresh");
        arrayAdapter= new ArrayAdapter(MainActivity4.this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
/*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity4.this, ""+arrayList.get(i), Toast.LENGTH_SHORT).show();
            }
        });*/

        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity4.this, ""+arrayList.get(i), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}