package com.biblioteca;

/**
 * Clase base que representa un libro dentro de la biblioteca.
 * Aplica el principio de ENCAPSULAMIENTO: los atributos son privados
 * y solo se pueden manipular mediante los métodos get y set.
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
}