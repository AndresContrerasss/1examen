# Parcial I - Programación II - G411
## Sistema de gestión de biblioteca (POO: Abstracción, Encapsulamiento y Herencia)

Proyecto Maven muy simple, sin librerías externas (solo lo básico del JDK: `Scanner` para leer datos por consola).

---

## 1. Estructura del proyecto

```
biblioteca-parcial/
├── pom.xml
├── .gitignore
├── README.md
└── src/main/java/com/biblioteca/
    ├── Libro.java
    ├── LibroTexto.java
    ├── LibroTextoUNIAC.java
    ├── Novela.java
    └── Main.java
```

---

## 2. Diagrama UML de clases 

```mermaid
classDiagram
    class Libro {
        -String titulo
        -String autor
        -int numeroEjemplares
        -int numeroEjemplaresPrestados
        +Libro()
        +Libro(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados)
        +getTitulo() String
        +setTitulo(titulo) void
        +getAutor() String
        +setAutor(autor) void
        +getNumeroEjemplares() int
        +setNumeroEjemplares(n) void
        +getNumeroEjemplaresPrestados() int
        +setNumeroEjemplaresPrestados(n) void
        +getEjemplaresDisponibles() int
        +prestamo() boolean
        +devolucion() boolean
        +toString() String
    }

    class LibroTexto {
        -String curso
        +LibroTexto()
        +LibroTexto(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso)
        +getCurso() String
        +setCurso(curso) void
        +toString() String
    }

    class LibroTextoUNIAC {
        -String facultad
        +LibroTextoUNIAC()
        +LibroTextoUNIAC(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, curso, facultad)
        +getFacultad() String
        +setFacultad(facultad) void
        +toString() String
    }

    class Novela {
        -String tipo
        +Novela()
        +Novela(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, tipo)
        +getTipo() String
        +setTipo(tipo) void
        +toString() String
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUNIAC
    Libro <|-- Novela
```


---