package Entidades;

import java.util.Scanner;

public class Service {
    //REHACER 
    //SACAR EL STATIC SI TOTAL NO MUESTRA

    static Scanner leer = new Scanner(System.in);

//  Metodo creador
    public static void creadortm(Raices abc) { //si o si queda ahi 
        System.out.print("Ingrese valor A: ");
        abc.setA(leer.nextInt());
        System.out.print("Ingrese valor B: ");
        abc.setB(leer.nextInt());
        System.out.print("Ingrese valor C: ");
        abc.setC(leer.nextInt());
    } //este va primero 

//    • Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public static double getDiscriminante(Raices abc) {
        double discriminante;
        discriminante = ((Math.pow(abc.getB(), 2)) - (4 * abc.getA() * abc.getC()));
        return discriminante;
    }

//    • Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public static boolean tieneRaices(Raices abc) { //aux2
        boolean raices;
        //Service.getDiscriminante(abc);
        if (Service.getDiscriminante(abc) > 0) {
            // System.out.println("La formula tiene dos soluciones");
            raices = true;
        } else {
            raices = false;
        }
        return raices;
    }

//    • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
//para que esto ocurra, el discriminante debe ser igual que 0.
    public static boolean tieneRaiz(Raices abc) { //aux1
        //Service.getDiscriminante(abc);
        boolean raiz;
        if (Service.getDiscriminante(abc) == 0) {
            raiz = true;

        } else {
            raiz = false;
        }
        return raiz;
    }

//    • Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2
//posibles soluciones.
    public static double[] obtenerRaices(Raices abc) { //aux2
        double raiz1, raiz2;
        raiz1 = 0;
        raiz2 = 0;
        
        if (Service.tieneRaices(abc) == true) {
            raiz1 = (-(abc.getB()) + (Math.sqrt((Math.pow(abc.getB(), 2)) - (4 * abc.getA() * abc.getC()))) / (2 * abc.getA()));
            raiz2 = (-(abc.getB()) - (Math.sqrt((Math.pow(abc.getB(), 2)) - (4 * abc.getA() * abc.getC()))) / (2 * abc.getA()));
            Math.round(raiz1); Math.round(raiz2);
            System.out.println("Las posibles soluciones son: " + raiz1 + " y " + raiz2);
        }
        double Array[] = {raiz1, raiz2};
        return Array;
    }

//    • Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public static double obtenerRaiz(Raices abc) {
        double raizUnica = 0;

        if (Service.tieneRaiz(abc) == true) {
            raizUnica = -(abc.getB()) + Math.sqrt((Math.pow(abc.getB(), 2)) - (4 * abc.getA() * abc.getC())) / (2 * abc.getA());
            Math.round(raizUnica);
            System.out.println("La solucion es: " + raizUnica);
        }
        return raizUnica;
    }

//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
//caso de no existir solución, se mostrará un mensaje.
    public static void calcular(Raices abc) {
        if (Service.tieneRaices(abc) == true) {
            System.out.println(Service.obtenerRaices(abc));
        } else if (Service.tieneRaiz(abc) == true) {
            System.out.println(Service.obtenerRaiz(abc));
        } else {
            System.out.println("no existe solucion");
        }

    }

}
