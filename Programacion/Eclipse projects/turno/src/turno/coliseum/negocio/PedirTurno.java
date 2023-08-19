package turno.coliseum.negocio;

import java.util.Date;
import java.util.ArrayList;

public class PedirTurno {
	private Turno turno;
	private ArrayList<Turno> listaTurnos;
	
	public PedirTurno() {
		this.listaTurnos = new ArrayList<Turno>();
	}

	/**
	 * @return the turno
	 */
	public Turno getTurno() {
		return turno;
	}

	/**
	 * @return the listaTurnos
	 */
	public ArrayList<Turno> getListaTurnos() {
		return listaTurnos;
	}

	/**
	 * @param listaTurnos the listaTurnos to set
	 */
	public void setListaTurnos(ArrayList<Turno> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}

	public Turno ultimoTurno(){
		if (getListaTurnos().isEmpty()) 
			return null;
		else
		return getListaTurnos().get(getListaTurnos().lastIndexOf(turno));
	}
	public Turno nuevoTurno() {
		if (ultimoTurno() == null) {
			this.turno = new Turno(1,false);
			getListaTurnos().add(turno);
			System.out.println(turno.toString());
			return turno;
		} else {
		this.turno = new Turno(ultimoTurno().getNumeroTurno()+1,false);
		getListaTurnos().add(turno);
		System.out.println(turno.toString());
		return turno;
		}
	}
	public void cambiarEstado(int numeroTurno) {
		ArrayList<Turno> listaTurnos = getListaTurnos();
		for (Turno turnoFor : listaTurnos) {
            if (turnoFor.getNumeroTurno() == numeroTurno) {
            	turnoFor.setAtendido(true);
                setListaTurnos(listaTurnos);
                System.out.println(turnoFor.toString());
                break;  // Salir del bucle una vez encontrado el turno
            }
        }
	}
	
	public Turno buscarTurno(int numeroTurno) {
		ArrayList<Turno> listaTurnos = getListaTurnos();
		for (Turno turnoFor : listaTurnos) 
            if (turnoFor.getNumeroTurno() == numeroTurno) 
            	return turnoFor;
		return null;
	}
	
	public boolean tiempoEsperaEsInferior(long segundos1, Date date) {
			if(date.getTime() - segundos1 > 5000)
				return false;
			else
				return true;
	}
}
