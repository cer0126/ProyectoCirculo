package principal;

import figura.Circulo;

/**
 * Programa principal que nos calcula el area y perimetro asi como indicarnos la posicion de este.
 * @see <a href="http://www.albertoelvira.com">
 * @author Alberto
 */

public class Main {
//Punto de entrada para el programa
    public static void main(String[] args) {
        //Posicion inicial del circulo
        double centrox=2;
        double centroy=2;
        //Indicamos el radio
        double radio=4;
        Circulo c1 = new Circulo(centrox,centroy,radio);
        //Esto será lo que imprima
        System.out.println("Area = " + c1.areaCirculo());
        System.out.println("Perimetro = " + c1.perimetroCirculo());
        c1.moverCirculo(15,15);
        System.out.println("Centro (x) nuevo = " + c1.getCentrox());
        System.out.println("Centro (y) nuevo = " + c1.getCentroy());
    }   
}
