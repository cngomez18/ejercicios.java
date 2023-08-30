
import Entidades.Cancion;
import java.util.Scanner;

/*
 1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
public class MainExtra1 {

    public static void main(String[] args) {
        Cancion canci = new Cancion();
        Scanner leer = new Scanner(System.in);
        String titu, autor;
        System.out.println("Ingrese titulo y autor de la cancion que desea guardar");
        titu = leer.nextLine();
        autor = leer.nextLine();
        canci.setAutor(autor);
        canci.setTitulo(titu);
        System.out.println(" ''" + canci.getTitulo() + "'' by " + canci.getAutor());
        
    }

}
