

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;


public class ProgramaPrincipal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String URL = "jdbc:mysql://localhost:3306/mysql";
		DatabaseMetaData dbmd;
		Connection conexion=null;
		ResultSet rs=null;
		
		try {
			conexion = DriverManager.getConnection(URL, "root", "");
			dbmd=conexion.getMetaData();
			System.out.println("INFORMACION DEL SGBD");
			System.out.println("====================================");
			System.out.println("Nombre:"+dbmd.getDatabaseProductName());
			System.out.println("Driver:"+dbmd.getDriverName());
			System.out.println("URL:"+dbmd.getURL());
			System.out.println("Usuario de BBDD:"+dbmd.getUserName());
			System.out.println("====================================");
			System.out.println("INFORMACION DE LA BBDD: MYSQL");
			System.out.println("====================================");
			rs = dbmd.getTables(null,  "mysql", null, null);
			while (rs.next()) {
				System.out.print(" Catálogo:"+rs.getString(1));
				System.out.print(" Esquema:"+rs.getString(2));
				System.out.print(" Tabla:"+rs.getString(3));
				System.out.print(" Tipo de tabla:"+rs.getString(4));
				System.out.println("\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conexion.close();
				rs.close();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
