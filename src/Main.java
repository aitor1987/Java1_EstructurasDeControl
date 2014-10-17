/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //declaración de variables
        double numero1, numero2;
        //leer el primer número
        System.out.println("Introduce el primer número:");
        numero1 = sc.nextDouble();     //lee un numero con decimales por teclado
        //leer el segundo número
        System.out.println("Introduce el segundo número:");
        numero2 = sc.nextDouble();     //lee un numero con decimales por teclado

	//muestra los numeros introducidos
        System.out.println("Números introducido: " + numero1 + "  " + numero2);

	//hace la suma de los numeros y muestra el resultado
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2));
	//hace la resta de los numeros y muestra el resultado
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2));
	//hace la multiplicacion de los numeros y muestra el resultado
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2);
    }
}
