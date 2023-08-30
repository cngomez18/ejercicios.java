
import java.util.Date;
import java.util.Scanner;

/*
11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Main11 {
//rehacer
    public static void main(String[] args) {
        int dia, mes, anio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA)");
        dia=leer.nextInt(); mes=leer.nextInt()-1; anio=leer.nextInt()-1900;
        
        Date fechaActual = new Date();
        Date fechaFC = new Date(anio, mes, dia);

        String fechaActualEscrita = fechaActual.toString();
        String fechaFCEscrita = fechaFC.toString();

        int difo = fechaActual.getYear() - fechaFC.getYear();

        System.out.println(fechaActualEscrita + "\n" + fechaFCEscrita);
        System.out.println("Entre ambas fechas hay " + difo + " años");

    }

}
