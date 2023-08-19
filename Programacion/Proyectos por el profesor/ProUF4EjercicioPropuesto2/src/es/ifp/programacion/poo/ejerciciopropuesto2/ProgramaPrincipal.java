package es.ifp.programacion.poo.ejerciciopropuesto2;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Profesor juan = new Profesor("Juan", "Gutierrez", "García", "12345678A");
		Profesor maria = new Profesor("Maria", "Venta", "Mar", "98765432B");
		Profesor ana = new Profesor("Ana", "Pérez", "Pérez", "11223344V");
		
		System.out.println("Imprimos los datos de los tres profesores:");
		System.out.println("====================================================================");
		System.out.println(juan.toString());
		System.out.println("====================================================================");
		System.out.println(maria.toString());
		System.out.println("====================================================================");
		System.out.println(ana.toString());
		System.out.println("====================================================================");
		
		Residencia residenciaPepe= new Residencia("Calle Merced", 1, "A", "Manzanares", "Manzanares El Real");
		Profesor pepe = new Profesor("Jose", "Medina", "Medina", "99887766Z","correo@correo.es", "Matemáticas", "Ingenierio Telecomunicaciones", "666776655", residenciaPepe );
		System.out.println(pepe.toString());
		System.out.println("====================================================================");
		
		
		Profesor juana = new Profesor("Juana", "Hernández", "Hernández", "77668855D","correoJuana@correo.es", "Informática", "Ingenieria Informática", "99887766", "Calle Juana", 100, "B", "Carrizal", "Ingenio" );
		System.out.println(juana.toString());
		System.out.println("====================================================================");
		
		

	}

}
