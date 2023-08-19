package es.ifp.programacion.poo;

public class Profesor {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String dni;
	private String email;
	private String titulacion;
	private String materiaPrincipal;
	private Direccion direccion;
	private int telefono;
	
	public Profesor(String nombre, String primerApellido, String segundoApellido, String dni) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.dni=dni;
	}
	
	public Profesor(String nombre, String primerApellido, String segundoApellido, String dni, String email, String titulacion, String materiaPrincipal, Direccion direccion, int telefono) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.dni=dni;
		this.email=email;
		this.titulacion=titulacion;
		this.materiaPrincipal=materiaPrincipal;
		this.direccion=direccion;
		this.telefono=telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getMateriaPrincipal() {
		return materiaPrincipal;
	}

	public void setMateriaPrincipal(String materiaPrincipal) {
		this.materiaPrincipal = materiaPrincipal;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Profesor [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", dni=" + dni + ", email=" + email + ", titulacion=" + titulacion
				+ ", materiaPrincipal=" + materiaPrincipal + ", direccion=" + direccion.toString() + ", telefono=" + telefono
				+ "]";
	}
	public String toBaseString() {
		return "Profesor [nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", dni=" + dni + "]";
	}
	
}
