package com.alura.conversor;

import com.google.gson.annotations.SerializedName;

public class Moneda {
@SerializedName("")
    private String nombre;
    private int valor;

    public Moneda(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }


}
