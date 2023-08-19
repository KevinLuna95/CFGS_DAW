package es.ifp.programacion.estructuras.ejemplos;

import java.util.Scanner;

/**
 * Clase con ejemplo de uso de if-else
 * utilizando cadenas.
 * 
 * Se pide al usuario una cadena.
 * Si el valor introducido es 0 y el caracter 's' o el caracter 'S' se
 * mostrará un mensaje indicando el dato introducido.
 * En caso contrario se mostrará un mensaje de finalización del programa.
 * 
 * 
 * @author juan
 *
 */

public class ProgramaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definición de variables
		String cadena;
		Scanner sc = new Scanner(System.in);
	
		
		
		//Instrucciones
		//Entrada de datos
		
		System.out.println("Introduzca un valor, para salir (0, s o S):");
		cadena = sc.nextLine();
		
		
		
		//Transformación de datos
		//Salida de datos
		
		
		
		/** OPCION 1 **/
		/*if (cadena.equals("0")) {
			System.out.println("El valor introducido es 0");
		}
		else {
			
			if (cadena.equals("s"))
				System.out.println("El valor introducido es s");
			else
				if (cadena.equals("S"))
					System.out.println("El valor introducido es S");
				else
					System.out.println("Finalización del programa");
		}*/
		
		
		/** OPCION 2 **/
		/*
		 * Tabla de verdad de un OR
		 * 
		 * V OR V -> V 
		 * V OR F -> V
		 * F OR V -> V
		 * F OR F -> F
		 * 
		 */
		
		if (cadena.equals("0") || cadena.equals("s") || cadena.equals("S") ) {
			System.out.println("El valor introducido es: "+cadena);
		}
		else 
			System.out.println("Finalización del programa");
		
		
		
		
		
		
		
		
		
		

	}

}
