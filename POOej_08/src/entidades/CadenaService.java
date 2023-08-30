package entidades;

import java.util.Scanner;

public class CadenaService {

    Cadena cadn = new Cadena();
    Scanner leer = new Scanner(System.in);
//    • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.   

    public static void mostrarVocales(Cadena cadn) {
        int cont = 0;

        for (int i = 0; i < cadn.getFrase().length(); i++) {
            if (cadn.getFrase().substring(i, i + 1).equals("a")) {
                cont++;
            }
            if (cadn.getFrase().substring(i, i + 1).equals("e")) {
                cont++;
            }
            if (cadn.getFrase().substring(i, i + 1).equals("i")) {
                cont++;
            }
            if (cadn.getFrase().substring(i, i + 1).equals("o")) {
                cont++;
            }
            if (cadn.getFrase().substring(i, i + 1).equals("u")) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " vocales en la frase/palabra ingresada. ");
    }

//• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public static void invertirFrase(Cadena cadn) {
        String nocade = cadn.getFrase();
        StringBuilder invfra = new StringBuilder(nocade);
        nocade = invfra.reverse().toString();
        System.out.println("La frase invertida es: " + nocade);
        //todos estas cosas nuevas estas maracadas en google/prog :thumbs up:
    }

//• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
//ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public static void vecesRepetido(String letra,Cadena cadn) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter para buscar repetidos: ");
        letra = leer.next();
        int cont = 0;
        for (int i = 0; i < cadn.getFrase().length(); i++) {
            if (cadn.getFrase().substring(i, i + 1).equals(letra)) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("No se ha encontrado el caracter ingresado en la frase");
        } else if (cont == 1) {
            System.out.println("El caracter ingresado se ha encontrado una sola vez en la frase ");
        } else {
            System.out.println("El caracter ingresado se repite " + cont + " veces.");
        }
    }

//• Método compararLongitud(String frase), deberá comparar la longitud de la frase
//que compone la clase con otra nueva frase ingresada por el usuario.
    public static void compararLongitud(String frase,Cadena cadn) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una segunda frase: ");
        frase = leer.nextLine();
        int longfrase = frase.length();
        System.out.println("La longitud de la nueva frase es de " + longfrase + ""
                + " mientras que la longitud de la original es de " + cadn.getLongitud());

    }

//• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public static void unirFrases(String frase,Cadena cadn) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase para añadir ");
        frase = leer.nextLine();
        System.out.println("A continuación se muestra la union de las cadenas: ");
        System.out.println(cadn.getFrase() +" "+ frase);

    }

//• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//mostrar la frase resultante.
    
    //ESTO ANDA MAL
    public static void reemplazar(String letra,Cadena cadn) {
       // String falsecade = cadn.getFrase();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un caracter cualquiera para una sorpresa ;)");
        letra = leer.next();
        System.out.println(cadn.getFrase().replace("a", letra));
        
    }

//• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no
 
    public static void contiene(String letra,Cadena cadn){
        boolean aux=false;  
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra a buscar:");
        letra = leer.next();
        int lugar = cadn.getFrase().indexOf(letra);
        for (int i = 0; i < cadn.getFrase().length(); i++) {
            if (cadn.getFrase().substring(i, i+1).equals(letra)) {
                aux = true; 
            }
        }
        if (aux=true){
            System.out.println("La primera posición en la que se encuentra es: "+ lugar );
        }
        
    }
}
