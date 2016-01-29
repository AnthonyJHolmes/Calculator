package io.github.anthonyjholmes.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button buttonAddition;
    private Button buttonSubtraction;
    private Button buttonMultiplication;
    private Button buttonDivision;
    private Button buttonClear;
    private Button buttonSquared;
    private Button buttonCubed;
    private Button buttonSquareRoot;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.firstNumber);
        operand2 = (EditText) findViewById(R.id.secondNumber);
        buttonAddition = (Button) findViewById(R.id.buttonAddition);
        buttonSubtraction = (Button) findViewById(R.id.buttonSubtraction);
        buttonMultiplication = (Button) findViewById(R.id.buttonMultiplication);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonSquared = (Button) findViewById(R.id.squared);
        buttonCubed = (Button) findViewById(R.id.buttonCubed);
        buttonSquareRoot =(Button) findViewById(R.id.buttonSquareRoot);
        textResult = (TextView) findViewById(R.id.textResult);

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0) ) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 - oper2;
                    textResult.setText(Double.toString(theResult));

                } else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 * oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 / oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonSquared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    Toast.makeText(MainActivity.this, "Please enter a number in either textfield, but not both", Toast.LENGTH_LONG).show();
                }
                else if (operand1.getText().length() > 0){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double theResult = oper1* oper1;
                    textResult.setText(Double.toString(theResult));
                }else if (operand2.getText().length() > 0){
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper2* oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number in either textfield", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonCubed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    Toast.makeText(MainActivity.this, "Please enter a number in either textfield, but not both", Toast.LENGTH_LONG).show();
                }
                else if (operand1.getText().length() > 0){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double theResult = oper1* oper1 *oper1;
                    textResult.setText(Double.toString(theResult));
                }else if (operand2.getText().length() > 0){
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper2* oper2 *oper2;
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number in either textfield", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    Toast.makeText(MainActivity.this, "Please enter a number in either textfield, but not both", Toast.LENGTH_LONG).show();
                }
                else if (operand1.getText().length() > 0){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double theResult = Math.sqrt(oper1);
                    textResult.setText(Double.toString(theResult));
                }else if (operand2.getText().length() > 0){
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = Math.sqrt(oper2);
                    textResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a number in either textfield", Toast.LENGTH_LONG).show();
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                textResult.setText("0.0");
                operand1.requestFocus();
            }
        });
    }
}
