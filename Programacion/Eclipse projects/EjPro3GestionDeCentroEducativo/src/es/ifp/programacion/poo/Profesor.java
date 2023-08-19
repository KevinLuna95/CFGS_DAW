package es.ifp.programacion.poo;

public class Profesor extends Persona {


	private String titulacion;
	private String materiaPrincipal;
	
	public Profesor(String nombre, String primerApellido, String segundoApellido, String dni, String email, String titulacion, String materiaPrincipal,
			Direccion direccion, int telefono) {
		super(nombre, primerApellido, segundoApellido, dni, email, direccion, telefono);
		// TODO Auto-generated constructor stub
		this.titulacion=titulacion;
		this.materiaPrincipal=materiaPrincipal;
	}
	public Profesor(String nombre, String primerApellido, String segundoApellido, String dni) {
		super(nombre, primerApellido, segundoApellido, dni);
		this.titulacion="No hay titulacion indicada";
		this.materiaPrincipal="No hay materia principal indicada";
	}
	/**
	 * @return the titulacion
	 */
	public String getTitulacion() {
		return titulacion;
	}
	/**
	 * @param titulacion the titulacion to set
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	/**
	 * @return the materiaPrincipal
	 */
	public String getMateriaPrincipal() {
		return materiaPrincipal;
	}
	/**
	 * @param materiaPrincipal the materiaPrincipal to set
	 */
	public void setMateriaPrincipal(String materiaPrincipal) {
		this.materiaPrincipal = materiaPrincipal;
	}
	@Override
	public String toString() {
		if(getDireccion() != null)
		return  "nombre=" + getNombre() + "\n"+
				"primerApellido=" + getPrimerApellido() + "\n"+ 
				"segundoApellido=" + getSegundoApellido() + "\n"+ 
				"dni=" + getDni() +  "\n"+
				"titulacion=" + getTitulacion() + "\n"+
				"materiaPrincipal=" + getMateriaPrincipal() + "\n"+
				"email=" + getEmail() + "\n"+
				"direccion=" + getDireccion() + "\n"+
				"telefono=" + getTelefono();
		else
			return  "nombre=" + getNombre() + "\n"+
			"primerApellido=" + getPrimerApellido() + "\n"+ 
			"segundoApellido=" + getSegundoApellido() + "\n"+ 
			"dni=" + getDni() +  "\n"+
			"titulacion=" + getTitulacion() + "\n"+
			"materiaPrincipal=" + getMateriaPrincipal() + "\n"+
			"email=" + getEmail() + "\n"+
			"telefono=" + getTelefono();
			
	}
}