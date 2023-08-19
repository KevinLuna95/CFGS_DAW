package es.ifp.programacion.ejercicio.uf6;

/**
 * La clase empleados permite la gestion de un empleado con valores como el nombre, 
 * los apellios, el salarios y un identificador único(ID).
 * @author Kevin Luna Botey
 *
 */
public class Empleado {
	private int idempleado;
	private String nombre;
	private String apellidos;
	private int salario;
	/**
	 * @param idempleado Id del empleado
	 * @param nombre Nombre del empleado
	 * @param apellidos Apellidos del empleado
	 * @param salario Salario del empleado
	 */
	public Empleado(int idempleado, String nombre, String apellidos, int salario) {
		//El ID debería ser autoincremental y no ser proporcionado por "El usuario".
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	/** 
	 * Permite obtener el ID del empleado
	 * @return the idempleado
	 */
	public int getIdempleado() {
		return idempleado;
	}

	/** 
	 * Permite obtener el nombre del empleado
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite modificar el nombre del empleado
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Permite obtener los apellidos del empleado
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Permite modificar los apellidos del empleado
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Permite obtener el salario del empleado
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * Permite modificar el salario del empleado
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado: ID Empleado:" + this.getIdempleado() +
				"\n"+ "Nombre:" + this.getNombre() + "\n"+"Apellidos:" + this.getApellidos() + "\n"+"Salario:"
				+ this.getSalario();
	}
	
	
}
