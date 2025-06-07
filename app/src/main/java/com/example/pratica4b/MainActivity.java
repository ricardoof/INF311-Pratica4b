package com.example.pratica4b;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private float luz, proximidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it = getIntent();
        if(it != null) {
            luz = it.getFloatExtra("luz", 0);
            proximidade = it.getFloatExtra("proximidade", 0);
        }
    }

    public void devolverCalssificacoes() {
        String luzClassificacao, proximidadeClassificacao;
        if(luz < 20) {
            luzClassificacao = "baixa";
        } else {
            luzClassificacao = "alta";
        }

        if(proximidade > 3) {
            proximidadeClassificacao = "distante";
        } else {
            proximidadeClassificacao = "naoDistante";
        }
    }
}