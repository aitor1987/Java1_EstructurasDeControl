/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class Ejemplo1While {
    public static void main(String[] args) {

	//declara las variables, a la variable suma le da el valor inicial de cero.
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");

	//lee un numero entero introducido por teclado.
        num = sc.nextInt();

	//aqui dice que mientras el numero introducido sea mayor o igual que cero seguira pidiendo numeros a introducir desde teclado hasta que se introduzca uno menor que cero.
        while (num >= 0){
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }

	//aqui mostrara en pantalla la suma de todos los numeros introducidos.
        System.out.println("La suma es: " + suma );
    }
}
