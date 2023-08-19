package es.ifp.programacion;

/**
 * Clase que define los atributos de un alumno.
 * Hereda de la clase Persona que contiene los atributos
 * nombre, ape1, ape2, dni, correo y datos de residencia, matriculado.
 * 
 * Se permite la modificaciÃ³n de los atributos de la clase.
 * 
 * @author juramire
 *
 */


public class Alumno extends Persona{
	
	//Atributos especÃ­ficos de esta clase
	private int edad;
	private Boolean matriculado;
	
	
	//Constructores
	
	public Alumno(String nombre, String primerApellido, String segundoApellido, String dni) {
		super(nombre, primerApellido,  segundoApellido,  dni);
		this.matriculado=true;
	}
	
	public Alumno(String nombre, String primerApellido, String segundoApellido, String dni, String correo, int edad, Residencia residencia) {
		super(nombre, primerApellido,  segundoApellido,  dni, correo, residencia);
		this.edad=edad;
		this.matriculado=true;
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
	/**
	 * 
	 * @param matriculado the matriculado to set
	 */
	public void setMatriculado(Boolean matriculado) {
		this.matriculado=matriculado;
	}
	
	public Boolean getMatriculado() {
		return this.matriculado;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+"\n"+
		"Edad:"+this.edad;
		
	}
	
	
	
	
	
	
	

}