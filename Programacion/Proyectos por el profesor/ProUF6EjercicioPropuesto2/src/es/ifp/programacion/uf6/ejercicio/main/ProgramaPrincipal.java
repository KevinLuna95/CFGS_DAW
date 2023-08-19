package es.ifp.programacion.uf6.ejercicio.main;


/**
 * Ejercicio propuesto 2 - UF6
 * 
 * Gestión integral de empleados y departamentos.
 * Gestiona altas de empleados y departamentos.
 * Borrado de empleados y departamentos.
 * Listado de empleados y departamentos.
 * Actualización de salario de empleados.
 * 
 * Arquitectura en tres niveles: interfaz de usuario, negocio y persistencia.
 * Gestión de errores creando excepciones de usuario en ciertos casos.
 * 
 * Se podría seguir implementando el ejercicio con las siguientes funcionalidades:
 * 
 * - Modificación de datos de departamento.
 * - Modificación de datos de empleado.
 * - Mostrar departamento por su nombre o por su número de departamento.
 * - Añadir más gestión de errores en la entrada de datos (interfaz de usuario).
 * - Incorporar una gestión de directivos a la aplicación (alta, baja y modificación). 
 * Esto supondría modificar la estructura de clases para aplicar herencia.
 *
 */

import es.ifp.programacion.uf6.ejercicio.ui.InterfazDeUsuario;;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		//Arrancamos el interfaz de usuario y la aplicación
		InterfazDeUsuario ui = new InterfazDeUsuario();
		ui.start();
	}

}
