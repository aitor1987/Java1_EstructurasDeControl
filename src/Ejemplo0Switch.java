/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Ejemplo0Switch {
    public static void main(String[] args) {

	//declara la variable mes como un numero entero.
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");

	//lee un numero entero por teclado
        mes = sc.nextInt();

	//ponemos la instruccion de decision multiple
        switch (mes)
        {

		//con case, dependiendo de que numero hemos introducido mostrara en la pantalla el mes correspondiente.
                case 1: System.out.println("ENERO");
                           break;    //con brake el control sale de la instruccion switch.
                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;

		//en caso de no haber introducido ninguno de los numeros definidos en case, mostrara en la pantalla: mes no valido.
                default : System.out.println("Mes no válido");                       
        }
    }
}
