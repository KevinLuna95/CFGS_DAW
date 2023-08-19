package prebasConBaseDeDatosBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Connection conexion = null;
		final String urlDDBB = "jdbc:mysql://localhost/test";
		ResultSet rs= null;
		String sql = "SELECT * FROM `usuarios`";
		ArrayList<Usuario> arrayUsuarios = new ArrayList<Usuario>();
		
		try {
			conexion  = DriverManager.getConnection(urlDDBB,"root","");
			System.out.println("Conexion establecida");
			
			Statement sentencia = conexion.createStatement();
			
			rs = sentencia.executeQuery(sql);
			
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
				arrayUsuarios.add(usuario);
				System.out.println(usuario);
			}
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			// TODO Auto-generated catch block
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
