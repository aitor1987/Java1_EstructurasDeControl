/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;
public class Ejemplo0If {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );

	//imprime en la pantalla la palabra nota:
        System.out.print("Nota: ");

	//declara la variable nota y lee el numero introducido por el teclado
        int nota = sc.nextInt();

	//impone la condicion de que el numero que introduzcas sea mayor o igual que 5, si introduces un numero menor, el programa se cierra
        if (nota >= 5 ){
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
    }
}
