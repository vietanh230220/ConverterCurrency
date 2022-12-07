package com.example.currencyconverted;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_from, tv_to, tv_result;
    EditText edt_amount;
    Button btn_usd, btn_gbp, btn_aus, btn_can, btn_jpy, btn_eur;
    String amount;
    float pkr, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ClickListeners();
    }
    //Initialize all widgets and do view binding
    public void init(){
        tv_from = findViewById(R.id.tv_from);
        tv_to = findViewById(R.id.tv_to);
        edt_amount = findViewById(R.id.edt_amount);
        btn_usd = findViewById(R.id.btn_usd);
        btn_gbp = findViewById(R.id.btn_gbp);
        btn_eur = findViewById(R.id.btn_eur);
        btn_aus = findViewById(R.id.btn_aus);
        btn_can = findViewById(R.id.btn_can);
        btn_jpy = findViewById(R.id.btn_vnd);
        tv_result = findViewById(R.id.tv_result);
    }

    //Create click listeners for each button
    public void ClickListeners(){
        btn_usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                pkr = 24840;
                result = Integer.parseInt(amount) * pkr;
                tv_result.setText(String.valueOf(result));
                tv_to.setText("USD");
                tv_from.setText("VND");

            }
        });

        btn_gbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                pkr = 27258;
                result = Integer.parseInt(amount) / pkr;
                tv_result.setText(String.valueOf(result));
                tv_to.setText("GBP");
                tv_from.setText("VND");

            }
        });

        btn_aus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                pkr = 15089;
                result = Integer.parseInt(amount) / pkr;
                tv_result.setText(String.valueOf(result));
                tv_to.setText("AUS");
                tv_from.setText("VND");

            }
        });

        btn_eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                pkr = 24840;
                result = Integer.parseInt(amount) / pkr;
                tv_result.setText(String.valueOf(result));
                tv_to.setText("EUR");
                tv_from.setText("VND");

            }
        });

        btn_jpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                pkr = 164;
                result = Integer.parseInt(amount) / pkr;
                tv_result.setText(String.valueOf(result));
                tv_to.setText("JPY");
                tv_from.setText("VND");

            }
        });

        btn_can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount = edt_amount.getText().toString();
                pkr = 16468;
                result = Integer.parseInt(amount) / pkr;
                tv_result.setText(String.valueOf(result));
                tv_to.setText("USD");
                tv_from.setText("VND");

            }
        });
    }

}