package com.senaviewer.model;

public class Serie extends Film {
    private int seasons;

    public Serie(String nombre, String categoria, int AñoPublicacion, String title, String genre, int releaseYear, int seasons) {
        super(nombre, categoria, AñoPublicacion);
        this.seasons = seasons;
    }

    public void showSerie() {
        mostrarInformacion();
        System.out.println("Temporadas: " + seasons);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
