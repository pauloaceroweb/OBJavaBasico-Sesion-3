package com.pauloaceroweb;

public class ConcatenarArray {

    public static void main(String[] args) {

        String[] nombres = {"Liliana", "Valerie", "Daniel", "Felipe", "Mariela"};

        String concatenar = "";
        for ( String nombre : nombres ) {
            concatenar = concatenar + nombre + " ";
        }
        System.out.println("Concatenación de Nombres: " + concatenar);



    }
}
