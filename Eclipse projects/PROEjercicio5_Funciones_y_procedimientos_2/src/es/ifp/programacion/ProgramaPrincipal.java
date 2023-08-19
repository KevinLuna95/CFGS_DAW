package es.ifp.programacion;

import java.util.Scanner;

/**
 * Trabajando la segunta actividad pr�cticva de la UF2 de Programaci�n
 * 
 * Crea un programa en Java implementando funciones o procedimientos siguiendo los siguientes requisitos:
 * 
 * 1.- Reverso
 *  La funci�n/procedimiento recibir� una cadena y retornar� la cadena en orden inverso

 * 2.- Rev�s
 * La funci�n/procedimiento recibir� dos cadenas y retornar� una cadena concatenando ambas en orden inverso. Esto es, el segundo par�metro se mostrar� al principio, separadas por un gui�n.
 * Por ejemplo: Se recibe: "hola" y "adios". Retornar� "adios-hola"
 * 
 * 3.- Contar vocales
 * La funci�n/procedimiento recibir� una cadena y retornar� el n�mero de vocales (a,e,i,o,u) que contiene la cadena.
 * 
 * 4.- Repite
 * La funci�n/procedimiento recibir� dos par�metros, un String y un entero. La funci�n retornar� la concatenaci�n del primer par�metro tantas veces como se indique en el n�mero entero.
 * 
 * 5.- Es positivo
 * Dado un n�mero entero pasado como par�metro, la funci�n/procedimiento devolver� true si es positivo el n�mero, false en caso contrario.
 * 
 * Comportamiento del programa:
 * Crea un programa principal que ejecute por orden las cuatro funci�nes/procedimientos, pidiendo al usuario la informaci�n necesaria para ejecutarlo correctamente.
 * Define adecuadamente las funciones o procedimientos, nombres, par�metros y tipos de retorno.
 * 
 * No se permitir� utilizar System.out.println en la implementaci�n de los m�todos de las operaciones arriba indicadas.
 * @author kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaraci�n de variables
		String stringResultado;
		int numeroResultado;
		Boolean booleanResultado;
		String tmp1, tmp2;
		int tmpInt = 0;
		Scanner sc = new Scanner(System.in);
		
		//ejecuci�n del programa en cascada
		System.out.println("==================Programa de ejecuci�n==================");
		System.out.println("Escribe y se retornar� la cadena al contrario de como la escribi�");
		stringResultado = reverso(sc.nextLine());
		System.out.println("El resultado de reverso es: "+stringResultado);
		
		System.out.println("Escribe dos cadenas y se le retornar� en el orden inverso a como las indrodujo");
		System.out.println("Escribe la primera:");
		tmp1 = sc.nextLine();
		System.out.println("Escribe la segunda:");
		tmp2 = sc.nextLine();
		stringResultado = reves(tmp1, tmp2);
		System.out.println("El resultado de rev�s es: "+stringResultado);
		
		System.out.println("Escribe y se retornar� el n�mero de vocales que hay en la cadena");
		numeroResultado = contarVocales(sc.nextLine());
		System.out.println("El resultado de contar Vocales es: "+numeroResultado);
		
		System.out.println("Escribe una cadena y un n�mero y se retornar� la cadenarepetida el n�mero de veces que indicaste");
		System.out.println("Escribe la cadena de texto:");
		tmp1 = sc.nextLine();
		System.out.println("Escribe el n�mero de veces que quieres repetirlo:");
		tmpInt = Integer.parseInt(sc.nextLine());
		stringResultado = repite(tmp1, tmpInt);
		System.out.println("El resultado de repite es: "+stringResultado);
		
		System.out.println("Escribe un n�mero entero y se retornar� true si es positivo y false si es negativo");
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
