/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo1For {
    public static void main(String[] args) {
        final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento

	//declara la variable farenheit como un numero entero
        int fahrenheit;

	//declara la variable celsius como un numero con decimales
        double celsius;

	//le da a farenheit el valor inicial de 10
        fahrenheit = VALOR_INICIAL;


        System.out.printf("Fahrenheit \t Celsius \n");

	//mientras farenheit tenga el valor de 10, hasta que tenga el valor final de 100 incrementando su valor de 10 en 10 hara la operacion de abajo e imprimira el resultado junto a los grados farenheit.
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
             celsius = 5*(fahrenheit - 32)/9.0;
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
