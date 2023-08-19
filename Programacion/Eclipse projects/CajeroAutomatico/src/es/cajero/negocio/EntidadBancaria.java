package es.cajero.negocio;

public class EntidadBancaria {
	String nombreEntidad;
	String cif;
	
	/**
	 * 
	 * @param nombreEntidad
	 * @param cif
	 */
	public EntidadBancaria(String nombreEntidad, String cif) {
		super();
		this.nombreEntidad = nombreEntidad;
		this.cif = cif;
	}

	/**
	 * @return the nombreEntidad
	 */
	public String getNombreEntidad() {
		return nombreEntidad;
	}

	/**
	 * @param nombreEntidad the nombreEntidad to set
	 */
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}
	
	
}
