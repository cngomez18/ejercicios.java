/*
 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.

• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.

• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.

• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.

• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.

• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidades;

import java.util.Scanner;

public class Cuenta {

    public int numeroCuenta;
    public int DNI;
    private double saldo;
    private double interes;

    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, double saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void crear() {
        System.out.println("Ingrese su número de cuenta: ");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su DNI: ");
        this.DNI = leer.nextInt();
        System.out.println("Ingrese su saldo actual: ");
        this.saldo = leer.nextDouble();
    }

    public double Ingresar() {
        System.out.println("¿Cuanto desea ingresar? ");
        double ingreso = leer.nextDouble();
        this.saldo = saldo + ingreso;
        return ingreso;
    }

    public double Retirar() {
        System.out.println("¿Cuanto desea retirar? ");
        double retiro = leer.nextDouble();
        if (retiro > saldo) {
            this.saldo = 0;
        } else {
            this.saldo = saldo - retiro;
        }
        return retiro;
    }

    public void extraccionRapida(){
        System.out.println("Esta opcion permite extraer hasta un 20% de su saldo actual.");
        double extraccion = leer.nextDouble();
        if (extraccion > (this.saldo*0.20)){
               System.out.println("Supera el limite. ");
        } else{
            this.saldo = saldo - extraccion;
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: " + this.saldo);
    }
    
    public void consultarDatos(){
        System.out.println("Su número de cuenta es: " + this.numeroCuenta);
        System.out.println("El DNI ingresado es: "+ this.DNI);
    }
    
}
