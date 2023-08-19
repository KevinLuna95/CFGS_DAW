package es.ifp.programacion.poo.ejerciciopropuesto1d;

import java.util.Date;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avion avion1 = new Avion("Airbus A350", 180, "8000", new Date(), "Rafael Sanguino");
		
		Avion avion2 = new Avion("Boeing 787", 190, "7000", new Date(), "Jose Segura");
		
		
		System.out.println("===========================================");
		System.out.println(avion1.toString());
		System.out.println("===========================================");
		System.out.println(avion2.toString());
		System.out.println("===========================================");
		
		

	}

}
