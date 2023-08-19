package es.ifp.programacion.ejercicio.retouf6;
/**
 * Clase que gestiona las consultas y conexiones SQL
 * @author Kevin Luna Botey
 *
 */
public class SQLATAJO {
	public static final String URL_BBDD = "jdbc:mysql://localhost/bbddretouf6";
	public static final String OBTENER_TODOS_USUARIOS = "SELECT id,nombre,apellidos,nombreUsuario,password FROM usuarios";
}
