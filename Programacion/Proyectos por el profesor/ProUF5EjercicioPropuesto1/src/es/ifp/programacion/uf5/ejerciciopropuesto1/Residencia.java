package es.ifp.programacion.uf5.ejerciciopropuesto1;

/**
 * Clase Residencia que refleja los datos
 * de residencia de una persona con los atributos
 * calle, numero, puerta, localidad y municipio.
 * @author juan
 *
 */

public class Residencia {
	
	//Atributos
	private String calle;
	private int numero;
	private String puerta;
	private String localidad;
	private String municipio;
	
	
	
	//Constructores
	/**
	 * Constructor con todos los parámetros
	 * @param calle
	 * @param numero
	 * @param puerta
	 * @param localidad
	 * @param municipio
	 */
	public Residencia(String calle, int numero, String puerta, String localidad, String municipio) {
		this.calle=calle;
		this.numero=numero;
		this.puerta=puerta;
		this.localidad=localidad;
		this.municipio=municipio;
	}



	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}



	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}



	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}



	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}



	/**
	 * @return the puerta
	 */
	public String getPuerta() {
		return puerta;
	}



	/**
	 * @param puerta the puerta to set
	 */
	public void setPuerta(String puerta) {
		this.puerta = puerta;
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
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}



	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	@Override
	/**
	 * Sobreescribimos el método toString 
	 * para la clase Residencia
	 */
	public String toString() {
		return "Calle:"+this.getCalle()
		+",número:"+this.getNumero()
		+",puerta:"+this.getPuerta()
		+",localidad:"+this.getLocalidad()
		+",municipio:"+this.getMunicipio();
		
	}
	
	
	

}
