/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
 */
package Entidades;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private Date fecnac;
    
    public Persona() {
    }

    public Persona(String nombre, Date fecnac) {
        this.nombre = nombre;
        this.fecnac = fecnac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }
    
}
