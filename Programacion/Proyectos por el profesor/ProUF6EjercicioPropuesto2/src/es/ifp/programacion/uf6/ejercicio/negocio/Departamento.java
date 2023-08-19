package es.ifp.programacion.uf6.ejercicio.negocio;

public class Departamento {
	
	private int numDpto;
	private String nombre;
	private String localidad;
	
	public Departamento(int numDpto, String nombre, String localidad) {
		this.numDpto=numDpto;
		this.nombre=nombre;
		this.localidad=localidad;
	}
	

	public int getNumDpto() {
		// TODO Auto-generated method stub
		return this.numDpto;
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




	/**
	 * @param numDpto the numDpto to set
	 */
	public void setNumDpto(int numDpto) {
		this.numDpto = numDpto;
	}
	
	
	@Override
	public String toString() {
		
		return  "=====================================\n"+
				"Número dpto:"+this.getNumDpto()+"\n"+
				"Nombre:"+this.getNombre()+"\n"+
				"Localidad:"+this.getLocalidad()+"\n"+
				"=====================================\n";
				
	}
	
	

}
