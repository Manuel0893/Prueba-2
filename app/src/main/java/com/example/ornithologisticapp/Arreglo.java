package com.example.ornithologisticapp;

import java.io.Serializable;
import java.util.ArrayList;

public class Arreglo implements Serializable {
    ArrayList <ListaAve> aLista;

    public Arreglo(){
        aLista = new ArrayList<ListaAve>();
    }
}
