package com.example.a26003980.p02_appnumero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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


    }// fim do onCreate

    //4 Criação do metodo quando o botão for tocado
    public void processar(View v){
        //5. pegar os numeros digitados
        String numeroDigitado = campoNumero.getText().toString();
        //6 conversão de string para int
        int numero = Integer.parseInt(numeroDigitado);
        //7 armazenar na lista
        lista.add(numero);
        //8 verificar se é par ou impar
        if (numero % 2 == 0)
            qtdPares++;
        else
            qtdImpares++;
        //9 realizar a soma do numeros
        soma = soma + numero;
        //10 atribuir os resultados nos campos respectivos
        txtNumeros.setText(lista.toString());
        txtImpares.setText(qtdImpares + "");
        txtPares.setText(qtdPares + "");
        txtSoma.setText(soma + "");

    }// fim do processar

}// fim da classe
