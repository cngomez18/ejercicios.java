
import Entidades.Cuenta;
import java.util.Scanner;

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
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta */

public class Main5 {

    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        Scanner leer = new Scanner(System.in);
        int Opcion;
                
        cuenta.crear();
        
        do {
        System.out.println(" ");
        System.out.println("¿Qué opción desea realizar?: \n 1.Ingresar \n 2.Retirar \n 3.Extracción Rapida \n 4.Consultar Saldo \n 5.Consultar Datos ");
        System.out.println("Para salir ingrese 18");
        Opcion = leer.nextInt();
      
        switch (Opcion) {
            case 1: cuenta.Ingresar();
            break;
            case 2: cuenta.Retirar();
            break;
            case 3: cuenta.extraccionRapida();
            break;
            case 4: cuenta.consultarSaldo();
            break;
            case 5: cuenta.consultarDatos();
            break;
        }
        
        } while(Opcion != 18);
    
   
    }
    
}
