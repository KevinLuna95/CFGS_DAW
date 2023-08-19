package ejercicio1AccederInfoSGBD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Se solicita al alumo programar el siguiente sistema:
 * Es posible obtener información de una BBDD tales como: Driver, URL, nombre de usuario, tablas de una BBDD, etc.
 * 
 * Enunciado:
 * El ejercicio consistirá en obtener, utilizando el interfaz java.sql.DatabaseMetaData, los siguientes datos de una BBDD:
 * - Nombre de la BBDD.
 * - Driver JDBC
 * - URL
 * - Usuario de conexión a la BBDD.
 * 
 *  Para la BBDD mysql (que viene creada por defecto al instalar MySQL), obtener:
 * - catálogo
 * - esquema
 * - tabla
 * - tipo
 * @author kkevi
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		Connection conexion = null;
		DatabaseMetaData dbmd = null;
		ResultSet rs = null;
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/northwind","root","");
			
			dbmd = conexion.getMetaData();
			
			System.out.println("getDriverName(): "+dbmd.getDriverName());
			System.out.println("getUserName(): "+dbmd.getUserName());
			System.out.println("getDatabaseProductName(): "+dbmd.getDatabaseProductName());
			System.out.println("getURL(): "+dbmd.getURL());
			System.out.println("getCatalogs:");
			//el primer parametro, si es null muestra todas las tablas y columnas
			rs = dbmd.getTables("northwind", "mysql", null, null);
			
			while (rs.next()) {
				System.out.println(rs.getString(1)+" / "+rs.getString(2)+" / "+rs.getString(3)+" / "+rs.getString(4));
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
