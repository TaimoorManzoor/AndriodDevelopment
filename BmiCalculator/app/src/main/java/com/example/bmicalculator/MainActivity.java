package com.example.bmicalculator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textshow=findViewById(R.id.textshow);
        EditText editHeightF,editHeightI,editWeight;
        AppCompatButton btnresult=findViewById(R.id.btnresult);
        editHeightF=findViewById(R.id.editHeightF);
        editHeightI=findViewById(R.id.editHeightI);
        editWeight=findViewById(R.id.editWeight);

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hf=Integer.parseInt(editHeightF.getText().toString());
                int hi=Integer.parseInt(editHeightI.getText().toString());
                int w=Integer.parseInt(editWeight.getText().toString());

                int totalIn=hf*12*hi;
                double totalCm=2.53*totalIn;
                double totalM=totalCm/100;

                double bmi=w/(totalM*totalM);
                        if(bmi>25)
                        {
                            textshow.setText("You are Over Weight");
                        }
                        else if(bmi<18)
                        {
                            textshow.setText("You are Under Weight");
                        }
                        else{
                            textshow.setText("You are Healthy");
                        }
                        }
        });


    }
}