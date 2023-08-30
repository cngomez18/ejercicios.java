
import java.util.Arrays;

/*
 * 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
 */
public class Main10 {

    public static void main(String[] args) {

        double ArrayA[] = new double[50];
        
        for (int i = 0; i < ArrayA.length; i++) {
            ArrayA[i] = (int) (Math.random() * (5 - 20) + 20);
        }
        System.out.println("Array A, sin orden y aleatorio");
        MostrarArray(ArrayA);
        Arrays.sort(ArrayA);

        System.out.println(" ");
        System.out.println("Array A, ordenado de menor a mayor");
        MostrarArray(ArrayA);

        double ArrayB[] = Arrays.copyOf(ArrayA, 10);
        System.out.println(" ");
        System.out.println("ARRAY B");
        MostrarArray(ArrayB);
        Arrays.fill(ArrayB, 0.5);
        MostrarArray(ArrayB);

    }

    public static void MostrarArray(double Array[]) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" " + Array[i] + " ");
        }

    }
}
