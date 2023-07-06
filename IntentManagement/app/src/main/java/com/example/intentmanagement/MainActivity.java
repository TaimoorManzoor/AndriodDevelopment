package com.example.intentmanagement;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext=new Intent(getApplicationContext(),SecondActivity.class);
                iNext.putExtra("title","Student Detail");
                iNext.putExtra("name","Taimoor");
                iNext.putExtra("RollNo", 0021);
                startActivity(iNext);
            }
        });

    }
}