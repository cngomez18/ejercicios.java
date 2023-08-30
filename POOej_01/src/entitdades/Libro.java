/*
 *1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package entitdades;

import java.util.Scanner;

public class Libro {

    public String ISBN;
    public String Titulo;
    public String Autor;
    public int numpag;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int numpag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numpag = numpag;
    }

    public void FabricarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el titulo: ");
        this.Titulo = leer.nextLine();

        System.out.println("Ingrese el autor: ");
        this.Autor = leer.nextLine();

        System.out.println("Ingrese el núm de pag: ");
        this.numpag = leer.nextInt();

        System.out.println("Ingrese el ISBN: ");
        this.ISBN = leer.next();

    }

    public void Mostrar(){
        System.out.println("Datos del libro ingresado: \n Su titulo es: " + this.Titulo + " \n Su autor es: "+ this.Autor );
        System.out.println(" Tiene "+ this.numpag +" páginas \n ISBN: "+ this.ISBN); 
    }
    
}
