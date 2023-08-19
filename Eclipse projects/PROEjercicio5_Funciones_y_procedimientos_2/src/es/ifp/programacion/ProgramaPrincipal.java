package es.ifp.programacion;

import java.util.Scanner;

/**
 * Trabajando la segunta actividad prácticva de la UF2 de Programación
 * 
 * Crea un programa en Java implementando funciones o procedimientos siguiendo los siguientes requisitos:
 * 
 * 1.- Reverso
 *  La función/procedimiento recibirá una cadena y retornará la cadena en orden inverso

 * 2.- Revés
 * La función/procedimiento recibirá dos cadenas y retornará una cadena concatenando ambas en orden inverso. Esto es, el segundo parámetro se mostrará al principio, separadas por un guión.
 * Por ejemplo: Se recibe: "hola" y "adios". Retornará "adios-hola"
 * 
 * 3.- Contar vocales
 * La función/procedimiento recibirá una cadena y retornará el número de vocales (a,e,i,o,u) que contiene la cadena.
 * 
 * 4.- Repite
 * La función/procedimiento recibirá dos parámetros, un String y un entero. La función retornará la concatenación del primer parámetro tantas veces como se indique en el número entero.
 * 
 * 5.- Es positivo
 * Dado un número entero pasado como parámetro, la función/procedimiento devolverá true si es positivo el número, false en caso contrario.
 * 
 * Comportamiento del programa:
 * Crea un programa principal que ejecute por orden las cuatro funciónes/procedimientos, pidiendo al usuario la información necesaria para ejecutarlo correctamente.
 * Define adecuadamente las funciones o procedimientos, nombres, parámetros y tipos de retorno.
 * 
 * No se permitirá utilizar System.out.println en la implementación de los métodos de las operaciones arriba indicadas.
 * @author kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaración de variables
		String stringResultado;
		int numeroResultado;
		Boolean booleanResultado;
		String tmp1, tmp2;
		int tmpInt = 0;
		Scanner sc = new Scanner(System.in);
		
		//ejecución del programa en cascada
		System.out.println("==================Programa de ejecución==================");
		System.out.println("Escribe y se retornará la cadena al contrario de como la escribió");
		stringResultado = reverso(sc.nextLine());
		System.out.println("El resultado de reverso es: "+stringResultado);
		
		System.out.println("Escribe dos cadenas y se le retornará en el orden inverso a como las indrodujo");
		System.out.println("Escribe la primera:");
		tmp1 = sc.nextLine();
		System.out.println("Escribe la segunda:");
		tmp2 = sc.nextLine();
		stringResultado = reves(tmp1, tmp2);
		System.out.println("El resultado de revés es: "+stringResultado);
		
		System.out.println("Escribe y se retornará el número de vocales que hay en la cadena");
		numeroResultado = contarVocales(sc.nextLine());
		System.out.println("El resultado de contar Vocales es: "+numeroResultado);
		
		System.out.println("Escribe una cadena y un número y se retornará la cadenarepetida el número de veces que indicaste");
		System.out.println("Escribe la cadena de texto:");
		tmp1 = sc.nextLine();
		System.out.println("Escribe el número de veces que quieres repetirlo:");
		tmpInt = Integer.parseInt(sc.nextLine());
		stringResultado = repite(tmp1, tmpInt);
		System.out.println("El resultado de repite es: "+stringResultado);
		
		System.out.println("Escribe un número entero y se retornará true si es positivo y false si es negativo");
		booleanResultado = esPositivo(Integer.parseInt(sc.nextLine()));
		System.out.println("El resultado de esPositivo es: "+booleanResultado);
	}

	public static String reverso (String cadena1) {
		int longs = cadena1.length();
		String cadenaResultado = "";
		for(int i = longs-1; i >= 0; i--) {
			cadenaResultado = (cadenaResultado+cadena1.charAt(i));
		}
		return (cadenaResultado);
	}
	
	public static String reves (String cadena1, String cadena2) {
		return (cadena2+"-"+cadena1);
	}
	
	public static Integer contarVocales (String cadena1) {
		int longs = cadena1.length();
		int vocales = 0;
		for(int i = longs-1; i >= 0; i--) {
			if (cadena1.toLowerCase().charAt(i) == 'a' ||
				cadena1.toLowerCase().charAt(i) == 'e' ||
				cadena1.toLowerCase().charAt(i) == 'i' ||
				cadena1.toLowerCase().charAt(i) == 'o' ||
				cadena1.toLowerCase().charAt(i) == 'u') {
				vocales ++;
			}
		}
		return vocales;
	}
	
	public static String repite (String cadena, int num) {
		String cadenaResultado = "";
		for (int i = 0; i < num; i++) {
			cadenaResultado += cadena;
		}
		return cadenaResultado;
	}
	public static Boolean esPositivo (int num) {
		if (num >= 0) 
			return true;
		else
		return false;
	}
}
