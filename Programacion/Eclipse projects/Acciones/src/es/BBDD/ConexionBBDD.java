package es.BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import es.negocio.Usuario;

public class ConexionBBDD {
	private Connection conexion = null;
	public static final String SQL_INSERT = "INSERT INTO usuarios (nombre, apellidos, nombreusuario, contraseña) VALUES (?,?,?,?)";
	public static final String SQL_BUSCAR_NOMBRE_USUARIO = "SELECT nombreusuario FROM usuarios WHERE nombreusuario = ?";
	
	public Connection conectar() {
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}
	
	public static void persistirDatos(Usuario usuario) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			PreparedStatement ps = null;
			ps = conexion.prepareStatement(SQL_INSERT);
			ps.setString(1, usuario.getNombre());
			ps.setString(2, usuario.getApellidos());
			ps.setString(3, usuario.getNombreUsuario());
			ps.setString(4, usuario.getContraseña());
			
			if (ps.executeUpdate() == 1) 
				System.out.println("Se ha creado correctamente");
			else 
				System.out.println("no se ha podido crear");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static boolean esUsuarioNuevo(Usuario usuario1) {
		// TODO Auto-generated method stub
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
			ps = conexion.prepareStatement(SQL_BUSCAR_NOMBRE_USUARIO);
			ps.setString(1, usuario1.getNombreUsuario());
			rs = ps.executeQuery();
			if(!rs.next())
				return true;
			else
				return false;
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
				rs.close();
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;
	}
}
