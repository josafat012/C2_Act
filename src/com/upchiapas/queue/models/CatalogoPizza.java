package com.upchiapas.queue.models;

import java.util.ArrayList;

public class CatalogoPizza {
    private String[] especialidad = {"Hawaiana", "Peperonni", "4 Quesos"};
    private ArrayList<Pizza> catalogo = new ArrayList<Pizza>();
    private float[] precios = {150, 100, 120};


    public ArrayList<Pizza> catalogoPrecios() {
        for (int i=0;i<3;i++) {
            catalogo.add(new Pizza((short) (i+1), especialidad[i], precios[i]));
        }
        return catalogo;
    }

    public String[] getEspecialidad() {
        return especialidad;
    }

    public float[] getPrecios() {
        return precios;
    }
}