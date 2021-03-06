package com.example.alexandrupavel.simple_calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;



public class MainCalcScreen extends AppCompatActivity {

    long result=0;
    boolean operator = false;
    boolean pressed_number = true;
    String last_op = "sum";    //possible state: nan, sum, sub, mul, div



    void func_sum(){
        final TextView results_field = (TextView) findViewById(R.id.results_field);
        if (operator == false) {
            operator = true;
            if (last_op.equals("nan")){
                result = Long.parseLong(results_field.getText().toString());
            }else {
                Log.d("tag_false", Long.toString(result));
                func_equ_switch();
                results_field.setText("0");
            }
        } else
        if (operator == true){
/*
            result = result + Long.parseLong(results_field.getText().toString());
            Log.d("tag_true",Long.toString(result));
            results_field.setText("0");
*/
        }

        results_field.setText(Long.toString(result));
        last_op="sum";

    }

    void func_sub(){
        final TextView results_field = (TextView) findViewById(R.id.results_field);
        if (operator == false) {
            operator = true;
            if (last_op.equals("nan")){
                result = Long.parseLong(results_field.getText().toString());
            }else {

                func_equ_switch();
                results_field.setText("0");
            }
            Log.d("tag_false",Long.toString(result));
            results_field.setText("0");
        } else
        if (operator == true){
/*
            result = result - Long.parseLong(results_field.getText().toString());
            Log.d("tag_true",Long.toString(result));
            results_field.setText("0");
 */
        }

        results_field.setText(Long.toString(result));
        last_op="sub";
    }
    void func_mul(){
        final TextView results_field = (TextView) findViewById(R.id.results_field);
        if (operator == false) {
            operator = true;
            if (last_op.equals("nan")){
                result = Long.parseLong(results_field.getText().toString());
            }else {

                func_equ_switch();
                results_field.setText("0");
            }
            Log.d("tag_false",Long.toString(result));
            results_field.setText("0");
        } else
        if (operator == true){
/*
            result = result * Long.parseLong(results_field.getText().toString());
            Log.d("tag_true",Long.toString(result));
            results_field.setText("0");
*/
        }

        results_field.setText(Long.toString(result));
        last_op="mul";

    }
    void func_div(){
        final TextView results_field = (TextView) findViewById(R.id.results_field);
        if (operator == false) {
            operator = true;
            if (last_op.equals("nan")){
                result = Long.parseLong(results_field.getText().toString());
            }else {
                Log.d("tag_false", Long.toString(result));
                func_equ_switch();
                results_field.setText("0");
            }
            results_field.setText("0");
        } else
        if (operator == true){
/*
            result = result / Long.parseLong(results_field.getText().toString());
            Log.d("tag_true",Long.toString(result));
            results_field.setText("0");
 */
        }

        results_field.setText(Long.toString(result));
        last_op="div";
    }
    void func_equ_switch(){
        final TextView results_field = (TextView) findViewById(R.id.results_field);
        switch (last_op) {
            case "sum":{
                result = result + Long.parseLong(results_field.getText().toString());
                break;
            }
            case "sub":{
                result = result - Long.parseLong(results_field.getText().toString());
                break;

            }

            case "mul":{
                result = result * Long.parseLong(results_field.getText().toString());
                break;

            }

            case "div":{
                result = result / Long.parseLong(results_field.getText().toString());
                break;

            }
            case "nan":{
                result=result;
                break;
            }
        }
    }

    void func_equ(){
        final TextView results_field = (TextView) findViewById(R.id.results_field);
        operator = false;

        Log.d("tag_equals",Long.toString(result));
        func_equ_switch();

        last_op="sum"; //// FIXME: 22.08.2016
        operator=false;
        results_field.setText(Long.toString(result));
        result=0;


    }
    void func_debug(){
        Log.d("result",Long.toString(result));
        Log.d("operator",operator ? "true" : "false");
        Log.d("last_op",last_op);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc_screen);

        final TextView results_field = (TextView) findViewById(R.id.results_field);
        results_field.setText("0");
        final Animation shake = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shake);

        final Button button_0 = (Button) findViewById(R.id.button_0);
        button_0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("0");
                pressed_number = true;
                button_0.startAnimation(shake);

            }
        });
        final Button button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");

                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("1");
                pressed_number = true;

                button_1.startAnimation(shake);
                func_debug();
            }
        });
        final Button button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("2");
                pressed_number = true;

                button_2.startAnimation(shake);
            }
        });
        final Button button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("3");
                pressed_number = true;

                button_3.startAnimation(shake);
            }
        });
        final Button button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("4");
                pressed_number = true;

                button_4.startAnimation(shake);
            }
        });
        final Button button_5 = (Button) findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("5");
                pressed_number = true;

                button_5.startAnimation(shake);
            }
        });
        final Button button_6 = (Button) findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("6");
                pressed_number = true;

                button_6.startAnimation(shake);
            }
        });
        final Button button_7 = (Button) findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("7");
                pressed_number = true;

                button_7.startAnimation(shake);
            }
        });
        final Button button_8 = (Button) findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }
                results_field.append("8");
                pressed_number = true;

                button_8.startAnimation(shake);
            }
        });
        final Button button_9 = (Button) findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (operator == true || last_op.equals("nan")){
                    operator = false;
                    results_field.setText("0");
                }
                if (results_field.getText().toString().equals("0")){
                    results_field.setText("");
                }

                results_field.append("9");
                pressed_number = true;

                button_9.startAnimation(shake);
            }
        });
        final Button button_clear = (Button) findViewById(R.id.button_clear);
        button_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                operator = false;
                results_field.setText("0");
                result = 0;
               // last_op="sum";  // FIXME: 22.08.2016


                Log.d("tag_clear",Long.toString(result));
                pressed_number = false;

                button_clear.startAnimation(shake);
            }
        });

        final Button button_sum = (Button) findViewById(R.id.button_sum);
        button_sum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pressed_number = false;

                func_sum();
                button_sum.startAnimation(shake);
            }
        });
        final Button button_substract = (Button) findViewById(R.id.button_substract);
        button_substract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pressed_number = false;

                func_sub();
                button_substract.startAnimation(shake);

            }
        });
        final Button button_divide = (Button) findViewById(R.id.button_divide);
        button_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pressed_number = false;

                func_div();

                button_divide.startAnimation(shake);
            }
        });
        final Button button_multiply = (Button) findViewById(R.id.button_multiply);
        button_multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pressed_number = false;

                func_mul();
                button_multiply.startAnimation(shake);
            }
        });

        final Button button_equals = (Button) findViewById(R.id.button_equals);
        button_equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pressed_number = false;

                func_equ();


                button_equals.startAnimation(shake);
            }
        });



    }




}



