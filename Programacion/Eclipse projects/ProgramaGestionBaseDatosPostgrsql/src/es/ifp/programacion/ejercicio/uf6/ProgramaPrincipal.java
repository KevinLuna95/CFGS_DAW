package es.ifp.programacion.ejercicio.uf6;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * Se solicita al alumno que cree una serie de funciones en una clase (En este caso GestionBBDD) para que el programa principal retorne una respuesta "concreta"
 * @author Kevin Luna Botey
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		GestionBBDD bd = new GestionBBDD(); 
		//El ID debería ser autoincremental y no ser proporcionado por "El usuario".
		Empleado empleado1 = new Empleado(1,"Paula","Ricard Fontes",1080);
		Empleado empleado2 = new Empleado(2,"Alba","Flores Petaca",1940);
		Empleado empleado3 = new Empleado(3,"Lucas","Perez Luna",1359);
		

		if(bd.connectToDB()) {
			System.out.println("Conexion Establecida");
			
			System.out.println("=====================================================================");
			System.out.println("1.- Mostramos todos los registros");
			System.out.println("=====================================================================");
			System.out.println(obtenerEmpleados(bd));
			
			System.out.println("=====================================================================");
			System.out.println("2.- Insertamos 3 empleados");
			System.out.println("=====================================================================");
			System.out.println(insertarEmpleados(empleado1,bd));
			System.out.println(insertarEmpleados(empleado2,bd));
			System.out.println(insertarEmpleados(empleado3,bd));
			
			System.out.println("=====================================================================");
			System.out.println("3.- Mostramos todos los registros");
			System.out.println("=====================================================================");
			System.out.println(obtenerEmpleados(bd));
			
			System.out.println("=====================================================================");
			System.out.println("4.- Borramos un registro");
			System.out.println("=====================================================================");
			System.out.println(borrarRegistro(empleado3,bd));
			
			System.out.println("=====================================================================");
			System.out.println("5.- Mostramos todos los registro");
			System.out.println("=====================================================================");
			System.out.println(obtenerEmpleados(bd));
		}
		else
			System.out.println("Ha ocurrido un error");
		
		bd.closeResources();
	}
	
	/**
	 * Una funcion para borrar un empleado de la base de datos
	 * @param emp empleado a eliminar
	 * @param bd base de datos de la que se ha de eliminar
	 * @return Un string manejando el error o la respuesta.
	 */
	public static String borrarRegistro(Empleado emp, GestionBBDD bd) {
		if(bd.deleteEmpleado(emp))
			return "Eliminado el empleado con id: "+emp.getIdempleado()+" "+emp.getNombre()+", "+emp.getApellidos();
		else
			return "No se ha podido eleminar el registro";
	}
	
	/**
	 * Una funcion que permite insertar un empleado en la base de datos
	 * @param emp Empleado a insertar
	 * @param bd Base de datos en la que se inserta
	 * @return Un string manejando el error o la respuesta.
	 */
	public static String insertarEmpleados(Empleado emp, GestionBBDD bd) {

		if(bd.insertarEmpleado(emp) == 0) 
			return "El empleado no se ha creado correctamente";
		else {
			return "Se ha insertado el registro con id "+emp.getIdempleado()+" en la BBDD: "+emp.getNombre()+", "+emp.getApellidos();
		}
	}
	
	/**
	 * Una funcion qe obtiene todos los empleados de la base de datos
	 * @param bd base de datos de la que se quiere mostrar
	 * @return Los Empleados existentes en la base de datos ya formateados
	 */
	public static String obtenerEmpleados(GestionBBDD bd){
		ArrayList<Empleado> empleados = bd.getAllEmpleados();
		String resultado = "";
		
		if(empleados.isEmpty())
			return "No hay registros en le tabla.";
		else {
			Iterator<Empleado> it = empleados.iterator();
			while(it.hasNext()) {
				if (resultado != "")
					resultado += "\n";
				resultado += "=========================================="+"\n";
				resultado += it.next().toString();
				resultado += "\n"+"==========================================";
			};
			return resultado;
		}
	}
}
