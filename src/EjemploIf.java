/*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;
public class EjemploIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//declara la variable
        int num;      
        System.out.println("Introduzca numero: ");

	//lee un numero entero por teclado
        num = sc.nextInt();

	//impone la condicion de que el numero introducido sea divisible por 2 y que su resto sea 0 para ser par y en la pantalla se imprimira par
        if ((num%2)==0)
           System.out.println("PAR");

	//en caso contrario al anterior el numero sera impar y se imprimira en la pantalla.
        else
            System.out.println("IMPAR");
    }
}
