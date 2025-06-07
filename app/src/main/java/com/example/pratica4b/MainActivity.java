package com.example.pratica4b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    public void devolverClassificacoes(View v) {
        Intent it = new Intent();
        String luzClassificacao, proximidadeClassificacao;
        if(luz < 20) {
            luzClassificacao = "baixa";
        } else {
            luzClassificacao = "alta";
        }
        it.putExtra("luz", luzClassificacao);

        if(proximidade < 3) {
            proximidadeClassificacao = "naoDistante";
        } else {
            proximidadeClassificacao = "distante";
        }
        it.putExtra("proximidade", proximidadeClassificacao);

        setResult(1, it);
        finish();
    }
}