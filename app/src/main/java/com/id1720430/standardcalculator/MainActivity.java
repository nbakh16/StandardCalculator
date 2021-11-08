package com.id1720430.standardcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outputText;

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonPlus, buttonMinus, buttonMul, buttonDiv, buttonClear, buttonEqual;

    private double num1, num2, answer;
    private char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outputTxt);

        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonPlus = findViewById(R.id.btnPlus);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonMul = findViewById(R.id.btnMultiply);
        buttonDiv = findViewById(R.id.btnDivide);
        buttonClear = findViewById(R.id.btnClear);
        buttonEqual = findViewById(R.id.btnEqual);
    }

    public void onClickNumber(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();

        String number = outputText.getText().toString();

        switch (data){
            case "0":
                if(number.length() != 0)
                    outputText.setText(number+"0");
                break;
            case "1":
                outputText.setText(number+"1");
                break;
            case "2":
                outputText.setText(number+"2");
                break;
            case "3":
                outputText.setText(number+"3");
                break;
            case "4":
                outputText.setText(number+"4");
                break;
            case "5":
                outputText.setText(number+"5");
                break;
            case "6":
                outputText.setText(number+"6");
                break;
            case "7":
                outputText.setText(number+"7");
                break;
            case "8":
                outputText.setText(number+"8");
                break;
            case "9":
                outputText.setText(number+"9");
                break;
            default:
                outputText.setText("");
        }
    }

    public void onClickClear(View view) {
        outputText.setText("");
    }

    public void onClickOperator(View view) {
        String s = outputText.getText().toString();

        if (s.length() != 0) {
            num1 = Double.parseDouble(s);
            outputText.setText("");
            Button button = (Button) view;
            String data = button.getText().toString();

            switch (data) {
                case "+":
                    operator = '+';
                    break;
                case "-":
                    operator = '-';
                    break;
                case "x":
                    operator = '*';
                    break;
                case "/":
                    operator = '/';
                    break;
                default:
                    break;
            }
        }

    }

    public void onClickEqual(View view) {
        String s = outputText.getText().toString();

        if (s.length() != 0) {
            num2 = Double.parseDouble(s);

            switch (operator) {
                case '+':
                    answer = num1 + num2;
                    break;
                case '-':
                    answer = num1 - num2;
                    break;
                case '*':
                    answer = num1 * num2;
                    break;
                case '÷':
                    answer = num1 / num2;
                    break;
                default:
                    break;
            }
            s = String.valueOf(answer);
            outputText.setText(s);
        }
    }
}