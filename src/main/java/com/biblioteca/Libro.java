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

       // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }

    // Constructor con parametros
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

}
