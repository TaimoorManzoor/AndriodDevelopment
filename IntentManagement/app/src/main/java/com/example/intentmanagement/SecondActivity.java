package com.example.intentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent fromActivity=getIntent();

        String title=fromActivity.getStringExtra("title");
        String name=fromActivity.getStringExtra("name");
        int RollNo=fromActivity.getIntExtra("RollNo",0);
        TextView StudentInfo=findViewById(R.id.StudentInfo);
        StudentInfo.setText("Roll No: "+RollNo+", Name: "+name);
        getSupportActionBar().setTitle(title);

    }
}