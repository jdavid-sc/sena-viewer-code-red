package com.senaviewer.model;

import java.util.List;

public class ReportGenerator {
    private List<Film> films;

    // Constructor
    public ReportGenerator(List<Film> films) {
        this.films = films;
    }

    // Reporte general
    public void generarReporteGeneral() {
        System.out.println("=== REPORTE GENERAL DE PELÍCULAS ===");
        for (Film film : films) {
            film.mostrarInformacion();
            System.out.println("---------------------------");
        }
    }

    // Reporte filtrado por año de publicación
    public void generarReportePorAño(int año) {
        System.out.println("=== REPORTE DE PELÍCULAS DEL AÑO " + año + " ===");
        boolean encontrado = false;
        for (Film film : films) {
            if (film.getAñoPublicacion() == año) {
                film.mostrarInformacion();
                System.out.println("---------------------------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron películas del año " + año);
        }
    }
}