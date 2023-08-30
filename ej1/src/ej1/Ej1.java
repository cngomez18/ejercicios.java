/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese los numeros a sumar: ");
        num1 = leer.nextInt(); 
        num2 = leer.nextInt(); 
        System.out.println("La suma de los numeros es: " + (num1 + num2));
    
    }

}
