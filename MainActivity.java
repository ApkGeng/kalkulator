package com.kalkulator.app;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    private String currentInput = "";
    private double num1 = 0;
    private double num2 = 0;
    private String currentOperator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);

        // Tambahkan pendengar klik ke tombol-tombol
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonEqual = findViewById(R.id.buttonEqual);

        button1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button6.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button7.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button8.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button9.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        button0.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onNumberClick(view);
				}
			});

        buttonPlus.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onOperatorClick(view);
				}
			});

        buttonMinus.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onOperatorClick(view);
				}
			});

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onOperatorClick(view);
				}
			});

        buttonDivide.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onOperatorClick(view);
				}
			});

        buttonClear.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onClearClick(view);
				}
			});

        buttonEqual.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					onEqualClick(view);
				}
			});
    }

    public void onNumberClick(View view) {
        Button button = (Button) view;
        String digit = button.getText().toString();
        currentInput += digit;
        display.setText(currentInput);
    }

    public void onOperatorClick(View view) {
        if (!currentInput.isEmpty()) {
            num1 = Double.parseDouble(currentInput);
            currentOperator = ((Button) view).getText().toString();
            currentInput = "";
        }
    }

    public void onEqualClick(View view) {
        if (!currentInput.isEmpty() && !currentOperator.isEmpty()) {
            num2 = Double.parseDouble(currentInput);
            double result = 0;

            switch (currentOperator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
			display.setText(String
							.valueOf(result)); currentInput = String.valueOf(result); currentOperator = ""; } }public void onClearClick(View view) {
		currentInput = "";
		num1 = 0;
		num2 = 0;
		currentOperator = "";
		display.setText("");
	}}
