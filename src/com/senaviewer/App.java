package com.senaviewer;

import com.senaviewer.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear lista de películas
        List<Film> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(new Film("Inception", "Ciencia Ficción", 2010));
        listaPeliculas.add(new Film("Interstellar", "Ciencia Ficción", 2014));
        listaPeliculas.add(new Film("Dune", "Acción", 2024));
        listaPeliculas.add(new Film("Titanic", "Romance", 1997));

        // Crear generador de reportes
        ReportGenerator reportes = new ReportGenerator(listaPeliculas);

        // Menú de navegación
        int opcion;
        do {
            System.out.println("\n===== MENÚ DE REPORTES =====");
            System.out.println("1. Ver reporte general");
            System.out.println("2. Ver reporte por año");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    reportes.generarReporteGeneral();
                    break;
                case 2:
                    System.out.print("Ingresa el año de publicación: ");
                    int año = scanner.nextInt();
                    reportes.generarReportePorAño(año);
                    break;
                case 3:
                    System.out.println("👋 Saliendo del sistema...");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}