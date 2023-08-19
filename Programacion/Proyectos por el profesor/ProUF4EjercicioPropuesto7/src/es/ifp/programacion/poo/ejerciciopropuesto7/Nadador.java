package es.ifp.programacion.poo.ejerciciopropuesto7;

public class Nadador extends Persona implements IDeportista{
	
	private float peso;
	private float altura;
	
	public Nadador(String nombre, String apellidos, String dni, float peso, float altura) {
		super(nombre, apellidos, dni);
		this.peso=peso;
		this.altura=altura;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+
				"Peso:"+this.getPeso()+"\n"+
				"Altura:"+this.getAltura()+"\n";
	}
	
	
	public void compitiendo() {
		System.out.println(this.getNombre()+" "+this.getApellidos()+", nadador, está compitiendo");
	}
	
	
	
	
	
	

}
