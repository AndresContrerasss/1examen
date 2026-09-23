package com.biblioteca;

/**
 * LibroTexto hereda de Libro y agrega el atributo curso,
 * que indica a qué curso está asociado el libro de texto.
 */
public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto() {
        super(); // llama al constructor vacío de Libro
        this.curso = "";
    }

    public LibroTexto(String titulo, String autor, int numeroEjemplares,
                       int numeroEjemplaresPrestados, String curso) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibroTexto [titulo=" + getTitulo()
                + ", autor=" + getAutor()
                + ", numeroEjemplares=" + getNumeroEjemplares()
                + ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados()
                + ", curso=" + curso + "]";
    }
}