package es.cajero.interfaz;

public class Interfaz {
	String menuPrincipal;
	String pin;
	String menuIngresar;
	
	public Interfaz() {
		this.menuPrincipal = obtenerMenuPrincipal();
		this.pin = obtenerTextoPin();
		this.menuIngresar = obtenerMenuIngresar();
	}

	public String obtenerMenuIngresar() {
		return "Indica el importe a ingresar:";
	}

	public String obtenerTextoPin() {
		return "Indica tu Pin:";
	}

	public String obtenerMenuPrincipal() {
		return  "1- Transacciones"+"\n"+
				"2- Ingresar"+"\n"+
				"3- Retirar"+"\n"+
				"4- Realizar transferencia"+"\n"+
				"5- Finalizar sesion";
	}
	
	
}
