/**
 * 
 */
package es.ifp.programacion.operaciones;

//importaciones:
import java.util.Scanner;

/**
 * @author Kevin Luna
 *
 */



public class ProgramaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaración de variables
		int num1, num2, result;
		Scanner sc = new Scanner(System.in);

		//entrada de datos
		System.out.println("Introduce el primer numero a sumar");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el primer numero a sumar");
		num2 = Integer.parseInt(sc.nextLine());
		
		//Transformación de datos
		result = num1+num2;
		
		System.out.println("El resultado de la suma es: "+result);
		
		
	}

}
