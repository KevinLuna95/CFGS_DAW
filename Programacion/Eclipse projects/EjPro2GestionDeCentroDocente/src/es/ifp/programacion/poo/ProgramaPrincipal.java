package es.ifp.programacion.poo;
/**
 * Se solicita la creación de una gestión de software para un centro docente.
 * En esta primera parte del desarrollo se pide solo que se gestionen los profesores del centro. 
 * Para cada profesor se desea tener información sobre:
 * - Nombre
 * - Apellidos. 
 * - DNI
 * - Correo electrónico
 * - Titulación
 * - Materia principal que imparte
 * - Dirección de residencia (calle, número, puerta, localidad y municipio).
 * - Número de teléfono.
 * 
 * Además, se hacen las siguientes observaciones:
 * - El sistema de almacenamiento de esta información (una base datos) tiene dos campos para almacenar los apellidos del docente.
 * - Se podrán dar de alta en el sistema de gestión a los docentes solo con los siguientes datos: Nombre, Apellidos y DNI. 
 * Si bien, lo normal es que tengamos toda la información del docente para darle de alta en el sistema.
 * - Estos datos: Nombre, apellidos y DNI no se podrán modificar una vez haya sido dado de alta un docente en el sistema.
 * 
 * Crea un pequeño programa para realizar las pruebas correspondientes con dos o tres docentes, mostrando en consola todos sus datos.
 * @author kkevi
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor profe = new Profesor("Kevin", "Luna", "Botey", "48065888M","correo@correos.es",
				"Tecnico farmacia","Sistema de organizacion", new Direccion("Av/europa", 23, "Hospi", "Barcelona"), 637738660 );
		
		System.out.println(profe.toString());
	}

}
