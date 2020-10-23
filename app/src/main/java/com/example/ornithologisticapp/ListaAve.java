package com.example.ornithologisticapp;

import java.io.Serializable;

public class ListaAve implements Serializable {

    private String nombreAve;
    private String fechaEnc;
    private String comment;


    public ListaAve(String nombreAve, String fechaEnc, String comment) {
        this.nombreAve = nombreAve;
        this.fechaEnc = fechaEnc;
        this.comment = comment;

    }

    public String getNombreAve() {
        return nombreAve;
    }

    public void setNombreAve(String nombreAve) {
        this.nombreAve = nombreAve;
    }

    public String getFechaEnc() {
        return fechaEnc;
    }

    public void setFechaEnc(String fechaEnc) {
        this.fechaEnc = fechaEnc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
