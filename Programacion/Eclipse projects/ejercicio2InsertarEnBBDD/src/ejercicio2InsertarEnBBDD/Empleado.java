package ejercicio2InsertarEnBBDD;

public class Empleado {
	private int emp_no;
	private String apellido;
	private String oficio;
	private float salario;
	private int dpto_no;
	
	public Empleado(int emp_no, String apellido, String oficio, float salario, int dpto_no) {
		this.emp_no = emp_no;
		this.apellido = apellido;
		this.oficio = oficio;
		this.salario = salario;
		this.dpto_no = dpto_no;
	}
	public Empleado(String apellido, String oficio, float salario, int dpto_no) {
		this.apellido = apellido;
		this.oficio = oficio;
		this.salario = salario;
		this.dpto_no = dpto_no;
	}

	/**
	 * @return the emp_no
	 */
	public int getEmp_no() {
		return emp_no;
	}

	/**
	 * @param emp_no the emp_no to set
	 */
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}

	/**
	 * @return the dpto_no
	 */
	public int getDpto_no() {
		return dpto_no;
	}

	/**
	 * @param dpto_no the dpto_no to set
	 */
	public void setDpto_no(int dpto_no) {
		this.dpto_no = dpto_no;
	}

	@Override
	public String toString() {
		return "Numero de empleado=" + getEmp_no() + ", Apellido=" + getApellido() + ", Oficio=" + getOficio() + ", Salario=" + getSalario()
				+ ", Numero de departamento=" + getDpto_no();
	}
	
	
}
