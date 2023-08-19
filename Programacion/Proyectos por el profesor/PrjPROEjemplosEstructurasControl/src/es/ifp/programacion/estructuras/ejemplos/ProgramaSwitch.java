package es.ifp.programacion.estructuras.ejemplos;


import java.util.Scanner;


/**
 * El programa mostrará una única vez el menú siguiente, pudiendo el usuario
 * seleccionar el número de opción o la letra que se muestra entre paréntesis
 * 
 * 
 *1.- Entrar (E)
 *2.- Ver (V)
 *3.- Modificar (M)
 *4.- Salir (S)
 * 
 * @author juan
 *
 */


public class ProgramaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaración de variables
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		
		System.out.println("Menu");
		System.out.println("1.- Entrar (E)");
		System.out.println("2.- Ver (V)");
		System.out.println("3.- Modificar (M)");
		System.out.println("4.- Salir (S)");
		
		
		System.out.println("Introduzca número o letra: ");
		opcion = sc.nextLine();
		
		
		//Disponible a partir de java 14
		
		switch(opcion) {
			case "1", "E": System.out.println("Entrar"); break;
			case "2", "V": System.out.println("Ver"); break;
			case "3", "M": System.out.println("Modificar"); break;
			case "4", "S": System.out.println("Salir"); break;
			default: System.err.println("Opción incorrecta"); break;
		}
		
		

	}

}
