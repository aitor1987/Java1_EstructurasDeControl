/*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class Ejemplo1OperadorCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//declara la variable num como numero entero
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();

	//si el numero introducido es divisible por dos imprime par, sino es divisible por 2 imprime impar.
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
