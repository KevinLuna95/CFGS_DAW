package es.ifp.programacion.cadenas;

import java.util.Scanner;
/**
 * 
 * Crea un programa en Java que reciba por parte del usuario (a través de teclado) cinco palabras y genere una salida en consola con los siguientes resultados:
 * - Concatenación, en el mismo orden de entrada, de las cinco palabras separadas por un espacio en blanco.
 * - Concatenación, en orden inverso a su entrada, de las cinco palabras separadas por el caracter '-'.
 * 
 * 
 * Nota: No se podrá imprimir directamente las palabras introducidas a través de la salida estándar. Deberá almacenarse en alguna variable temporal.
 * 
 * 
 * @author Kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Declaracion de variables
		String palabra1 = "";
		String palabra2 = "";
		String palabra3 = "";
		String palabra4 = "";
		String palabra5 = "";
		String cadena = "";
		String cadenaInvertida = "";
		String espacio = " ";
		String guion = "-";
		
		Scanner sc = new Scanner(System.in);
		
		// Entrada de datos
		System.out.println("Deverás introducir 5 palabras a continuación");
		System.out.println("Palabra 1:");
		palabra1 = sc.nextLine();
		
		System.out.println("Palabra 2:");
		palabra2 = sc.nextLine();
		
		System.out.println("Palabra 3:");
		palabra3 = sc.nextLine();
		
		System.out.println("Palabra 4:");
		palabra4 = sc.nextLine();
		
		System.out.println("Palabra 5:");
		palabra5 = sc.nextLine();
		
		// Transformacion de datos
		cadena = palabra1+espacio+palabra2+espacio+palabra3+espacio+palabra4+espacio+palabra5;
		cadenaInvertida = palabra5+guion+palabra4+guion+palabra3+guion+palabra2+guion+palabra1;
		// Salida de datos
		System.out.println("El resultado de la primera cadena es: "+cadena);
		System.out.println("El resultado de la segunda cadena (invertida) es: "+cadenaInvertida);

	}

}
