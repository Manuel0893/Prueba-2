package com.example.ornithologisticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, genero, fechaNac;
    Button iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.txtNombre);
        apellido = (EditText) findViewById(R.id.txtApellido);
        genero = (EditText) findViewById(R.id.txtGenero);
        fechaNac = (EditText) findViewById(R.id.txtFecha);
        iniciar = (Button) findViewById(R.id.btnInciar);

    }

    public void activTravesia(View view){
        Intent intento = new Intent(getApplicationContext(), buscaAve.class);

        startActivity(intento);
    }

}