/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo3While {
    public static void main(String[] args) {
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento

	//declara la variable farenheit como un numero entero
        int fahrenheit;

	//declara la variable celsius como un numero con decimales
        double celsius;

	//le da a farenheit el valor inicial de 10
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");

	//impone la condicion de que mientras farenheit sea menor o igial que el valor de 100 ejecute la operacion de calculo de grados celsius.
        while (fahrenheit <= VALOR_FINAL ){
               celsius = 5*(fahrenheit - 32)/9.0;
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);

	//incrementa el valor de farenheit de 10 en 10
               fahrenheit += PASO;
        }
    }
}
