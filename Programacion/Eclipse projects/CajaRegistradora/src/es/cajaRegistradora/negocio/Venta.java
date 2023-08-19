package es.cajaRegistradora.negocio;

import java.util.ArrayList;

public class Venta {
	private int numeroVenta;
	private ArrayList<Producto> lineasDeVenta;
	private Producto producto;
	private int total;
	private String metodoPago;
	private int idCliente;
	
	public void lineasVenta() {
		// TODO Auto-generated method stub
		
	}


	public Boolean añadirProducto(String ean) {
		// TODO Auto-generated method stub
		if(ean.toUpperCase().equals("FIN"))
			return false;
		else
			return true;
	}


	public Boolean gestionRegistroVentas(String opcion) {
		// TODO Auto-generated method stub
		if(opcion.toUpperCase().equals("FIN"))
			return false;
		else
			return true;
	}


	public void verRegistroVentas() {
		// TODO Auto-generated method stub
		
	}
}
