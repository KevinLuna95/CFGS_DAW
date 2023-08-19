package es.ifp.programacion.poo;

public class Alumno extends Persona {

	private int edad;
	/**
	 * 
	 * @param nombre nombre
	 * @param primerApellido 
	 * @param segundoApellido
	 * @param dni
	 * @param email
	 * @param direccion
	 * @param telefono
	 * @param edad
	 */
	public Alumno(String nombre, String primerApellido, String segundoApellido, String dni, String email,
			Direccion direccion, int telefono,int edad) {
		super(nombre, primerApellido, segundoApellido, dni, email, direccion, telefono);
		// TODO Auto-generated constructor stub
		this.edad=edad;
	}
	/**
	 * 
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param dni
	 */
	public Alumno(String nombre, String primerApellido, String segundoApellido, String dni) {
		super(nombre, primerApellido, segundoApellido, dni);

	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		if(getDireccion() != null)
		return  "nombre=" + getNombre() + "\n"+
				"primerApellido=" + getPrimerApellido() + "\n"+ 
				"segundoApellido=" + getSegundoApellido() + "\n"+ 
				"dni=" + getDni() +  "\n"+
				"email=" + getEmail() + "\n"+
				"direccion=" + getDireccion() + "\n"+
				"telefono=" + getTelefono() + "\n"+
				"edad=" + getEdad();
		else
			return  "nombre=" + getNombre() + "\n"+
			"primerApellido=" + getPrimerApellido() + "\n"+ 
			"segundoApellido=" + getSegundoApellido() + "\n"+ 
			"dni=" + getDni() +  "\n"+
			"email=" + getEmail() + "\n"+
			"telefono=" + getTelefono() + "\n"+
			"edad=" + getEdad();
	}
}