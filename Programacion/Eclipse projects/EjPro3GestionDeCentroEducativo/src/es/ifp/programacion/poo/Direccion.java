package es.ifp.programacion.poo;
public class Direccion {

	private String calle;
	private int numero;
	private String puerta;
	private String localidad;
	private String municipio;
	
	public Direccion(String calle, int numero, String puerta, String localidad, String municipio) {
		this.calle = calle;
		this.numero = numero;
		this.puerta = puerta;
		this.localidad = localidad;
		this.municipio = municipio;
	}
	public Direccion(String calle, int numero, String localidad, String municipio) {
		this.calle = calle;
		this.localidad = localidad;
		this.municipio = municipio;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String toString() {
		return "Direccion: calle: " + calle + ", numero: " + numero + ", puerta: " + puerta + ", localidad: " + localidad
				+ ", municipio: " + municipio;
	}

	
}
