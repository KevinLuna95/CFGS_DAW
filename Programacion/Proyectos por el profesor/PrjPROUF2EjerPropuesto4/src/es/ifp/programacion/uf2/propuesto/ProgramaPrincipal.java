package es.ifp.programacion.uf2.propuesto;

import java.util.Scanner;

/**
 * Programa que realiza una serie de tareas sobre cadenas
 * utilizando funciones y procedimientos.
 * @author juan
 *
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcion;
		Scanner sc = new Scanner(System.in);
		String str;
		int lon;
		
		
		do {
		muestraMenu();
		System.out.println("Introduzca la opción a ejecutar:");
		opcion = sc.nextLine();
		
		switch(opcion) {
			case "1": 
				System.out.println("Introduzca la cadena: ");
				str = sc.nextLine();
				str = mayusculas(str);
				System.out.println("La cadena en mayúsculas es:"+str);
				break;
			case "2": 
				System.out.println("Introduzca la cadena: ");
				str = sc.nextLine();
				lon = longitudCadena(str);
				System.out.println("La longitud de la cadena es:"+lon);
				break;
			case "3": 
				System.out.println("El número aleatorio es: "+numeroAleatorio()); 
				break;
			
			case "4": break;
			default: System.out.println("Opción incorrecta");break;
		
		}
		}while (!opcion.equals("4"));
		
		System.out.println("Fin de la ejecución del programa");
	}
	
	
	
	public static void muestraMenu() {
		System.out.println("=============================");
		System.out.println("Ejercicio propuesto UF2");
		System.out.println("=============================");
		System.out.println("1.- Mayúsculas");
		System.out.println("2.- Longitud de una cadena");
		System.out.println("3.- Número aleatorio");
		System.out.println("4.- Salir");
	}
	
	/**
	 * Procedimiento que pasa a mayúsculas la cadena pasada como argumento
	 */
	public static String mayusculas(String str) {
		return str.toUpperCase();
	}
	
	/**
	 * Procedimiento que retorna la longitud de la cadena
	 * @param str tipo String que se pasa como parámetro para calcular su longitud
	 * @return tipo int con la longitud de la cadena
	 */
	public static int longitudCadena(String str) {
		return str.length();
	}
	
	/**
	 * Función que retorna un número aleatorio
	 * @return tipo double aleatorio comprendido entre 0.0 y 1.0
	 */
	public static double numeroAleatorio() {
		return Math.random();
	}

}
