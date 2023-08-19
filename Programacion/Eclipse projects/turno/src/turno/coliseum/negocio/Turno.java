package turno.coliseum.negocio;

import java.util.Date;

public class Turno {
	private int idTurno;
	private int numeroTurno;
	private Date horaTurno;
	private long segundos;
	private boolean atendido;
	public Turno() {
		
	}
	public Turno(int numeroTurno, boolean atendido) {
		this.numeroTurno = numeroTurno;
		this.horaTurno = new Date();
		this.segundos = horaTurno.getTime();
		this.atendido = atendido;
	}

	/**
	 * @return the segundos
	 */
	public long getSegundos() {
		return segundos;
	}

	/**
	 * @param segundos the segundos to set
	 */
	public void setSegundos(long segundos) {
		this.segundos = segundos;
	}

	/**
	 * @return the idTurno
	 */
	public int getIdTurno() {
		return idTurno;
	}

	/**
	 * @param idTurno the idTurno to set
	 */
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}

	/**
	 * @return the numeroTurno
	 */
	public int getNumeroTurno() {
		return numeroTurno;
	}

	/**
	 * @param numeroTurno the numeroTurno to set
	 */
	public void setNumeroTurno(int numeroTurno) {
		this.numeroTurno = numeroTurno;
	}

	/**
	 * @return the horaTurno
	 */
	public Date getHoraTurno() {
		return horaTurno;
	}

	/**
	 * @param horaTurno the horaTurno to set
	 */
	public void setHoraTurno(Date horaTurno) {
		this.horaTurno = horaTurno;
	}

	/**
	 * @return the atendido
	 */
	public boolean isAtendido() {
		return atendido;
	}

	/**
	 * @param atendido the atendido to set
	 */
	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}
	@Override
	public String toString() {
		return "Turno [idTurno=" + idTurno + ", numeroTurno=" + numeroTurno + ", horaTurno=" + horaTurno + ", segundos="
				+ segundos + ", atendido=" + atendido + "]";
	}
	
	
}
