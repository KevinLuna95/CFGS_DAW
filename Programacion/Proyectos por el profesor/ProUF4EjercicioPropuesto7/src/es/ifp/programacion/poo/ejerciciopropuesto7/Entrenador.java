package es.ifp.programacion.poo.ejerciciopropuesto7;

public class Entrenador extends Persona{
	
	private int aExperiencia;
	
	public Entrenador(String nombre, String apellidos, String dni, int exp) {
		super(nombre, apellidos, dni);
		this.aExperiencia=exp;
	}

	/**
	 * @return the aExperiencia
	 */
	public int getaExperiencia() {
		return aExperiencia;
	}

	/**
	 * @param aExperiencia the aExperiencia to set
	 */
	public void setaExperiencia(int aExperiencia) {
		this.aExperiencia = aExperiencia;
	}
	
	@Override
	public String toString() {
		return super.toString()+
				"Experiencia:"+this.getaExperiencia();
	}
	

	
	

}
