package com.senaviewer.model;

public class Movie extends Film {
   
     int duracion;

    public Movie(String nombre, String categoria, int AñoPublicacion, int duracion){
        super(nombre, categoria, AñoPublicacion);
        this.duracion = duracion;
    }
    
    public void showMovie(){
        mostrarInformacion();
        System.out.println("La duracion es de " + this.duracion + "Minutos");
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
