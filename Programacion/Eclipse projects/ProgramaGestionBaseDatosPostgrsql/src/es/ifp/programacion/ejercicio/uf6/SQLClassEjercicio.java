package es.ifp.programacion.ejercicio.uf6;

/**
 * Clase con variables estÃ¡ticas que definen las consultas SQL a realizar.
 * La forma de invocarlas (vista en la UF4) es como se invoca a una variable de clase.
 * 
 * Por ejemplo:
 * SQLClassEjercicio.SQL_INSERT
 * 
 * @author juan
 */
public class SQLClassEjercicio {
	/**
	 * Consulta SQL que permite la insercion de un empleado indicndo todos sus datos
	 */
	public static String SQL_INSERT = "insert into empleados values(?,?,?,?)";
	/**
	 * Consulta SQL que recoge toda la informacion(columnas) de la tabla empleados
	 */
	public static String SQL_GETALL = "select * from empleados";
	/**
	 * Consulta SQL que permite eliminar un empleado mediante su id de empleado
	 */
	public static String SQL_DELETE = "delete from empleados where empleadoid=?";
}

