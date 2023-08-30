/*
 * 9. Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set.
En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Entidades;

public class MatService {

    public static double devolverMayor(Matematica mate) {
        double mayor = Math.max(mate.getNum1(), mate.getNum2());
        System.out.println("El numero más grande es: " + mayor);
        return mayor;
    }

    public static double calcularPotencia(Matematica mate) {

        double round1 = Math.round(mate.getNum1());
        double round2 = Math.round(mate.getNum2());
        double mayor = Math.max(round1, round2);
        double menor = Math.min(round1, round2);
        double potencia = Math.pow(mayor, menor);

        System.out.println("La potencia del mayor por el menor es: " + potencia);
        return potencia;
    }
    // • Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

    public static void calculaRaiz(Matematica mate) {

        double raiz = Math.sqrt(Math.abs(Math.min(mate.getNum1(), mate.getNum2())));

        System.out.println("La raiz cuadrada del valor absoluto del numero menor es: " + raiz);

    }

}
