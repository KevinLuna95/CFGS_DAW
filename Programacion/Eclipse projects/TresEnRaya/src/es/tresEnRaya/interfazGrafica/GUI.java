package es.tresEnRaya.interfazGrafica;

import java.util.Scanner;
import es.tresEnRaya.controlador.Logica;
public class GUI {
	
	public String sc(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		return sc.nextLine();
	}
	
	public void menuPrincipal() {
		short resultado = 0;
		
		do {
			Logica logica=new Logica();
			System.out.println("======================================================");
			System.out.println("                     Tres En Raya"                     );
			System.out.println("======================================================");
			
			System.out.println("1. Nueva partida");
			System.out.println("2. Registro");
			System.out.println("3. Salir");
			
			resultado = Short.parseShort(sc("Indica la opcion:"));
			
			switch(resultado) {
			case 1:logica.partidaTresEnRaya();
			break;
			case 2:
				break;
			case 3:	break;
			default: System.out.println("El valor introducido no es valido");
			}
		}while(resultado != 3);
	}
}
