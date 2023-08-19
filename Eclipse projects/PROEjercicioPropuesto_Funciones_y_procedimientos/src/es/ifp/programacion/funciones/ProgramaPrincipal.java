package es.ifp.programacion.funciones;

import java.util.Scanner;

public class ProgramaPrincipal {
/**
 * Se realizar� el siguiente ejercicio que corresponde a la UF2 de Programaci�n.
 * Crea un programa en Java en el que modularices lo m�ximo la resoluci�n de los diferentes problemas que se plantean:
 * 
 * El programa mostrar� el siguiente men�:
 * 1.- May�sculas
 * 2.- Longitud de una cadena
 * 3.- N�mero aleatorio
 * 4.- Salir
 * 
 * Comportamiento del programa:
 * El programa mostrar� inicialmente este men�.
 * Si el usuario selecciona la opci�n 1, se pedir� al usuario una cadena. El programa retornar� el n�mero de caracteres de dicha cadena
 * Si el usuario selecciona la opci�n 2, se imprimir� la longitud de una cadena que el usuario introducir� por teclado.
 * La opci�n 3, mostrar� un n�mero aleatorio entre 0.0 y 1.0.
 * Si pulsa la opci�n 4, el programa finaliza.
 * El men� deber� mostrarse siempre y cuando no se haya pulsado la opci�n 4.
 * 
 * No se permitir� utilizar System.out.println en la implementaci�n de los m�todos de las operaciones arriba indicadas.
 * @param args
 */
	public static void main(String[] args) {
		// Declaraci�n de variables
		String opcion = "";
		
		//Bucle do while para que el usuario pueda escoger su opci�n preferida
		do {
			separador();
			escribir("Escoge la opci�n preferida:");
			separador();
			menu();
			opcion = solicitarString();
			// Un switch para realizar los cambios correspondientes a la selecci�n del usuario.
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
	 * Un procedimiento que muestra as 4 opciones del men�
	 */
	public static void menu () {
		String opcion1 = "1.- May�sculas";
		String opcion2 = "2.- Longitud de una cadena";
		String opcion3 = "3.- N�mero aleatorio";
		String opcion4 = "4.- Salir";
		
		escribir(opcion1);
		escribir(opcion2);
		escribir(opcion3);
		escribir(opcion4);
	}
	/**
	 * Un procedimiento que se utiliza como separador entre el men� y los procesos de transformaci�n
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
	 * La primera opci�n del man�. Su funci�n es permitir a usuario introducir una cadena de texto que ser� transformada en may�sculas
	 * @return la cadena introducida por el usuario pero en MAYUSCULAS
	 */
	public static String mayusculas () {
		String cadena;
		escribir("Ingresa una cadena");
		cadena = solicitarString();
		
		return cadena.toUpperCase();
	}
	/**
	 * La segunda opci�n del men�. Su funcon es indicar el n�mero de caracteres que contiene la cadena escrita por el usuario
	 * @return el n�mero de caracteres que tiene una cadena de texto
	 */
	public static int longitud() {
		String cadena;
		escribir("Ingresa una cadena");
		cadena = solicitarString();
		return cadena.length();
		
	}
	/**
	 * La tercera opci�n del men�. Su funcion es retornar un n�mero aleatorio
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
