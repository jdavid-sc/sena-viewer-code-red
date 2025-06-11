package com.senaviewer.model;

public class Film {
    public String nombre;
    public String categoria;
    public int AñoPublicacion;

    public Film(String nombre, String categoria, int AñoPublicacion){
        this.nombre = nombre;
        this.categoria = categoria;
        this.AñoPublicacion = AñoPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("La categoria es: " + this.categoria);
        System.out.println("El año de publicacion es el : " + this.AñoPublicacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        AñoPublicacion = añoPublicacion;
    }

}
