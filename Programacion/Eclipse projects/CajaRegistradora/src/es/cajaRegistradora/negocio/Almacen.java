package es.cajaRegistradora.negocio;

public class Almacen {

	public Boolean gestionAlmacen(String opcion) {
		// TODO Auto-generated method stub
		if(opcion.toUpperCase().equals("FIN"))
			return false;
		else
			return true;
	}

}
