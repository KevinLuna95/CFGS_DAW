package es.ifp.programacion.ejercicio.retouf6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
/**
 * Se pide al alumno que realice una consulta a una base de datos determinada aportada por el profesor.
 * Se pide expresamente el uso de HashMap con una aquitectura de Key: ID de usuario y un Value: Usuario
 * @author Kevin Luna Botey
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		HashMap<Integer,Usuario> usuariosTabla = new HashMap<Integer,Usuario>();
		Usuario usuario = null;
		Connection conexion = null;
		Statement sentencia = null;
		ResultSet rs = null;

		try {
			conexion = DriverManager.getConnection(SQLATAJO.URL_BBDD,"root","");
			sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(SQLATAJO.OBTENER_TODOS_USUARIOS);

			while(rs.next()) {
				usuario = new Usuario(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getString("nombreUsuario"),rs.getString("password"));
				usuariosTabla.put(usuario.getId(), usuario);
				
				//Desconozco si esta podría ser una forma más eficiente de proframarlo.
				//usuariosTabla.put(usuario.getId(), new Usuario(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getString("nombreUsuario"),rs.getString("password")));
			}
			
			//No era necesario pero me pareció interesante hacerlo para recordar este uso del bucle for
			for (Integer key : usuariosTabla.keySet()) {
				usuario = usuariosTabla.get(key);
				System.out.println("Clave tabla: "+key+" | Usuario: "+usuario.toString());
			}
			
		} catch (SQLException e) {
			//Se podria manejar de forma personalizada el error, pero la actividad no lo indica.
			e.printStackTrace();
			
		} finally {
			try {
				conexion.close();
				sentencia.close();
				rs.close();
			} catch (SQLException e) {
				//Se podria manejar de forma personalizada el error, pero la actividad no lo indica.
				e.printStackTrace();
			}
		}
	}
}
