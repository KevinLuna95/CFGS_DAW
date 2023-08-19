package es.ifp.programacion.estructuras.ejemplos;

import java.util.Scanner;

/**
 * Lee números del teclado y muestra su suma.
 * El usuario introducirá la cantidad de números a sumar inicialmente
 * Y luego introducirá cada número.
 * El programa retornará la suma de todos ellos.
 * 
 * @author juan
 *
 */



public class ProgramaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int totalNumeros;
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		int numero;
		
		//Entrada de datos
		System.out.println("Introduzca cuantos números quiere sumar:");
		totalNumeros = Integer.parseInt(sc.nextLine());
		
		
		
		//Trasformación de datos
		//Salida de datos
		
		
		// La condición es que itere, se ejecute el bloque de instrucciones
		//tantas veces como el número que ha introducido
		for(int contador=1; contador <= totalNumeros ; contador++) {
			
			System.out.println("Introduzca el número "+contador);
			numero = Integer.parseInt(sc.nextLine());
			resultado += numero; //resultado = resultado + numero;
			
		}
		
		
		System.out.println("La suma total es:"+resultado);
		
		
		
		
		
		
		
		
	}

}
