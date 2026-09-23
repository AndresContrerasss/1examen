package com.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) libro1  usando el constructor 
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        // 2) libro2 usando el constructor 
        System.out.println("=== Ingrese los datos de libro2 ===");
        Libro libro2 = new Libro();

        System.out.print("Título: ");
        libro2.setTitulo(sc.nextLine());
 }
}
