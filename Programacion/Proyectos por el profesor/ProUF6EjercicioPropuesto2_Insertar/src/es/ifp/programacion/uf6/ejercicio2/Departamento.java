package es.ifp.programacion.uf6.ejercicio2;

public class Departamento {
	
	private int numDpto;
	private String nombre;
	private String localidad;
	
	
	public Departamento(int numDpto, String nombre, String localidad) {
		this.numDpto=numDpto;
		this.nombre=nombre;
		this.localidad=localidad;
	}


	/**
	 * @return the numDpto
	 */
	public int getNumDpto() {
		return numDpto;
	}


	/**
	 * @param numDpto the numDpto to set
	 */
	public void setNumDpto(int numDpto) {
		this.numDpto = numDpto;
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
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}


	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@Override
	public String toString() {
		return "========================================"+
		"\nNúmero dpto:"+this.getNumDpto()+
		"\nNombre:"+this.getNombre()+
		"\nLocalidad:"+this.getLocalidad()+
		"\n=============================================\n";
	}
	
	

}
