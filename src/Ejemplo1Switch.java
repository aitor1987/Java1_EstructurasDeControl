/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*;
public class Ejemplo1Switch {
    public static void main(String[] args) throws IOException{

	//declara las variables como numeros enteros ademas a la variable resultado le da el valor inicial de 0
        int A,B, Resultado = 0 ;

	//declara la variable operador como un caracter.
        char operador;

	//declara la variable calculado como un booleano de valor verdadero o true.
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduzca un numero entero:");

	//lee un numero entero por teclado
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");

	//lee un numero entero por teclado
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");

	//lee un caracter por teclado
        operador = (char)System.in.read();

	//ponemos la instruccion de decision multiple
        switch (operador) {

	//con case, dependiendo de el caracter que hemos introducido, hara una suma, resta o multiplicacion
                case '-' : Resultado = A - B;
                           break;
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B;
                           break;

		//en este case, solo hara la division si el numero introducido es diferente de 0, sino nos imprimira que el numero no se puede dividir por cero y la variable calculando tomara el valor de false
                case '/' : if(B!=0)
                              Resultado = A / B;
                           else{
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break;

		//en caso de no haber introducido ninguno de los caracteres definidos en case, mostrara en la pantalla: operador no valido y la variable calculando tomara el valor de false
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }

	//aqui en caso de que la variable calculando haya tomado el valor de true, mostrara en pantalla el resultado de la operacion.
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
