package es.ifp.programacion.estructuras.ejemplos;


import java.util.Scanner;

/**
 * Programa que realice la suma de números positivos. 
 * 
 * El programa acaba cuando el usuario introduce el cero o un número negativo.
 * 
 * @author juan
 *
 */


public class ProgramaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int num;
		int total=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca número a sumar:");
		num = Integer.parseInt(sc.nextLine());
		
		
		//El bucle finaliza cuando el usuario introduce el cero o un número negativo
		while (num>0) {
			total = total+num;
			System.out.println("Introduzca número a sumar:");
			num= Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("La suma de los números es:"+total);
		

	}

}
