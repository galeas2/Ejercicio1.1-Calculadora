package com.example.ejercicio11_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultadoOperaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_operaciones);


        TextView texto = (TextView)findViewById(R.id.txt_resultado_operaciones);
        Intent pantalla = getIntent();
        String numero1 = pantalla.getStringExtra("numero1");
        String numero2 = pantalla.getStringExtra("numero2");
        String signo = pantalla.getStringExtra("signo");
        String result = pantalla.getStringExtra("Respuesta");
        texto.setText(result);
    }
}