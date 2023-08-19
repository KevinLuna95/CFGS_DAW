package es.ifp.programacion.poo.ejerciciopropuesto4;

public class Jugador extends Persona{
	
	private int dorsal;
	
	public Jugador(String nombre, String apellidos, String dni, int dorsal) {
		super(nombre, apellidos, dni);
		this.dorsal=dorsal;
	}

	/**
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+
				"Dorsal:"+this.getDorsal();
	}
	
	
	

}
