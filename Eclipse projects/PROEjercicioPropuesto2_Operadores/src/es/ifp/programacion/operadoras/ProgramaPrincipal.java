package es.ifp.programacion.operadoras;

import java.util.Scanner;

/**
 * 
 * Realizando la actividad 2 para la práctica de operaciones. La práctica dice así:
 * 
 * Crea un programa en Java que realice la comparación entre dos números indicando si el primer número introducido es mayor, menor o igual.
 * 
 * El programa recibirá los dos números por teclado que serán introducidos por el usuario.
 * 
 * Una vez realizada la comparación se mostrará el resultado final en la consola.
 * 
 * Por ejemplo:
 * Entrada:
 * Dato1:  5
 * Dato2:  6
 * 
 * Salida: 
 * ¿El número 1 es menor que el número 2?: true
 * ¿El número 1 es igual que el número 2?: false
 * ¿El número 1 es mayor que el número 2?: false
 * 
 * 
 * 
 * @author Kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaracion de variables
		
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		//Solicitando datos por consola
		
		System.out.println("Introduce el primer numero:");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el segundo numero:");
		num2 = Integer.parseInt(sc.nextLine());
		
		//Imprimiendo los datos por consola
		System.out.println("El numero 1 es menor que el numero 2?:"+(num1<num2));
		System.out.println("El numero 1 es igual que el numero 2?:"+(num1==num2));
		System.out.println("El numero 1 es mayor que el numero 2?:"+(num1>num2));
		
	}

}
