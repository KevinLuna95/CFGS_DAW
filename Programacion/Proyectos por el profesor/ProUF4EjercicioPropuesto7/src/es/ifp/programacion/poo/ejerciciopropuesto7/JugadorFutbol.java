package es.ifp.programacion.poo.ejerciciopropuesto7;

public class JugadorFutbol extends Persona implements IDeportista{
	
	private boolean esInternacional;
	
	
	public JugadorFutbol(String nombre, String apellidos, String dni, boolean esInternacional) {
		super(nombre, apellidos, dni);
		this.esInternacional=esInternacional;
	}


	/**
	 * @return the esInternacional
	 */
	public boolean isEsInternacional() {
		return esInternacional;
	}


	/**
	 * @param esInternacional the esInternacional to set
	 */
	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}
	
	
	@Override
	public String toString() {
		if (this.isEsInternacional())
		return super.toString()+"\n"+
				"Es internacional: Sí\n";
		
		else
			return super.toString()+"\n"+
			"Es internacional: No\n";
		
		
	}
	
	
	public void compitiendo() {
		System.out.println(this.getNombre()+" "+this.getApellidos()+", futbolista, está compitiendo");
	}
	
	
	
	
	
	

}
