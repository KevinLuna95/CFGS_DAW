package es.ifp.programacion.funciones;

import java.util.Scanner;

public class ProgramaPrincipal {
/**
 * Se realizará el siguiente ejercicio que corresponde a la UF2 de Programación.
 * Crea un programa en Java en el que modularices lo máximo la resolución de los diferentes problemas que se plantean:
 * 
 * El programa mostrará el siguiente menú:
 * 1.- Mayúsculas
 * 2.- Longitud de una cadena
 * 3.- Número aleatorio
 * 4.- Salir
 * 
 * Comportamiento del programa:
 * El programa mostrará inicialmente este menú.
 * Si el usuario selecciona la opción 1, se pedirá al usuario una cadena. El programa retornará el número de caracteres de dicha cadena
 * Si el usuario selecciona la opción 2, se imprimirá la longitud de una cadena que el usuario introducirá por teclado.
 * La opción 3, mostrará un número aleatorio entre 0.0 y 1.0.
 * Si pulsa la opción 4, el programa finaliza.
 * El menú deberá mostrarse siempre y cuando no se haya pulsado la opción 4.
 * 
 * No se permitirá utilizar System.out.println en la implementación de los métodos de las operaciones arriba indicadas.
 * @param args
 */
	public static void main(String[] args) {
		// Declaración de variables
		String opcion = "";
		
		//Bucle do while para que el usuario pueda escoger su opción preferida
		do {
			separador();
			escribir("Escoge la opción preferida:");
			separador();
			menu();
			opcion = solicitarString();
			// Un switch para realizar los cambios correspondientes a la selección del usuario.
			switch (opcion) {
				case "1": escribir("El resultado es: "+mayusculas());
				break;
				case "2": escribir("El resultado es: "+longitud());
				break;
				case "3": escribir("El resultado es "+numeroRandom());
				break;
				case "4": break;
				default: escribir("El valor "+opcion+" no se encuentra entre las opciones, si desea salir pulse el 4");
			}
		}while (!opcion.equals("4"));
		
	}
	/**
	 * Un procedimiento que muestra as 4 opciones del menú
	 */
	public static void menu () {
		String opcion1 = "1.- Mayúsculas";
		String opcion2 = "2.- Longitud de una cadena";
		String opcion3 = "3.- Número aleatorio";
		String opcion4 = "4.- Salir";
		
		escribir(opcion1);
		escribir(opcion2);
		escribir(opcion3);
		escribir(opcion4);
	}
	/**
	 * Un procedimiento que se utiliza como separador entre el menú y los procesos de transformación
	 */
	public static void separador () {
		System.out.println("======================================");
	}
	/**
	 * Una funcion que permite al usuario introducir una cadena como String
	 * @return un String introducido por consola por el usuario
	 */
	public static String solicitarString () {
		Scanner sc = new Scanner(System.in);
		String cadena;
		cadena = sc.nextLine();
		return cadena;
	}
	
	/**
	 * La primera opción del manú. Su función es permitir a usuario introducir una cadena de texto que será transformada en mayúsculas
	 * @return la cadena introducida por el usuario pero en MAYUSCULAS
	 */
	public static String mayusculas () {
		String cadena;
		escribir("Ingresa una cadena");
		cadena = solicitarString();
		
		return cadena.toUpperCase();
	}
	/**
	 * La segunda opción del menú. Su funcon es indicar el número de caracteres que contiene la cadena escrita por el usuario
	 * @return el número de caracteres que tiene una cadena de texto
	 */
	public static int longitud() {
		String cadena;
		escribir("Ingresa una cadena");
		cadena = solicitarString();
		return cadena.length();
		
	}
	/**
	 * La tercera opción del menú. Su funcion es retornar un número aleatorio
	 * @return Un numero aleatorio
	 */
	public static double numeroRandom () {
		double numero = Math.random();
		return numero;
	}
	/**
	 * imprime en consola el string introducido por consola
	 * @param paramCadena
	 */
	public static void escribir (String paramCadena) {
		System.out.println(paramCadena);

	}

}
