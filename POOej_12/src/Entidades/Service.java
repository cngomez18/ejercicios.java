/*
 * 12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
21
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

public class Service {
    static Scanner leernum = new Scanner(System.in);
    static Scanner leerstr = new Scanner(System.in);
    
    public static void crearPersona(Persona per){
        int anio, mes, dia;
        
        System.out.println("Ingrese el nombre de la persona: ");
        per.setNombre(leerstr.nextLine()); 
        System.out.println("Ingrese la fecha de nacimiento, sin ceros");
        System.out.print("Año: "); anio = leernum.nextInt();
        anio = anio-1900;
        System.out.print("Mes: "); mes = leernum.nextInt();
        mes = mes-1;
        System.out.print("Día: "); dia = leernum.nextInt();
        
        Date fechaNac = new Date(anio, mes, dia);
        per.setFecnac(fechaNac);
        //String fechin = per.getFecnac().toString();
        //System.out.println(per.getNombre() + "\n" + fechin);
    }
    
    public static void calcularEdad(Persona per){
        Date fechaAct = new Date();
        int edadita = fechaAct.getYear() - per.getFecnac().getYear();
        System.out.println("La persona ("+per.getNombre()+") tiene "+ edadita+" años de edad");
    }
    
    public static void menorQue(int edad, Persona per){ //verdadero si la edad es menor a la de la persona 
        System.out.println("Ingrese una edad para comparar");
        edad = leernum.nextInt();
        
        Date fecAct = new Date();
        Date newFecha = new Date();
        newFecha.setYear(fecAct.getYear() - edad);
        if (newFecha.before(per.getFecnac())){ //before retorna verdadero si la fecha 1 es anterior a la fecha (2)
            System.out.println("La persona es menor");
        }else {
            System.out.println("La persona es mayor");
        }
            
        //String mostrar = newFecha.toString();
        //System.out.println(mostrar);
        
    }
    
    public static void mostrarPersona(Persona per){
        String nacimiento = per.getFecnac().toString();
        System.out.println("La persona creada se llama: "+per.getNombre()+""
                + "\nNacio el "+ nacimiento );
    }
}
