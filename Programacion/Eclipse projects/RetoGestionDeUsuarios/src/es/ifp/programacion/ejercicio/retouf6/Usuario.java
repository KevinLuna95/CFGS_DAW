package es.ifp.programacion.ejercicio.retouf6;
/**
 * Esta clase permite el majo de la informacion recibida por la BBDD.
 * Permitiira controlar adecuadamente la transformacion de datos.
 * @author Kevin Luna Botey
 *
 */
public class Usuario {
	private int id;
	private String nombre;
	private String apellidos;
	private String nombreUsuario;
	private String password;
	
	public Usuario(int id, String nombre, String apellidos, String nombreUsuario, String password) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	/**
	 * Obtiene el id del usuario
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * El ID no debería ser modificado nunca, de hecho suele ser un valor incremental en una BBDD
	 * Como en las especificaciones no se indica lo contrario, genero el setter.
	 * modifica el id del usuario
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre del usuario
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * modifica el nombre del usuario
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el apellido del usuario
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * modifica el apellido del usuario
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Obtiene el nombre de usuario del usuario
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * Modifica el nombre de usuario del usuario
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * ya que en la bbdd debería estar hasheada al obtenerla se recibiria el hash de la contraseña
	 * Ideal para comparar con la contraseña hasheada que introduce el usuario.
	 * Obtiene pa contraseña del usuario
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Esta contraseña deberñia ser hasheada antes de guardarla en la bbdd
	 * modifica la contraseña del usuario
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", Nombre:" + getNombre() + ", Apellidos: " + getApellidos() + ", Username: "
				+ getNombreUsuario() + ", Contraseña: " + getPassword();
	}
	
	
}
