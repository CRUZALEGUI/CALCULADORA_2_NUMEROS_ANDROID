package com.example.miprimeraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txt_num1;
    private EditText txt_num2;
    private Button btn_sumar;
    private TextView txv_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_num1 = findViewById(R.id.txt_num1);
        txt_num2 = findViewById(R.id.txt_num2);
        txv_resultado = findViewById(R.id.txt_resultado);
    }
    public void Sumar(View view){
        String valor_1 = txt_num1.getText().toString();
        String valor_2 = txt_num2.getText().toString();
        int num1 = Integer.parseInt(valor_1);
        int num2 = Integer.parseInt(valor_2);
        int suma = num1 + num2;

        String resultado = String.valueOf(suma);
        txv_resultado.setText(resultado);

    }
}