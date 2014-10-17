/*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//declara las variables, a la variable contador le da el valor inicial de cero.
        int n, contador = 0;
        System.out.print("Introduce un número: ");

	//lee un numero entero introducido por teclado.
        n = sc.nextInt();

	//mientras contador sea menor que el numero introducido, suma uno al contador
        while (contador < n){
               System.out.println(" * ");
               contador++;
        }
    }
}
