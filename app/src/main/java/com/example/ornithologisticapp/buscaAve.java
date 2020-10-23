package com.example.ornithologisticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class buscaAve extends AppCompatActivity {

    EditText nombreAve, fechaEncuentro, coment;
    Button guardarAve, lista;
    Arreglo avelista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_ave);

        nombreAve = (EditText) findViewById(R.id.txtAve);
        fechaEncuentro = (EditText) findViewById(R.id.txtFechaEnc);
        coment = (EditText) findViewById(R.id.txtComent);

        guardarAve = (Button) findViewById(R.id.btnGuardar);
        lista = (Button) findViewById(R.id.btnLista);
        avelista = new Arreglo();


    }
    public void intentAve(View v){
        Intent nAve = new Intent(getApplicationContext(), list_ave.class);
        nAve.putExtra("recibido", avelista);
        startActivity(nAve);
    }

    public void guardaAve(View m){
        ListaAve li = new ListaAve(nombreAve.getText().toString(),fechaEncuentro.getText().toString(),coment.getText().toString());
        avelista.aLista.add(li);
        nombreAve.setText("");
        fechaEncuentro.setText("");
        coment.setText("");

        for (ListaAve List : avelista.aLista){
            Toast.makeText(getApplicationContext(), "Ave: " + List.getNombreAve() + "Fecha: " + List.getFechaEnc() + "Comentario: " + List.getComment(), Toast.LENGTH_SHORT).show();
        }

    }
}