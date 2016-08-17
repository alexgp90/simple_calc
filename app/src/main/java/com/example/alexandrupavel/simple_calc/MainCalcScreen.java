package com.example.alexandrupavel.simple_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainCalcScreen extends AppCompatActivity {

    long result=0;
    long val_temp=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc_screen);

        final TextView results_field = (TextView) findViewById(R.id.results_field);
        results_field.setText("");


        final Button button_0 = (Button) findViewById(R.id.button_0);
        button_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               results_field.append("0");

            }
        });
        final Button button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("1");
            }
        });
        final Button button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("2");
            }
        });
        final Button button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("3");
            }
        });
        final Button button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("4");
            }
        });
        final Button button_5 = (Button) findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("5");
            }
        });
        final Button button_6 = (Button) findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("6");
            }
        });
        final Button button_7 = (Button) findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("7");
            }
        });
        final Button button_8 = (Button) findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("8");
            }
        });
        final Button button_9 = (Button) findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.append("9");
            }
        });
        final Button button_clear = (Button) findViewById(R.id.button_clear);
        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.setText("");
            }
        });

        final Button button_sum = (Button) findViewById(R.id.button_sum);
        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.setText("");
            }
        });
        final Button button_substract = (Button) findViewById(R.id.button_substract);
        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.setText("");
            }
        });
        final Button button_divide = (Button) findViewById(R.id.button_divide);
        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.setText("");
            }
        });
        final Button button_multiply = (Button) findViewById(R.id.button_multiply);
        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                results_field.setText("");
            }
        });




    }




}



