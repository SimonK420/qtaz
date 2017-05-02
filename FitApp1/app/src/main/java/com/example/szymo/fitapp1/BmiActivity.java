package com.example.szymo.fitapp1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        final EditText heightTxt = (EditText) findViewById(R.id.heightTxt);
        final EditText weightTxt = (EditText) findViewById(R.id.weightTxt);
        final TextView bmiResult = (TextView) findViewById(R.id.bmiResult);

        FloatingActionButton goBack = (FloatingActionButton) findViewById(R.id.goBack);
        goBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                setContentView(R.layout.activity_main);
            }
        });

        Button bmiBtn = (Button) findViewById(R.id.bmiBtn);
        bmiBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                float height = Float.parseFloat(heightTxt.getText().toString());
                float weight = Float.parseFloat(weightTxt.getText().toString());
                float bmi;
                float heightInMeters = height / 100;

                bmi = weight/(heightInMeters * heightInMeters);


                bmiResult.setText(Float.toString(bmi));
            }
        });
    }

}
