
import entidades.Cadena;
import entidades.CadenaService;
import java.util.Scanner;

/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:

 */
public class Main8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//        System.out.println("frase pls");
//        String frase=leer.next();
//        
//        for (int i = 0; i < frase.length(); i++) {
//            
//                System.out.println(frase.substring(i, i+1));
//            
//        }
//        System.out.println("substring: "+frase.substring(2, 3)+" // lentgh: "+frase.length());
        
        Cadena cade = new Cadena();
        String cad;
        
        System.out.println("Ingrese una frase o palabra: ");
        cad = leer.nextLine().toLowerCase();
        
        cade.setFrase(cad);
        cade.setLongitud(cad.length());
        CadenaService.mostrarVocales(cade);
        CadenaService.invertirFrase(cade);
        CadenaService.vecesRepetido(null, cade);
        CadenaService.compararLongitud(null, cade);
        CadenaService.unirFrases(null, cade);
        CadenaService.reemplazar(null, cade);
        CadenaService.contiene(null, cade);
    }
    
}
