package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

/**
 * El programa deberá solicitar al usuario el número de día y de mes y deberá imprimirse en pantalla el mes en string y el día en número. 
 * @author Kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaración de variables
		
		String mesNombre = "";
		short mesNumero = 0, dia = 0, diaMinimo = 1, diaMaximo = 0;
		Scanner sc = new Scanner(System.in);
		
		// Solicitud de datos
		System.out.println("====================================================================");
		System.out.println("===============Comprueba la disponibilidad de trabajo===============");
		System.out.println("====================================================================");
		
		System.out.println("Indica el mes:");
		mesNumero = Short.parseShort(sc.nextLine());
		System.out.println("Indica el día:");
		dia = Short.parseShort(sc.nextLine());
		
		switch(mesNumero) {
		// Transformación: Condiciones para el funcionamiento de la aplicacion
		case 1: mesNombre = "Enero";
				diaMaximo = 31;
				break;
		case 2: mesNombre = "Febrero";
		//Teniendo en cuenta la posibilidad de año bisiesto
		diaMaximo = 29;
		break;
		case 3: mesNombre = "Marzo";
		diaMaximo = 31;
		break;
		case 4: mesNombre = "Abril";
		diaMaximo = 30;
		break;
		case 5: mesNombre = "Mayo";
		diaMaximo = 31;
		break;
		case 6: mesNombre = "Junio";
		diaMaximo = 30;
		break;
		case 7: mesNombre = "Julio";
		diaMaximo = 31;
		break;
		case 8: mesNombre = "Agosto";
		diaMaximo = 31;
		break;
		case 9: mesNombre = "Septiembre";
		diaMaximo = 30;
		break;
		case 10: mesNombre = "Octubre";
		diaMaximo = 31;
		break;
		case 11: mesNombre = "Noviembre";
		diaMaximo = 30;
		break;
		case 12: mesNombre = "Diciembre";
		diaMaximo = 31;
		break;
		}
		//Salida de datos
		if (dia>diaMaximo || dia<diaMinimo || mesNumero>12 || mesNumero<1) {
			System.out.println("La fecha introducida es incorrecta.");
		} else {
			System.out.println("Se ha introducido el día "+dia+" de "+mesNombre);
		}
	}
}
