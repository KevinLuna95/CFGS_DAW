package es.ifp.programacion.ejercicio.uf6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Se asigna al alumno el nombre de unas funciones y los requerimientos para que los programemos.
 * Las funciones permiten, borrar, insertar y visualizar empleados. Además permite abrir y cerrar una conexión.
 * @author Kevin Luna Botey
 */
public class GestionBBDD {
	Connection conexion = null;
	ResultSet rs = null;
	Statement sentencia = null;
	PreparedStatement ps = null;
	int numFilas = 0;
	static String urlDDBB = "jdbc:postgresql://localhost:5432/empresaDB";
	
	/**
	 * Se conecta a la BBDD empresadb creada en postgreSQL.
	 * @return true si la conexiÃ³n fue satisfactoria, false sino.
	 */
	public boolean connectToDB() {
		try {
			//Mi conexion
			this.conexion = DriverManager.getConnection(urlDDBB,"postgres","root");
			
			//Conexion para Juan
			//this.conexion = DriverManager.getConnection(urlDDBB,"postgres","postgres");
			return true;
		} catch (SQLException e) {
			System.out.println("Informacion para el programador: Mensaje de error: "+e.getMessage());
			System.out.println("Fallo en la conexion a la base de datos");
			return false;
		}
	}
	
	/**
	 * Borra el registro de la tabla asociado al objeto emp pasado como parÃ¡metro
	 * @param emp objeto Empleado que se elimina de la BBDD
	 * @return true si el borrado fue correcto, false sino.
	 */
	public boolean deleteEmpleado(Empleado emp) {
		try {
			this.ps = conexion.prepareStatement(SQLClassEjercicio.SQL_DELETE);
			this.ps.setInt(1, emp.getIdempleado());
			this.ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println("Informacion para el programador: Mensaje de error: "+e.getMessage());
			System.out.println("No se ha podido eliminar el empleado");
			return false;
		}
		
	}
	
	/**
	 * A partir de un objeto empleado, inserta todos sus datos en la tabla empleados.
	 * @param emp Objeto de tipo empleado
	 * @return 0 si no se ha insertado valor alguno. En caso contrario, el nÃºmero de filas insertadas.
	 */
	public int insertarEmpleado(Empleado emp) {
		try {
			this.ps = conexion.prepareStatement(SQLClassEjercicio.SQL_INSERT);
			this.ps.setInt(1, emp.getIdempleado());
			this.ps.setString(2, emp.getNombre());
			this.ps.setString(3, emp.getApellidos());
			this.ps.setInt(4, emp.getSalario());
			this.ps.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("Informacion para el programador: Mensaje de error: "+e.getMessage());
			System.out.println("El empleado no ha sido creado. Ha ocurrido un error.");
			return 0;			
		}
	}
	
	/**
	 * Cierra todos los recursos relativos a la BBDD
	 * @return true si la operaciÃ³n fue correcta, false sino.
	 */
	public boolean closeResources() {
	try {
		this.conexion.close();
		this.ps.close();
		this.rs.close();
		this.sentencia.close();
		return true;
	} catch (SQLException e) {
		System.out.println("Informacion para el programador: Mensaje de error: "+e.getMessage());
		System.out.println("No se han podido cerrar las conexiones con la base de datos");
		return false;			
	}
	 
}
	
		
	
	/**
	 * Obtiene todos los registros de la tabla empleados
	 * @return un ArrayList de objetos de tipo Empleado mapeados a los registros de la tabla.
	 */
	public ArrayList<Empleado> getAllEmpleados(){
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado = null;
		
		try {
			this.sentencia = this.conexion.createStatement();
			this.rs = sentencia.executeQuery(SQLClassEjercicio.SQL_GETALL);
			
			/*
			 * Este bucle añadira un nuevo empleado en el arrayList de empleados para su posterior recperacion. De esta forma
			 * se pueden extraer todos los empleados de la bbdd.
			 * No es una forma muy eficiente, pero al no conocer adecuadamente las consultas sql 
			 * no podemos establecer las query para realizar consultas mas pequeñas y que requieran menor coste computacional.
			 * Con pocos registros no sera un problema, pero según crezca la BBDD éste tipo de consulta estara obsoleta.
			 */
			while(rs.next()) {
				empleado = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				empleados.add(empleado);
			}
			
		} catch (SQLException e) {
			System.out.println("Informacion para el programador: Mensaje de error: "+e.getMessage());
			System.out.println("Error: No se han podido obtener los datos.");
		}
		
		return empleados;
	}
}
