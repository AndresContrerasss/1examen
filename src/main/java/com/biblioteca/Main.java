package com.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) libro1 -> usando el constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        // 2) libro2 -> usando el constructor por defecto y pidiendo datos por consola
        System.out.println("=== Ingrese los datos de libro2 ===");
        Libro libro2 = new Libro();

        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());

        System.out.print("Autor: ");
        libro2.setAutor(sc.nextLine());

        System.out.print("Número de ejemplares: ");
        libro2.setNumeroEjemplares(Integer.parseInt(sc.nextLine()));

        System.out.print("Número de ejemplares prestados: ");
        libro2.setNumeroEjemplaresPrestados(Integer.parseInt(sc.nextLine()));

        // 3) Objeto LibroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programación",
                "John Smith",
                10,
                3,
                "Programación II",
                "Facultad de Ingeniería"
        );

        // 4) Objeto Novela indicando su tipo
        Novela novela = new Novela("El nombre de la rosa", "Umberto Eco", 4, 1, "policiaca");

        // Mostrar los 4 objetos creados
        System.out.println("\n=== Objetos creados ===");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTextoUNIAC);
        System.out.println(novela);

        // Probar los métodos de préstamo y devolución
        System.out.println("\n=== Prueba de préstamo y devolución ===");

        System.out.println("libro1 -> préstamo: " + libro1.prestamo());
        System.out.println(libro1);

        System.out.println("libro1 -> devolución: " + libro1.devolucion());
        System.out.println(libro1);

        System.out.println("libroTextoUNIAC -> préstamo: " + libroTextoUNIAC.prestamo());
        System.out.println(libroTextoUNIAC);

        System.out.println("novela -> devolución (sin prestamos previos): " + novela.devolucion());
        System.out.println(novela);

        System.out.println("novela -> préstamo: " + novela.prestamo());
        System.out.println(novela);

        sc.close();
    }
}
