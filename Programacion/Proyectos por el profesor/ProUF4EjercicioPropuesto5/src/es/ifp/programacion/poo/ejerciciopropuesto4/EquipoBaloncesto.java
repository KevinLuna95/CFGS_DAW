package es.ifp.programacion.poo.ejerciciopropuesto4;

public class EquipoBaloncesto {
	
	
	private String nombreEquipo;
	
	//Composición
	private Entrenador entrenador;
	
	//Composición
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador jugador3;
	private Jugador jugador4;
	private Jugador jugador5;
	
	
	private int partidosJugados;
	private int partidosGanados;
	private int partidosPerdidos;
	
	
	public EquipoBaloncesto(String nombre, Jugador j1, Jugador j2, Jugador j3, Jugador j4, Jugador j5, Entrenador entrenador) {
		this.nombreEquipo=nombre;
		this.jugador1=j1;
		this.jugador2=j2;
		this.jugador3=j3;
		this.jugador4=j4;
		this.jugador5=j5;
		this.entrenador=entrenador;
		this.partidosGanados=0;
		this.partidosPerdidos=0;
		this.partidosJugados=0;
	}


	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}


	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	/**
	 * @return the entrenador
	 */
	public Entrenador getEntrenador() {
		return entrenador;
	}


	/**
	 * @param entrenador the entrenador to set
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}


	/**
	 * @return the jugador1
	 */
	public Jugador getJugador1() {
		return jugador1;
	}


	/**
	 * @param jugador1 the jugador1 to set
	 */
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}


	/**
	 * @return the jugador2
	 */
	public Jugador getJugador2() {
		return jugador2;
	}


	/**
	 * @param jugador2 the jugador2 to set
	 */
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}


	/**
	 * @return the jugador3
	 */
	public Jugador getJugador3() {
		return jugador3;
	}


	/**
	 * @param jugador3 the jugador3 to set
	 */
	public void setJugador3(Jugador jugador3) {
		this.jugador3 = jugador3;
	}


	/**
	 * @return the jugador4
	 */
	public Jugador getJugador4() {
		return jugador4;
	}


	/**
	 * @param jugador4 the jugador4 to set
	 */
	public void setJugador4(Jugador jugador4) {
		this.jugador4 = jugador4;
	}


	/**
	 * @return the jugador5
	 */
	public Jugador getJugador5() {
		return jugador5;
	}


	/**
	 * @param jugador5 the jugador5 to set
	 */
	public void setJugador5(Jugador jugador5) {
		this.jugador5 = jugador5;
	}
	
	
	
	
	
	
	/**
	 * @return the partidosJugados
	 */
	public int getPartidosJugados() {
		return partidosJugados;
	}


	/**
	 * @return the partidosGanados
	 */
	public int getPartidosGanados() {
		return partidosGanados;
	}


	/**
	 * @return the partidosPerdidos
	 */
	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}
	
	
	
	public void partidoGanado() {
		this.partidosGanados++;
		this.partidosJugados++;
	}
	
	public void partidoPerdido() {
		this.partidosPerdidos++;
		this.partidosJugados++;
		
	}


	@Override
	public String toString() {
		return "Nombre de equipo:"+this.getNombreEquipo()+"\n"+
				"Entrenador:"+this.getEntrenador().toString()+"\n\n"+
				"Jugador 1:"+this.getJugador1().toString()+"\n\n"+
				"Jugador 2:"+this.getJugador2().toString()+"\n\n"+
				"Jugador 3:"+this.getJugador3().toString()+"\n\n"+
				"Jugador 4:"+this.getJugador4().toString()+"\n\n"+
				"Jugador 5:"+this.getJugador5().toString()+"\n\n"+
				"Partidos jugados:"+this.getPartidosJugados()+"\n"+
				"Partidos ganados:"+this.getPartidosGanados()+"\n"+
				"Partidos perdidos:"+this.getPartidosPerdidos();
				
		
		
		
		
	}
	
	

}
