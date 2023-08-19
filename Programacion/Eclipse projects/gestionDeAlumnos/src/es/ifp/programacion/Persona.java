package es.ifp.programacion;

/**
 * Clase raÃ­z de la jerarquÃ­a que contiene los atributos comunes a las clases hijas
 * Alumno y Profesor.
 * Por composiciÃģn se definen los datos de residencia en la clase Residencia.
 * 
 * No se permite la modificaciÃģn de: nombre, primerApellido, segundoApellido y DNI.
 * 
 * @author juan
 *
 */


public class Persona {
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String DNI;
	private String correoElectronico;
	private Residencia residencia;
	
	/**
	 * 
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param dni
	 */
	public Persona(String nombre, String primerApellido, String segundoApellido, String dni) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.DNI=dni;
		this.correoElectronico="No hay datos";
	}
	
	
	/**
	 * 
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param dni
	 * @param correo
	 * @param residencia
	 */
	public Persona(String nombre, String primerApellido, String segundoApellido, String dni, String correo, Residencia residencia) {
		this.nombre = nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido = segundoApellido;
		this.DNI=dni;
		this.correoElectronico=correo;
		this.residencia=residencia;
	}


	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}


	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	/**
	 * @return the residencia
	 */
	public Residencia getResidencia() {
		return residencia;
	}


	/**
	 * @param residencia the residencia to set
	 */
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
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
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}
	
	@Override
	public String toString() {
		if (this.getResidencia()!=null)
		
		return "Nombre:"+this.getNombre()+"\n"+
				"Primer apellido:"+this.getPrimerApellido()+"\n"+
				"Segundo apellido:"+this.getSegundoApellido()+"\n"+
				"DNI:"+this.getDNI()+"\n"+
				"Correo:"+this.getCorreoElectronico()+"\n"+
				"Residencia:"+this.getResidencia().toString();
		else 
			return "Nombre:"+this.getNombre()+"\n"+
			"Primer apellido:"+this.getPrimerApellido()+"\n"+
			"Segundo apellido:"+this.getSegundoApellido()+"\n"+
			"DNI:"+this.getDNI()+"\n"+
			"Correo:"+this.getCorreoElectronico()+"\n"+
			"Residencia: No hay datos";
		
	}
	
	
	
	

}