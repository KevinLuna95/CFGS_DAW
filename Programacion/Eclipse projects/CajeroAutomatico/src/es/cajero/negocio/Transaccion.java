package es.cajero.negocio;

public class Transaccion {
	int numeroTransaccion;
	String accion;
	Titular titularOrigen;
	Titular titularDestino;
	/**
	 * 
	 * @param numeroTransaccion
	 * @param accion
	 * @param titularOrigen
	 * @param titularDestino
	 */
	public Transaccion(int numeroTransaccion, String accion, Titular titularOrigen, Titular titularDestino) {
		super();
		this.numeroTransaccion = numeroTransaccion;
		this.accion = accion;
		this.titularOrigen = titularOrigen;
		this.titularDestino = titularDestino;
	}
	/**
	 * @return the numeroTransaccion
	 */
	public int getNumeroTransaccion() {
		return numeroTransaccion;
	}
	/**
	 * @param numeroTransaccion the numeroTransaccion to set
	 */
	public void setNumeroTransaccion(int numeroTransaccion) {
		this.numeroTransaccion = numeroTransaccion;
	}
	/**
	 * @return the accion
	 */
	public String getAccion() {
		return accion;
	}
	/**
	 * @param accion the accion to set
	 */
	public void setAccion(String accion) {
		this.accion = accion;
	}
	/**
	 * @return the titularOrigen
	 */
	public Titular getTitularOrigen() {
		return titularOrigen;
	}
	/**
	 * @param titularOrigen the titularOrigen to set
	 */
	public void setTitularOrigen(Titular titularOrigen) {
		this.titularOrigen = titularOrigen;
	}
	/**
	 * @return the titularDestino
	 */
	public Titular getTitularDestino() {
		return titularDestino;
	}
	/**
	 * @param titularDestino the titularDestino to set
	 */
	public void setTitularDestino(Titular titularDestino) {
		this.titularDestino = titularDestino;
	}
	
}
