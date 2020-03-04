package com.example.a26003980.p02_appnumero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1. deckarar os componetes dinamicos
    EditText campoNumero;
    TextView txtNumeros, txtImpares, txtPares, txtSoma;

    //2. Variáveis globais
    int qtdPares = 0, qtdImpares = 0, soma = 0;
    ArrayList<Integer> lista = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3. Intergraçao entre xml e java
        campoNumero = findViewById(R. id.edit_numero);
        txtNumeros = findViewById(R. id.txt_numeros);
        txtImpares = findViewById(R. id.txt_impares);
        txtPares = findViewById(R. id.txt_pares);
        txtSoma = findViewById(R. id.txt_soma);
        
    }
}
