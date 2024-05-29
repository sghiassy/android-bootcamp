package com.shaheenghiassy.gettingstartedapp;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private Button calculateButton;
    private RadioButton maleButtonRadioButton;
    private RadioButton femaleButtonRadioButton;
    private EditText ageEditText;
    private EditText feetEditText;
    private EditText inchesEditText;
    private EditText weightEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setupButtonClickListener();
    }

    private void findViews() {
        maleButtonRadioButton = findViewById(R.id.radio_button_male);
        femaleButtonRadioButton = findViewById(R.id.radio_button_female);
        ageEditText = findViewById(R.id.edit_text_age);
        feetEditText = findViewById(R.id.edit_text_feet);
        inchesEditText = findViewById(R.id.edit_text_inches);
        weightEditText = findViewById(R.id.edit_text_weight);
        resultText = findViewById(R.id.text_view_result);
        calculateButton = findViewById(R.id.button_calculate);
    }

    private void setupButtonClickListener() {
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }

        });
    }

    private void calculateBMI() {
        String ageText = ageEditText.getText().toString();
        String feetText = feetEditText.getText().toString();
        String inchesText = inchesEditText.getText().toString();
        String weightText = weightEditText.getText().toString();

        if (ageText.isEmpty() || feetText.isEmpty() || inchesText.isEmpty() || weightText.isEmpty()) {
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_LONG).show();
            return;
        }

        int age = Integer.parseInt(ageText);
        int feet = Integer.parseInt(feetText);
        int inches = Integer.parseInt(inchesText);
        int weight = Integer.parseInt(weightText);

        int totalInches = (feet * 12) + inches;
        double heightInMeters = totalInches * 0.0254;
        double weightInKg = weight;

        double bmi = weightInKg / MyUtils.myPow(heightInMeters, 2);

        String bmiTextResult = String.valueOf(bmi);

        resultText.setText("BMI: " + bmiTextResult);
    }

}


class MyUtils {

    public static double myPow(double number, int exponent) {
        double ans = 1.0;

        if (exponent < 0) {
            return myPow(1/number, -exponent);
        }

        while (exponent > 0) {
            if ((exponent&1)==1) {
                ans *= number;
            }

            number *= number;
            exponent /= 2;
        }

        return ans;
    }

}
