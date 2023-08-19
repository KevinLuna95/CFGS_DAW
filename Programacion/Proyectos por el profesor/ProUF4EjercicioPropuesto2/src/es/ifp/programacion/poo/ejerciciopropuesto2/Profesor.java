package es.ifp.programacion.poo.ejerciciopropuesto2;

/**
 * 
 * Clase que modeliza un Profesor para la gestión del centro docente
 * 
 * Por composición, defino un atributo de tipo Residencia
 * que contiene todos los datos de la residencia del docente.
 * 
 * 
 * Creamos un constructor con los datos: nombre, apellidos y dni
 * 
 * Otro constructor con todos los datos.
 * 
 * Creamos un constructor con un tipo Residencia y otro constructor con los datos básicos
 * de la clase Residencia y dentro de este constructor creo el objeto para asignar a mi atributo.
 * 
 * Sobreescribo el método toString para obtener los datos de los atributos.
 * En el caso del atributo residencia, delego en el método toString de la clase Residencia.
 * 
 * @author juan
 *
 */

public class Profesor {
	//Atributos de la clase
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	
	private String DNI;
	private String correoElectronico;
	
	private String titulacion;
	private String materiaPrincipal;
	
	private String telefono;
	
	//Por composición defino que mi clase Profesor se compone
	//de un atributo de tipo Residencia
	private Residencia residencia;
	
	
	//Constructores
	
	/**
	 * Constructor con tres parámetros definido a partir del enunciado y de la posibilidad
	 * de que se de de alta en el sistema un profesor con nombre, apellidos y dni.
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param dni
	 */
	public Profesor(String nombre, String primerApellido, String segundoApellido, String dni) {
		this.nombre=nombre;
		this.primerApellido=primerApellido;
		this.segundoApellido=segundoApellido;
		this.DNI=dni;
		this.telefono="No hay datos.";
		this.correoElectronico="No ya datos";
		this.titulacion="No hay datos";
		this.materiaPrincipal="No hay datos";
		this.telefono="No hay datos";
		
		
	}
	
	/**
	 * Constructor con todos los parámetros
	 * @param nombre
	 * @param pApellido
	 * @param sApellido
	 * @param dni
	 * @param correo
	 * @param titulacion
	 * @param materiaPrincipal
	 * @param telefono
	 * @param residencia
	 */
	public Profesor(String nombre, String pApellido, String sApellido, String dni, String correo, String titulacion, String materiaPrincipal, String telefono, Residencia residencia) {
		this.nombre=nombre;
		this.primerApellido=pApellido;
		this.segundoApellido=sApellido;
		this.DNI=dni;
		this.correoElectronico=correo;
		this.titulacion=titulacion;
		this.materiaPrincipal=materiaPrincipal;
		this.telefono=telefono;
		this.residencia=residencia;
	}
	
	
	/**
	 * Constructor con todos los parámetros
	 * @param nombre
	 * @param pApellido
	 * @param sApellido
	 * @param dni
	 * @param correo
	 * @param titulacion
	 * @param materiaPrincipal
	 * @param telefono
	 * @param residencia
	 */
	public Profesor(String nombre, String pApellido, String sApellido, String dni, String correo, String titulacion, String materiaPrincipal, String telefono, String calle, int numero, String puerta, String localidad, String municipio) {
		this.nombre=nombre;
		this.primerApellido=pApellido;
		this.segundoApellido=sApellido;
		this.DNI=dni;
		this.correoElectronico=correo;
		this.titulacion=titulacion;
		this.materiaPrincipal=materiaPrincipal;
		this.telefono=telefono;
		this.residencia= new Residencia(calle, numero, puerta, localidad, municipio);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	
	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	
	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	
	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}

	

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the titulacion
	 */
	public String getTitulacion() {
		return titulacion;
	}

	/**
	 * @param titulacion the titulacion to set
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	/**
	 * @return the materiaPrincipal
	 */
	public String getMateriaPrincipal() {
		return materiaPrincipal;
	}

	/**
	 * @param materiaPrincipal the materiaPrincipal to set
	 */
	public void setMateriaPrincipal(String materiaPrincipal) {
		this.materiaPrincipal = materiaPrincipal;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the residencia
	 */
	public Residencia getResidencia() {
		return residencia;
	}

	/**
	 * @param residencia the residencia to set
	 */
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	
	/**
	 * Método toString para escribir los datos
	 * @return un String con todos los datos del profesor.
	 */
	public String toString() {
		
		if (residencia==null)
			return 
					"Nombre:"+this.getNombre()+"\n"+
				   "Primer apellido:"+this.getPrimerApellido()+"\n"+
				   "Segundo apellido:"+this.getSegundoApellido()+"\n"+
				   "DNI:"+this.getDNI()+"\n"+
				   "Correo:"+this.getCorreoElectronico()+"\n"+
				   "Titulacion:"+this.getTitulacion()+"\n"+
				   "Materia principal:"+this.getMateriaPrincipal()+"\n"+
				   "Número de teléfono:"+this.getTelefono()+"\n"+
				   "Residencia: No hay datos";
		else
			return 
				"Nombre:"+this.getNombre()+"\n"+
			   "Primer apellido:"+this.getPrimerApellido()+"\n"+
			   "Segundo apellido:"+this.getSegundoApellido()+"\n"+
			   "DNI:"+this.getDNI()+"\n"+
			   "Correo:"+this.getCorreoElectronico()+"\n"+
			   "Titulacion:"+this.getTitulacion()+"\n"+
			   "Materia principal:"+this.getMateriaPrincipal()+"\n"+
			   "Número de teléfono:"+this.getTelefono()+"\n"+
			   "Residencia:"+this.residencia.toString();
	}
	
	
	
	
	
	

}
