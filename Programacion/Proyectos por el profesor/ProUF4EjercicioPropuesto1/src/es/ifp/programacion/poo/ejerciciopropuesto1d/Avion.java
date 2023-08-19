package es.ifp.programacion.poo.ejerciciopropuesto1d;


import java.util.Date;

/**
 * 
 * Se define la clase Avion con los atributos indicados en el enunciado.
 * 
 * - Definimos un solo constructor con todos los atributos
 * - La fecha de última revisión la voy a definir como un tipo Date.
 * - Voy a reescribir el método toString para escribir los datos en consola.
 * 
 * - Definimos los datos del responsable de la reparación como un tipo String que contiene
 * el nombre y los apellidos.
 * 
 * Pero, una solución más elegante y que se integra más en la POO, sería definir una clase, por ejemplo,
 * llamada ResponsableReparacion, que tenga dos atributos: nombre y apellidos (tipo String). Y por 
 * composición, se utilizaría en la clase Avion.
 * 
 * @author juan
 *
 */

public class Avion {

	//Atributos
	private String codigoAvion;
	private int numAsientos;
	private String kmAutonomia;
	private Date fechaUltimaRevision;
	private String responsable;
	
	//Constructores
	
	/**
	 * Constructor con todos los parámetros que inicializa los atributos de la clase
	 * y nos permite crear objetos de tipo Avion
	 * @param codigoAvion un String con el codigo de avion
	 * @param numAsientos un int con el número de asientos del avión
	 * @param kmAutonomia un String con los km de autonomía
	 * @param fechaUltimaRevision un tipo Date para reflejar la fecha de última revisión
	 * @param responsable un String con el nombre y apellidos del responsable de la reparacion
	 */
	public Avion(String codigoAvion, int numAsientos, String kmAutonomia, Date fechaUltimaRevision, String responsable) {
		this.codigoAvion=codigoAvion;
		this.numAsientos=numAsientos;
		this.kmAutonomia=kmAutonomia;
		this.fechaUltimaRevision=fechaUltimaRevision;
		this.responsable=responsable;
	}

	//Métodos
	/**
	 * Obtiene el código del avión
	 * @return the codigoAvion un String con el código del avión
	 */
	public String getCodigoAvion() {
		return codigoAvion;
	}

	/**
	 * Asigna un nuevo código de avión 
	 * @param codigoAvion the codigoAvion String con el nuevo código de avion
	 */
	public void setCodigoAvion(String codigoAvion) {
		this.codigoAvion = codigoAvion;
	}

	/**
	 * Obtiene el número de asientos
	 * @return the numAsientos un int con el número de asientos
	 */
	public int getNumAsientos() {
		return numAsientos;
	}

	/**
	 * Asigna un nuevo número de asientos para el avión
	 * @param numAsientos the numAsientos int con el nuevo número de asientos.
	 */
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	/**
	 * Obtiene los km de autonomía del avión
	 * @return the kmAutonomia un String con los km de autonomía
	 */
	public String getKmAutonomia() {
		return kmAutonomia;
	}

	/**
	 * Asigna nuevo número de km de autonomía al avión
	 * @param kmAutonomia the kmAutonomia un String con el nuevo dato de 
	 * km de autonomía
	 */
	public void setKmAutonomia(String kmAutonomia) {
		this.kmAutonomia = kmAutonomia;
	}

	/**
	 * Obtiene un tipo Date con la fecha de la última revisión
	 * @return the fechaUltimaRevision un Date con la fecha de la última revisión
	 */
	public Date getFechaUltimaRevision() {
		return fechaUltimaRevision;
	}

	/**
	 * Asigna nueva fecha de última revisión
	 * @param fechaUltimaRevision the fechaUltimaRevision un Date con la nueva fecha de la  
	 * última revisión
	 */
	public void setFechaUltimaRevision(Date fechaUltimaRevision) {
		this.fechaUltimaRevision = fechaUltimaRevision;
	}

	/**
	 * Obtiene un String con los datos del responsable de la reparación
	 * @return the responsable un String con los datos del responsable
	 */
	public String getResponsable() {
		return responsable;
	}

	/**
	 * Asigna nuevo datos al responsable de la reparación
	 * @param responsable the responsable un String con el nuevo responsable.
	 */
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	
	
	
	@Override
	/**
	 * Sobreescribimos el método toString para que retorne todos los datos
	 * del avión en un String.
	 * @Override es una anotación Java que indica que anule el método de la 
	 * superclase.
	 * @return un String con todos los atributos de la clase Avion
	 * 
	 */
	public String toString() {
		return "Código de avión:"+this.getCodigoAvion()+"\n"+
				"Número de asientos:"+this.getNumAsientos()+"\n"+
				"Kilómetros de autonomía:"+this.getKmAutonomia()+" km.\n"+
				"Fecha última revisión:"+this.getFechaUltimaRevision()+"\n"+
				"Responsable reparación:"+this.getResponsable();
	}
	
	
	
	
	
}
