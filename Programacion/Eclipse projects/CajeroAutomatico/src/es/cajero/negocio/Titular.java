package es.cajero.negocio;

public class Titular {
	private String nombre;
	private String primerApellido;
	private String SegundoApellido;
	private String dni;
	private String numeroCuenta;
	private int pin;
	/**
	 * 
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param dni
	 * @param cuenta
	 * @param pin
	 */
	public Titular(String nombre, String primerApellido, String segundoApellido, String dni, String numeroCuenta, int pin) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		this.dni = dni;
		this.numeroCuenta = numeroCuenta;
		this.pin = pin;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return SegundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the cuenta
	 */
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setNumeroCuenta(Cuenta cuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	
}
