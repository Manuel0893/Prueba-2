package com.example.ornithologisticapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class list_ave extends AppCompatActivity {


    ImageView fotoAve;
    ArrayList <ListaAve> listave;
    RecyclerView recycler;
    Bundle dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ave);


        recycler = findViewById(R.id.reciVista);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        listave = new ArrayList<ListaAve>();
        losDatos();
        Adaptador adp = new Adaptador(listave);
        recycler.setAdapter(adp);
    }
    public void losDatos() {
        dato = getIntent().getExtras();

        Arreglo la = (Arreglo) dato.getSerializable("nombreAve");


        if (la == null) {
            Toast.makeText(getApplicationContext(), "HELP", Toast.LENGTH_SHORT).show();
            listave = new ArrayList<ListaAve>();
        }else {
            listave = la.aLista;
        }
    }
}