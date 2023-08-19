package es.ipf.programacion.operadoresii;

import java.util.Scanner;
/**
 * 
 * Crea un programa en Java que reciba cuatro datos numéricos introducidos por el usuario a través del teclado
 * Dos de estos datos serán valores enteros y los otros dos, valores reales.
 * 
 * El programa, además de realizar la declaración adecuada de variables y su asignación correspondiente, realizará los siguientes cálculos:
 * 
 * 1.- La suma de los cuatro datos introducidos.
 * 2.- La multiplicación de los valores introducidos.
 * 3.- La resta de los datos introducidos siguiendo su orden de entrada en el programa.
 * 4.- Aumenta en una unidad todos los datos introducidos
 * 
 * Ejemplo:
 * Entrada de información:
 * Dato1: 5
 * Dato2: 3
 * Dato3: 2,3
 * Dato4: 3,4
 * 
 * Salida: 
 * 1.- La suma de los valores introducidos es: 13,7
 * 2.- La multiplicación de los valores introducidos es: 117,3
 * 3.- La resta de los valores introducidos es: -3,7
 * 4.- Los valores tras aumentar una unidad son: 6, 4, 3,3 y 4,4.
 * 
 * 
 * @author Kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Declaración de variables
		int datoEntero1 = 0;
		int datoEntero2 = 0;
		float datoDecimal1 = 0.0f;
		float datoDecimal2 = 0.0f;
		float sumaDeValores = 0.0f, multiplicacionDeValores = 0.0f, restaDeValores = 0.0f, aumentoDeValores = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		//Solicitud de datos desde teclado
		
		System.out.println("Introduce el primer numero sin decimal:");
		datoEntero1 = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce el segundo numero sin decimal:");
		datoEntero2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce el primer numero con decimal:");
		datoDecimal1 = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce el primer segundo con decimal:");
		datoDecimal2 = Float.parseFloat(sc.nextLine());

		//Transformación de datos
		sumaDeValores = datoEntero1 + datoEntero2 + datoDecimal1 + datoDecimal2;
		multiplicacionDeValores = datoEntero1 * datoEntero2 * datoDecimal1 * datoDecimal2;
		restaDeValores = datoEntero1 - datoEntero2 - datoDecimal1 - datoDecimal2;
		
		//Mostrando el resultado por consola
		
		System.out.println("Los numeros introducidos son: "+datoEntero1+", "+datoEntero2+", "+datoDecimal1+", "+datoDecimal1);
		System.out.println("El resultado de las operaciones son:");
		System.out.println("La suma de los 4 valores da "+sumaDeValores);
		System.out.println("La multiplicacion de los 4 valores da "+multiplicacionDeValores);
		System.out.println("La resta de los 4 valores da "+restaDeValores);
		System.out.println("El aumento en 1 de los 4 valores da "+(datoEntero1++)+" "+(datoEntero2++)+" "+(datoDecimal1++)+" "+(datoDecimal2++));
		

	}

}
