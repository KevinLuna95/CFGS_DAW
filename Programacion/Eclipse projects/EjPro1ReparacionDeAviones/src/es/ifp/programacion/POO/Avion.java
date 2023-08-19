package es.ifp.programacion.POO;

import java.util.Date;

public class Avion {
	private String codigoAvion;
	private int numeroAsientos;
	private int autonimiaKM;
	private Date ultimaRevision;
	private String mecanico;
	
	public Avion(String codigoAvion, int numeroAsientos, int autonomiaKM, Date ultimaRevision, String mecanico) {
		this.codigoAvion=codigoAvion;
		this.numeroAsientos=numeroAsientos;
		this.autonimiaKM=autonomiaKM;
		this.ultimaRevision=ultimaRevision;
		this.mecanico=mecanico;
	}
	public String getCodigoAvion() {
		return codigoAvion;
	}
	public void setCodigoAvion(String codigoAvion) {
		this.codigoAvion=codigoAvion;
	}
	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	public int getAutonimiaKM() {
		return autonimiaKM;
	}
	public void setAutonimiaKM(int autonimiaKM) {
		this.autonimiaKM = autonimiaKM;
	}
	public Date getUltimaRevision() {
		return ultimaRevision;
	}
	public void setUltimaRevision(Date ultimaRevision) {
		this.ultimaRevision = ultimaRevision;
	}
	public String getMecanico() {
		return mecanico;
	}
	public void setMecanico(String mecanico) {
		this.mecanico = mecanico;
	}
	public String toString() {
		return 	  "Codigo de avion: "+this.codigoAvion+"\n"
				+ "Numero de asientos: "+this.numeroAsientos+"\n"
				+ "KM de autonomia: "+this.autonimiaKM+"\n"
				+ "Ultima revision: "+this.ultimaRevision+"\n"
				+ "Nombre y apellido del mecanico: "+this.mecanico;
	}
}
