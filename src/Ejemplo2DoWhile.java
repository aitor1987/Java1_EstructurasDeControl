/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner( System.in );

	//con do ejecuta lo que esta entre llaves al menos una vez, si introduces un numero mayor que 10 o menor que 1, lo que esta despues de do se sigue ejecutando hasta que introduzcas un numero menor que 10 o mayor que 1 ambos incluidos.
        do {
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
