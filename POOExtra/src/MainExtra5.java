
import java.util.Scanner;

/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
public class MainExtra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[(int) (Math.random() * 12)];
        //System.out.println(mesSecreto);
        String mesUsuario;

        do {
            System.out.println("Adivine un mes del año");
            mesUsuario = leer.next();
            if (mesSecreto.equals(mesUsuario)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente nuevamente.");
            }
        } while (!mesSecreto.equalsIgnoreCase(mesUsuario));
    }
}

