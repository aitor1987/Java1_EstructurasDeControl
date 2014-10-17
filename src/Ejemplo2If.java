/*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class Ejemplo2If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

	//declara la variable hora como un numero entero.
        int hora;
        System.out.println("Introduzca una hora (un valor entero): ");

	//lee un numero entero por teclado
        hora = sc.nextInt();

	//impone la condicion de que para que imprima buenos dias la hora introducida debe de estar entre las 0 y las 12 del medio dia.
        if (hora >= 0 && hora < 12)
          System.out.println("Buenos días");

	//impone la condicion de que para que imprima buenas tardes la hora introducida debe de estar entre las 12 del medio dia y las 21
        else if (hora >= 12 && hora < 21)
           System.out.println("Buenas tardes");

	//impone la condicion de que para que imprima buenas noches la hora introducida debe de estar entre las 21 y las 24.
        else if (hora >= 21 && hora < 24)
            System.out.println("Buenas noches");

	//si introduces un numero que no sea una hora, por ejemplo 31 imprimira el mensaje de hora no valida
        else
            System.out.println("Hora no válida");
      }
}
