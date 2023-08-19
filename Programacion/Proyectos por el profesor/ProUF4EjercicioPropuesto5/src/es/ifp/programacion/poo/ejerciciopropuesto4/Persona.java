package es.ifp.programacion.poo.ejerciciopropuesto4;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	public Persona(String nombre, String apellidos, String dni) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString(){
		
		return  "Nombre:"+this.getNombre()+"\n"+
			    "Apellidos:"+this.getApellidos()+"\n"+
				"Dni:"+this.getDni()+"\n";
		
	}
	
	
 
	

}
