/*
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidades;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    //getter & setter & constructor
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    Scanner leer = new Scanner(System.in);

    public void rec() {
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura = leer.nextInt();
    }

    public double Superficie() {
        double superf = base * altura;
        return superf;
    }

    public double Parametro() {
        double param = (base * altura) * 2;
        return param;
    }

    public void Mostrar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }

}
