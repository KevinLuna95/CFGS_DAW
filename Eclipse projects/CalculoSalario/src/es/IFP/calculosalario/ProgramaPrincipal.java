package es.IFP.calculosalario;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Definición de variables
		int numHoras;
		float precioPorHora, salario;
		Scanner sc = new Scanner(System.in);
		
		//bloque de entrada de datos
		
		System.out.println("Introduce el numero de horas trabajadas: ");
		numHoras = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el precio por hora: ");
		precioPorHora = Float.parseFloat(sc.nextLine());
		
		//Bloque de transformación
		
		salario = numHoras * precioPorHora;
		
		System.out.println("Tu salario es de: "+salario);
		
		
	}

}
