package es.ifp.programacion.uf5.ejerciciopropuesto1;

/**
 * Clase que define los atributos de un alumno.
 * Hereda de la clase Persona que contiene los atributos
 * nombre, ape1, ape2, dni, correo y datos de residencia.
 * 
 * Se permite la modificación de los atributos de la clase.
 * 
 * @author juramire
 *
 */


public class Alumno extends Persona{
	
	//Atributos específicos de esta clase
	int edad;
	
	
	//Constructores
	
	public Alumno(String nombre, String primerApellido, String segundoApellido, String dni) {
		super(nombre, primerApellido,  segundoApellido,  dni);
	}
	
	public Alumno(String nombre, String primerApellido, String segundoApellido, String dni, String correo, int edad, Residencia residencia) {
		super(nombre, primerApellido,  segundoApellido,  dni, correo, residencia);
		this.edad=edad;
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
		
		return super.toString()+"\n"+
		"Edad:"+this.edad;
		
	}
	
	
	
	
	
	
	
	

}
