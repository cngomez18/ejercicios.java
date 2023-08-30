/*
 2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Entidades;

import java.util.Scanner;

public class Service {
 
    static Scanner leer = new Scanner(System.in);
    
    public static void crearPuntos(Puntos punto){
        System.out.println("Ingrese las coordenadas del primer punto(x1,y1): ");
        punto.setX1(leer.nextInt());
        punto.setY1(leer.nextInt());
        
        System.out.println("Ingrese las coordenadas del segundo punto(x2,y2): ");
        punto.setX2(leer.nextInt());
        punto.setY2(leer.nextInt());
        
    }
    
    //P1(x1,y1) P(x2,y2)
    //d(P1,P2)= raiz cuadrada de[(x2-x1)^2 + (y2-y1)^2]
    public static void distanciaPuntos(Puntos punto){
        double distancia;
        distancia = Math.sqrt( (Math.pow((punto.getX2()-punto.getX1()), 2)) + (Math.pow((punto.getY2()-punto.getY1()), 2)) );
        System.out.println("La distancia entre los el punto 1("+punto.getX1()+", "+ punto.getY1()+""
                + ") y el punto 2("+punto.getX2()+", "+punto.getY2()+") es de: "+distancia);
    }
}
