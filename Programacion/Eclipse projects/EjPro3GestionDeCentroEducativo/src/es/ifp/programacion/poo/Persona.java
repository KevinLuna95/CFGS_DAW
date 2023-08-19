package es.ifp.programacion.poo;

public class Persona {


	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private String email;
	private Direccion direccion;
	private int telefono;
	
	public Persona(String nombre, String primerApellido, String segundoApellido, String dni) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.dni=dni;
		this.email="No hay email";
	}
	
	public Persona(String nombre, String primerApellido, String segundoApellido, String dni, String email, Direccion direccion, int telefono) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.dni=dni;
		this.email=email;
		this.direccion=direccion;
		this.telefono=telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @return the d
	 */
	public String getDni() {
		return dni;
	}
	
	public String toString() {
		if(direccion != null)
		return  "nombre=" + getNombre() + "\n"+
				"primerApellido=" + getPrimerApellido() + "\n"+ 
				"segundoApellido=" + getSegundoApellido() + "\n"+ 
				"dni=" + getDni() +  "\n"+
				"email=" + getEmail() + "\n"+
				"direccion=" + getDireccion() + "\n"+
				"telefono=" + getTelefono();
		else
			return  "nombre=" + getNombre() + "\n"+
			"primerApellido=" + getPrimerApellido() + "\n"+ 
			"segundoApellido=" + getSegundoApellido() + "\n"+ 
			"dni=" + getDni() +  "\n"+
			"email=" + getEmail() + "\n"+
			"telefono=" + getTelefono();
	}

	
}
