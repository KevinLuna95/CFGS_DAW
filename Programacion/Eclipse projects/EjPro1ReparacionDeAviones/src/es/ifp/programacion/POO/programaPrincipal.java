package es.ifp.programacion.POO;

import java.util.Date;

/**
 * Se desea modelar la reparación de aviones de una empresa que realiza mantenimiento mécanico de aviones. Para ello desea incorporar a su programa informático, como primera parte de esta ampliación, la gestión de aviones.
 * De cada avión sobre el que realizan reparaciones  se dispone de la siguiente información:
 * - Código de avión. Es una cadena de caracteres.  Por ejemplo: Airbus A350.
 * - El número de asientos disponibles en el avión.
 * - Los kilómetros de autonomía.
 * - La fecha de última revisión.
 * - El nombre y apellidos del responsable de la reparación.
 * 
 * 
 * Crea un pequeño programa para realizar las pruebas correspondientes creando dos aviones y mostrando toda su información en la consola.
 * @author kkevi
 *
 */
public class programaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avion nave1 = new Avion("Airbus A350", 235, 1330, new Date(), "Antonio Perez");
		Avion nave2 = new Avion("Boeing 168", 190, 5240, new Date(), "Sandra Gonzalez");
		
		System.out.println(nave1.toString());
		System.out.println("==========================");
		System.out.println(nave2.toString());
	}

}
