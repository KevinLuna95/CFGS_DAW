import es.cajero.bbdd.GestionBBDD;

public class ProgramaPrincipal {
/**
 * Crea una interfaz ATM (Automated banking machine) utilizando Java. En el proceso, deberás realizar 5 clases: 
 * para la cuenta, su titular, las transacciones, la entidad bancaria y el propio cajero.
 * Para acceder a los servicios, el usuario tendrá que introducir un identificador con un código pin. 
 * A continuación, tendrá acceso a un extracto de las transacciones, la posibilidad de recargar
 * y sacar dinero de la cuenta y realizar transferencias.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestionBBDD gestionBBDD = new GestionBBDD();
		gestionBBDD.conexionBBDD();
		
		
	}

}
