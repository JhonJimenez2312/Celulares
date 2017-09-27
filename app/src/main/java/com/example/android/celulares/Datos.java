package com.example.android.celulares;


import java.util.ArrayList;


public class Datos {
    private static ArrayList<Celular> celulares = new ArrayList<>();

    public static void guardar (Celular c){
        celulares.add(c);
    }

    public static ArrayList<Celular> Obtener(){
        return celulares;
    }
}
