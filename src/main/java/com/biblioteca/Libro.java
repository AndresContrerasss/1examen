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

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    //  Métodos de negocio

    // Calcula cuántos ejemplares hay disponibles para prestar
    public int getEjemplaresDisponibles() {
        return numeroEjemplares - numeroEjemplaresPrestados;
    }

    /**
     * Realiza el préstamo de un ejemplar.
     * Solo se puede prestar si quedan ejemplares disponibles.
     * @return true si el préstamo se pudo realizar, false si no.
     */
    public boolean prestamo() {
        if (getEjemplaresDisponibles() > 0) {
            numeroEjemplaresPrestados = numeroEjemplaresPrestados + 1;
            return true;
        }
        return false;
    }

    /**
     * Realiza la devolución de un ejemplar.
     * Solo se puede devolver si hay ejemplares prestados.
     * @return true si la devolución se pudo realizar, false si no.
     */
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados = numeroEjemplaresPrestados - 1;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo
                + ", autor=" + autor
                + ", numeroEjemplares=" + numeroEjemplares
                + ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados
                + ", disponibles=" + getEjemplaresDisponibles() + "]";
    }


}

