package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText number1;
    public EditText number2;

    public TextView answer;

    private int calc1;
    private int calc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        answer = findViewById(R.id.answerbox);
    }

    public void plus(View view){
        int calc1 = Integer.parseInt(number1.getText().toString());
        int calc2 = Integer.parseInt(number2.getText().toString());
        int calculation= calc1 + calc2;
        StringBuilder sb = new StringBuilder(""+calculation);
        answer.setText(String.valueOf(calculation));
    }

    public void multiple(View view){
        int calc1 = Integer.parseInt(number1.getText().toString());
        int calc2 = Integer.parseInt(number2.getText().toString());
        int calculation = calc1 * calc2;
        StringBuilder sb = new StringBuilder(""+calculation);
        answer.setText(String.valueOf(calculation));

    }

    public void division(View view){
        int calc1 = Integer.parseInt(number1.getText().toString());
        int calc2 = Integer.parseInt(number2.getText().toString());
        int calculation = calc1 / calc2;
        StringBuilder sb = new StringBuilder(""+calculation);
        answer.setText(String.valueOf(calculation));
    }

    public void minus(View view){
        int calc1 = Integer.parseInt(number1.getText().toString());
        int calc2 = Integer.parseInt(number2.getText().toString());
        int calculation = calc1 - calc2;
        StringBuilder sb = new StringBuilder(""+calculation);
        answer.setText(String.valueOf(calculation));

    }
}