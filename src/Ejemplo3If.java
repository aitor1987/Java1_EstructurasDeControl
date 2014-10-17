/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;
public class Ejemplo3If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

	//declara la variable nota como un numero con decimales.
      double nota;
      System.out.println("Introduzca una nota entre 0 y 10: ");

	//lee un numero con decimales por teclado
      nota = sc.nextDouble();
      System.out.println("La calificación del alumno es ");

	//impone la condicion de que si la nota introducida es menor que 0 o mayor que 10 imprima: nota no valida.
      if(nota < 0 || nota > 10)
         System.out.println("Nota no válida");

	//si la nota es 10 imprimira matricula de honor.
      else if(nota==10)
           System.out.println("Matrícula de Honor");

	//si la nota es 9 imprimira Sobresaliente.
      else if (nota >= 9)
           System.out.println("Sobresaliente");

	//si la nota es 7 imprimira Notable.
      else if (nota >= 7)
           System.out.println("Notable");

	//si la nota es 6 imprimira Bien.
      else if (nota >= 6)
           System.out.println("Bien");

	//si la nota es 5 imprimira Suficiente.
      else if (nota >= 5)
           System.out.println("Suficiente");

	//si la nota es menor que 5 imprimira Suspenso.
      else
           System.out.println("Suspenso");
    }
}
