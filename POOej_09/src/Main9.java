
import Entidades.MatService;
import Entidades.Matematica;
import java.util.Scanner;

/*
9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Main9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica mate = new Matematica();
        System.out.println("Se estan creando dos nums aleatorios :)");

        double numa = Math.random() * 11;
        double numb = Math.random() * 11;

        mate.setNum1(numa);
        mate.setNum2(numb);

        System.out.println("Se crearon :D ");
        System.out.println("Sus numeros son: " + mate.getNum1() + " y " + mate.getNum2());
        MatService.devolverMayor(mate);
        MatService.calcularPotencia(mate);
        MatService.calculaRaiz(mate);

    }

}
