package com.example.a.lowellexamscorecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText currentGradeBox;
    EditText desiredGradeBox;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentGradeBox = (EditText) findViewById(R.id.editText3);
        desiredGradeBox = (EditText) findViewById(R.id.editText4);
        calculate = (Button) findViewById(R.id.button);
    }

    public void onButtonClick(View view) {
        double currentGrade = 0.0;
        double desiredGrade = 0.0;
        double necessaryGrade = 0.0; //grade the user needs to get on their exam
        String current = currentGradeBox.getText().toString(); //current score value entered by the user
        String desired = desiredGradeBox.getText().toString(); //desired score value entered by the user

        currentGrade = Double.valueOf(current); //values used in calculations
        desiredGrade = Double.valueOf(desired);

        necessaryGrade = (desiredGrade - (.8 * currentGrade)) / .2;

        Toast.makeText(getApplicationContext(), "The Necessary Grade is: " + necessaryGrade, Toast.LENGTH_LONG).show();
    }
}
