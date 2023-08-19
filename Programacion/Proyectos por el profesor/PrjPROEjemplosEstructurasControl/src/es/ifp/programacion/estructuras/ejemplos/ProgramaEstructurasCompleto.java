package es.ifp.programacion.estructuras.ejemplos;

import java.util.Scanner;

/**
 * Programa que encuentra el número mayor de una secuencia de números.
 * 
 * 
 * 
 * @author juan
 *
 */

public class ProgramaEstructurasCompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaración de variables
		int totalNumeros=0;
		int numero;
		int masAlto=0;
		Scanner sc = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("¿Cuántos números va a introducir? ");
		totalNumeros = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Introduzca el número 1");
		masAlto = Integer.parseInt(sc.nextLine());
		
		
		for (int contador=2;contador<=totalNumeros;contador++) {
			
			System.out.println("Introduzca el número "+contador);
			numero = Integer.parseInt(sc.nextLine());
			
			if (numero>masAlto)
				masAlto = numero;
			
		}
		
		System.out.println("El número más alto de la secuencia es:"+masAlto);
		
		
		
		
		
		
		
	}

}
