/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
public class Ejemplo1DoWhile {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner( System.in );

	//con do ejecuta lo que esta entre llaves al menos una vez, si introduces un numero mayor que 100, lo que esta despues de do se sigue ejecutando hasta que introduzcas un numero menor que 100
        do {
            System.out.print("Escribe un entero < 100: ");
            valor = in.nextInt();
        }while (valor >= 100);
        System.out.println("Ha introducido: " + valor);
    }
}
