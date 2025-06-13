package com.senaviewer.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Seleccione una opción: ");

            int opcion;
            // Validación de entrada
            while (true) {
                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    if (opcion >= 0 && opcion <= 6) {
                        break;
                    } else {
                        System.out.print("Opción no válida. Intente de nuevo: ");
                    }
                } else {
                    System.out.print("Entrada inválida. Ingrese un número: ");
                    scanner.next(); // limpiar entrada inválida
                }
            }

            switch (opcion) {
                case 1:
                    System.out.println("Mostrando lista de películas...");
                    //  mostrar películas
                    break;
                case 2:
                    System.out.println("Mostrando lista de series...");
                    // mostrar series
                    break;
                case 3:
                    System.out.println("Mostrando lista de libros...");
                    //  mostrar libros
                    break;
                case 4:
                    System.out.println("Mostrando lista de revistas...");
                    //  mostrar revistas
                    break;
                case 5:
                    System.out.println("Generando reporte general...");
                    //  reporte general
                    break;
                case 6:
                    System.out.println("Generando reporte del día...");
                    //  reporte diario
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicación.");
                    salir = true;
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}