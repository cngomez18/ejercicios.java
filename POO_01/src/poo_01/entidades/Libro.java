/*
 1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package poo_01.entidades;


public class Libro {
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int numpag;

    public Libro() {
    }

    
    public Libro(int ISBN, String Titulo, String Autor, int numpag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numpag = numpag;
    }
    
    
    
}
