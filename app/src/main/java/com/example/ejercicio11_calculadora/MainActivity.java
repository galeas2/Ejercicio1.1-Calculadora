package com.example.ejercicio11_calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    OperacionesMatematicas funcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText)findViewById(R.id.num_1);
        EditText num2 = (EditText)findViewById(R.id.num_2);

        Button sumar = (Button)findViewById(R.id.btn_sumar);
        Button restar = (Button)findViewById(R.id.btn_restar);
        Button multiplicar = (Button)findViewById(R.id.btn_multiplicar);
        Button dividir = (Button)findViewById(R.id.btn_dividir);

        Intent pantalla = new Intent(getApplicationContext(), ActivityResultadoOperaciones.class);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double n1 = Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());

                    funcion = new OperacionesMatematicas(n1, n2);

                    Double suma = funcion.sumar();
                    pantalla.putExtra("n2",n2+"");
                    pantalla.putExtra("n1", n1+"");
                    pantalla.putExtra("signo", "+");
                    pantalla.putExtra("Respuesta", suma+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese los campos que estan vacios", Toast.LENGTH_LONG);
                }
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double n1 = Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());

                    funcion = new OperacionesMatematicas(n1, n2);

                    Double resta = funcion.restar();
                    pantalla.putExtra("n2",n2+"");
                    pantalla.putExtra("n1", n1+"");
                    pantalla.putExtra("signo", "-");
                    pantalla.putExtra("Respuesta", resta+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese los campos que estan vacios", Toast.LENGTH_LONG);
                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double n1 = Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());

                    funcion = new OperacionesMatematicas(n1, n2);

                    Double multi = funcion.multiplicar();
                    pantalla.putExtra("n2",n2+"");
                    pantalla.putExtra("n1", n1+"");
                    pantalla.putExtra("signo", "*");
                    pantalla.putExtra("Respuesta", multi+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese los campos que estan vacios", Toast.LENGTH_LONG);
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double n1 = Double.parseDouble(num1.getText().toString());
                    Double n2 = Double.parseDouble(num2.getText().toString());

                    funcion = new OperacionesMatematicas(n1, n2);

                    Double division = funcion.dividir();
                    pantalla.putExtra("n2",n2+"");
                    pantalla.putExtra("n1", n1+"");
                    pantalla.putExtra("signo", "/");
                    pantalla.putExtra("Respuesta", division+"");
                    startActivity(pantalla);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Ingrese los campos que estan vacios", Toast.LENGTH_LONG);
                }
            }
        });



    }
}