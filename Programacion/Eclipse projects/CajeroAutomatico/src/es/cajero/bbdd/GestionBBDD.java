package es.cajero.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionBBDD {
	private String CONEXIONSQL = "jdbc:postgresql://localhost/appbank";
	
	public void conexionBBDD(){
		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection(CONEXIONSQL,"postgres","root");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
