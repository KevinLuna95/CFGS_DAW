package ejercicio2InsertarEnBBDD;

public class Departamento {
	private int dpto_no;
	private String nombre;
	private String localidad;
	
	public Departamento(int dpto_no, String nombre, String localidad) {
		this.dpto_no = dpto_no;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	/**
	 * @return the dpto_no
	 */
	public int getDpto_no() {
		return dpto_no;
	}

	/**
	 * @param dpto_no the dpto_no to set
	 */
	public void setDpto_no(int dpto_no) {
		this.dpto_no = dpto_no;
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
		return "Numero: " + getDpto_no() + ", Nombre: " + getNombre() + ", Localidad: " + getLocalidad();
	}
	
	
	
}
