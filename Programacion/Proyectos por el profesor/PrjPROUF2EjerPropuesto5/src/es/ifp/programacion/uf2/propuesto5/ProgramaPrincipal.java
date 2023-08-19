package es.ifp.programacion.uf2.propuesto5;


/**
 * Clase que implementa la solución al ejercicio propuesto 5 de la UF2
 * No incorpora menú (no dice nada el enunciado).
 * Las funciones se ejecutan secuencialmente una única vez.
 * No se permiten system.out.println en la implementación de las funciones
 * 
 */
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Declaración de Variables
		String tmp;
		String tmp2;
		int num;
		Scanner sc = new Scanner(System.in);
		
		//Primera función - reverso
		System.out.println("1.- Introduzca la cadena para obtener su reverso:");
		tmp = sc.nextLine();
		System.out.println("El reverso es:"+reverso(tmp));
		
		//Segunda función - revés
		System.out.println("2.- Introduzca la primera cadena para mostrarlas al revés:");
		tmp = sc.nextLine();
		System.out.println("Introduzca la segunda cadena para mostrarlas al revés:");
		tmp2 = sc.nextLine();
		System.out.println("El resultado es:"+reves(tmp, tmp2));
		
		
		//Tercera función - cuenta vocales
		System.out.println("3.- Introduzca la cadena para contar vocales:");
		tmp = sc.nextLine();
		System.out.println("El número de vocales es:"+contarVocales(tmp));
		
		//Cuarta función - repetir
		System.out.println("4.- Introduzca la cadena para repetir:");
		tmp = sc.nextLine();
		System.out.println("Introduzca el número de veces que se concatenará:");
		num = Integer.parseInt(sc.nextLine());
		System.out.println("El resultado es:"+repite(tmp, num));
		
		//Quinta función - esPositivo?
		System.out.println("5.- Introduzca un número para saber si es positivo o no:");
		num = Integer.parseInt(sc.nextLine());
		System.out.println("¿El número es positivo?"+esPositivo(num));
		

	}
	
	
	/**
	 * Función que dada una cadena pasada como parámetro la retorna en orden inverso
	 * @param cadena Cadena a revertir
	 * @return un String con la cadena en orden inverso
	 */
	public static String reverso(String cadena) {
		String str="";
		int lon = cadena.length();
		for (int i=lon-1;i>=0;i--) {  
			str+=cadena.charAt(i);  //Ojo, charAt empieza en 0 y acaba en la longitud -1
		}
		return str;
		
	}
	
	/**
	 * Dadas dos cadenas las intercambia de orden, separadas por un guión.
	 * @param str1 Primera cadena
	 * @param str2 Segunda cadena
	 * @return Un string en el que str2 es la primera cadena y str1 la segunda.
	 * Separadas por un guión.
	 */
	public static String reves(String str1, String str2) {
		return str2+"-"+str1;
		
	}
	
	/**
	 * Función que dada una cadena cuenta las vocales
	 * @param cadena String pasado como parámetro
	 * @return un int con el número de vocales de cadena
	 */
	public static int contarVocales(String cadena) {
		char c;
		int numVocales=0;
		int lon = cadena.length();
		for (int i=0;i<lon;i++) {
			c = cadena.charAt(i);
			if (c=='a' || c=='e' || c=='i' ||c=='o' || c=='u' )
				numVocales++;
		}
		return numVocales;
		
		
	}
	
	/**
	 * Función que concatena cadena el número de veces indicado en el segundo parámetro
	 * @param cadena String a repetir
	 * @param veces entero con el número de veces que se concatena
	 * @return un String concatenado tantas veces como se indica en el parámetro veces
	 */
	public static String repite(String cadena, int veces) {
		
		String str="";
		for (int i=1;i<veces;i++)
			str+=cadena;
		
		return str;
		
	}
	
	/**
	 * Función que retorna true si el número pasado como parámetro es positivo, false sino
	 * @param numero el número a evaluar
	 * @return true si es positivo, false sino
	 */
	public static boolean esPositivo(int numero) {
		if (numero>0) return true;
		else return false;
	}

}
