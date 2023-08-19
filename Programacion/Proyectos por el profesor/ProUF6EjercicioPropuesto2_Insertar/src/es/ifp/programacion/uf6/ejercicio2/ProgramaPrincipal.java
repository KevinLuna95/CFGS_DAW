package es.ifp.programacion.uf6.ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Obtendría los datos del teclado antes de crear el Departamento
		
		Departamento dpto = new Departamento(1, "Logística", "Barcelona");
		
		if (insertarEnBBDD(dpto))
			System.out.println("Registro insertado correctamente:\n"+dpto.toString());
		else
			System.out.println("El registro no se ha insertado:\n"+dpto.toString());
		
		

	}
	
	/**
	 * Insertar en la BBDD los datos del objeto departamento pasado como parámetro.
	 * @param dpto un objeto de tipo Departamento con los datos a insertar
	 * @return true si la inserción es correcta, false sino.
	 */
	private static boolean insertarEnBBDD(Departamento dpto) {
		Connection conexion;
		PreparedStatement ps;
		int numFilas;
		final String URL="jdbc:mysql://localhost:3306/ejerPersistenciaBD";
		
		try {
			conexion = DriverManager.getConnection(URL, "root", "");
			ps = conexion.prepareStatement(SQLFILE.SQL_INSERT_DEPTO);
			ps.setInt(1, dpto.getNumDpto());
			ps.setString(2,  dpto.getNombre());
			ps.setString(3,  dpto.getLocalidad());
			
			numFilas = ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		if (numFilas>0)
			return true;
		else
			return false;
		
	}
	
	
	
	

}
