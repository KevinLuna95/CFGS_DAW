package es.ifp.programacion.poo.ejerciciopropuesto7;

public class JugadorBaloncesto extends Persona implements IDeportista{
	
	private int dorsal;
	
	public JugadorBaloncesto(String nombre, String apellidos, String dni, int dorsal) {
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
	
	public void compitiendo() {
		System.out.println(this.getNombre()+" "+this.getApellidos()+", jugador de baloncesto, está compitiendo");
	}
	
	
	

}
