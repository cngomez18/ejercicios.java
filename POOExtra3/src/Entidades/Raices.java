/*
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 */
package Entidades;

public class Raices {
    //Bhaskara
    private int A, B, C;
    private double discriminante;
    public boolean aux1, aux2;
    
    
    public Raices() {
    }

    public Raices(int A, int B, int C, double discriminante, boolean aux1, boolean aux2) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.discriminante = discriminante;
        this.aux1 = aux1;
        this.aux2 = aux2;
    }

    public boolean isAux1() {
        return aux1;
    }

    public void setAux1(boolean aux1) {
        this.aux1 = aux1;
    }

    public boolean isAux2() {
        return aux2;
    }

    public void setAux2(boolean aux2) {
        this.aux2 = aux2;
    }

    public double getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(double discriminante) {
        this.discriminante = discriminante;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }
    
}
