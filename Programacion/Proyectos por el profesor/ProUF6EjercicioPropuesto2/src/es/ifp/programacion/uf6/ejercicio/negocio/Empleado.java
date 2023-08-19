package es.ifp.programacion.uf6.ejercicio.negocio;

public class Empleado {
	
	private int numEmpleado;
	private String apellidos;
	private int salario;
	private String oficio;
	private int numDpto;
	
	

	public Empleado(int numEmpleado, String apellidos, int salario, String oficio, int numDpto) {
		this.numDpto=numDpto;
		this.numEmpleado=numEmpleado;
		this.apellidos=apellidos;
		this.salario=salario;
		this.oficio=oficio;
	}

	public int getNumDpto() {
		// TODO Auto-generated method stub
		return this.numDpto;
	}

	/**
	 * @return the numEmpleado
	 */
	public int getNumEmpleado() {
		return numEmpleado;
	}

	/**
	 * @param numEmpleado the numEmpleado to set
	 */
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * @return the oficio
	 */
	public String getOficio() {
		return oficio;
	}

	/**
	 * @param oficio the oficio to set
	 */
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	/**
	 * @param numDpto the numDpto to set
	 */
	public void setNumDpto(int numDpto) {
		this.numDpto = numDpto;
	}
	
	
	@Override
	public String toString() {
		return "=====================================\n"+
				"Número empleado:"+this.getNumEmpleado()+"\n"+
				"Apellidos:"+this.getApellidos()+"\n"+
				"Salario:"+this.getSalario()+"\n"+
				"Puesto:"+this.getOficio()+"\n"+
				"Departamento:"+this.getNumDpto()+"\n"+
				"=====================================\n";
	}

}
