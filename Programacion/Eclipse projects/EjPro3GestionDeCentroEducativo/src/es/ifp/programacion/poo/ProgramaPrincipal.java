package es.ifp.programacion.poo;

/**
 * Enunciado:
 * Se nos pide ahora, un desarrollo ciertamente parecido al del ejercicio propuesto 2. 
 * En este caso se nos pide que gestionemos profesores y alumnos siguiendo los siguientes requisitos:
 * 
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
 * Para cada alumno se desea almacenar:
 * - Nombre
 * - Apellidos. 
 * - DNI
 * - Correo electrónico
 * - edad
 * - Dirección de residencia (calle, número, puerta, localidad y municipio).
 * 
 * Además, se hacen las siguientes observaciones:
 * - El sistema de almacenamiento de esta información (una base datos) tiene dos campos para almacenar los apellidos del alumno y del profesor.
 * - Se podrán dar de alta en el sistema de gestión a los alumnos y profesores solo con los siguientes datos: Nombre, Apellidos y DNI. Si bien, lo normal es que tengamos toda la información para darlos de alta en el sistema.
 * - Estos datos: Nombre, apellidos y DNI no se podrán modificar una vez haya sido dado de alta un alumno o un profesor en el sistema.
 * 
 * Crea un pequeño programa para realizar las pruebas correspondientes con profesores y alumnos, mostrando todos sus datos.
 * 
 * @author kkevi
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno1 = new Alumno("Kevin","Luna","Botey","48065888M");
		Direccion direccionAlumno2 = new Direccion("calle europa",20,"A","Hospitalet","Barcelona");
		Alumno alumno2 = new Alumno("Laura","Luna","Botey","59965559M", "laulubo@gmail.com",
		direccionAlumno2, 665112356, 20);
		Profesor profesor1 = new Profesor("Antonio", "Perez", "Gonzalez", "84552366J");
		Profesor profesor2= new Profesor("Lola", "lopez", "zapata", "331456894P", "lolalo@gmail.com", "Medico forense", 
				"Criminologia 1", new Direccion("calle europa",20,"A","Hospitalet","Barcelona"), 633325658);		
		System.out.println(alumno1);
		System.out.println("==========================================================");
		System.out.println(alumno2);
		
		System.out.println("==========================================================");
		System.out.println("==========================================================");
		System.out.println(profesor1);
		System.out.println("==========================================================");
		System.out.println(profesor2);
	}

}
