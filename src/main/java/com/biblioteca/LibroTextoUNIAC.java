package com.biblioteca;

/**
 * LibroTextoUNIAC hereda de LibroTexto
 * Agrega el atributo facultad, que indica qué facultad publicó el libro.
 */
public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC() {
        super(); // llama al constructor vacío de LibroTexto
        this.facultad = "";
    }

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares,
                            int numeroEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "LibroTextoUNIAC [titulo=" + getTitulo()
                + ", autor=" + getAutor()
                + ", numeroEjemplares=" + getNumeroEjemplares()
                + ", numeroEjemplaresPrestados=" + getNumeroEjemplaresPrestados()
                + ", curso=" + getCurso()
                + ", facultad=" + facultad + "]";
    }
}
