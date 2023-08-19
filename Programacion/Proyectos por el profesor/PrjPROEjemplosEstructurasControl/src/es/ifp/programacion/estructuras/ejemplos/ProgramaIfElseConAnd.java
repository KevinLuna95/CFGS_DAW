package es.ifp.programacion.estructuras.ejemplos;

import java.util.Scanner;

/**
 * Clase con ejemplo de uso de if-else
 * utilizando cadenas.
 * 
 * Se pide al usuario una cadena y un número
 * Si el valor introducido es 0 o el caracter 's' o el caracter 'S' y el número es negativo,
 * mostrará el mensaje "Condiciones correctas".
 * En caso contrario se mostrará un mensaje de finalización del programa.
 * 
 * 
 * @author juan
 *
 */

public class ProgramaIfElseConAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definición de variables
		String cadena;
		int num;  //por defecto se inicializa a 0
		Scanner sc = new Scanner(System.in);
	
		
		
		//Instrucciones
		//Entrada de datos
		
		System.out.println("Introduzca un valor, para salir (0, s o S):");
		cadena = sc.nextLine();
		
		
		System.out.println("Introduzca un número:");
		num = Integer.parseInt(sc.nextLine());
		
		
		
		//Transformación de datos
		//Salida de datos
		/*
		 * Tabla de verdad de un AND
		 * 
		 * V AND V -> V 
		 * V AND F -> F
		 * F AND V -> F
		 * F AND F -> F
		 * 
		
		 * Tabla de verdad de un OR
		 * 
		 * V OR V -> V 
		 * V OR F -> V
		 * F OR V -> V
		 * F OR F -> F
		 * 
		 */
		 
		
		if ( (cadena.equals("0") || cadena.equals("s") || cadena.equals("S"))  && (num<0) ) 
			System.out.println("Condiciones correctas");
		
		else
			System.out.println("Fin de la ejecución del programa");
		
		
		
		
		
		
		
		
		
		

	}

}
