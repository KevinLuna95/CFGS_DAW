package es.tresEnRaya.controlador;

import java.util.ArrayList;
import java.util.HashMap;

public class Tablero {
	private HashMap<String,String> infoTablero = new HashMap<String,String>();
	private ArrayList<String> registrodePartida = new ArrayList<String>();
	
	/**
	 * 		String tablero = "";
		
		tablero = " A B C"+"\n"+
				  "1 | | "+"\n"+
				  " -+-+-"+"\n"+
				  "2 | | "+"\n"+
				  " -+-+-"+"\n"+
				  "3 | | "+"\n";
		
		return tablero;
	 */
	public Tablero() {
		this.infoTablero.put("1A", " ");
		this.infoTablero.put("1B", " ");
		this.infoTablero.put("1C", " ");
		this.infoTablero.put("2A", " ");
		this.infoTablero.put("2B", " ");
		this.infoTablero.put("2C", " ");
		this.infoTablero.put("3A", " ");
		this.infoTablero.put("3B", " ");
		this.infoTablero.put("3C", " ");
	}
	
	public String get1A() {
		return this.infoTablero.get("1A");
	}
	public String get1B() {
		return this.infoTablero.get("1B");
	}
	public String get1C() {
		return this.infoTablero.get("1C");
	}
	public String get2A() {
		return this.infoTablero.get("2A");
	}
	public String get2B() {
		return this.infoTablero.get("2B");
	}
	public String get2C() {
		return this.infoTablero.get("2C");
	}
	public String get3A() {
		return this.infoTablero.get("3A");
	}
	public String get3B() {
		return this.infoTablero.get("3B");
	}
	public String get3C() {
		return this.infoTablero.get("3C");
	}

	public void set1A(String ficha) {
		this.infoTablero.replace("1A", ficha);
	}
	public void set2A(String ficha) {
		this.infoTablero.replace("2A", ficha);
	}
	public void set3A(String ficha) {
		this.infoTablero.replace("3A", ficha);
	}
	public void set1B(String ficha) {
		this.infoTablero.replace("1B", ficha);
	}
	public void set2B(String ficha) {
		this.infoTablero.replace("2B", ficha);
	}
	public void set3B(String ficha) {
		this.infoTablero.replace("3B", ficha);
	}
	public void set1C(String ficha) {
		this.infoTablero.replace("1C", ficha);
	}
	public void set2C(String ficha) {
		this.infoTablero.replace("2C", ficha);
	}
	public void set3C(String ficha) {
		this.infoTablero.replace("3C", ficha);
	}
	
	public Boolean contienePosicion(String posicion) {
		if(this.infoTablero.containsKey(posicion)) {
			if(this.infoTablero.get(posicion).equals(" "))
				return true;
			else
				return false;
		} else
			return false;
	}
	public void setValue(String posicion, String value) {
		this.infoTablero.replace(posicion, value);
	}
	
	public String tableroActual() {
		
		return " 1 2 3"+"\n"+
			   "A"+this.get1A()+"|"+this.get2A()+"|"+this.get3A()+"\n"+
			   " -+-+-"+"\n"+
			   "B"+this.get1B()+"|"+this.get2B()+"|"+this.get3B()+"\n"+
			   " -+-+-"+"\n"+
			   "C"+this.get1C()+"|"+this.get2C()+"|"+this.get3C()+"\n";
	}
	
	public void nuevaJugada(String jugada) {
		registrodePartida.add(jugada);
	}

	public int revisarVictoria() {
		if(get1A().equals(get1B())&&get1B().equals(get1C())&&!get1A().equals(" ")&&!get1B().equals(" ")&&!get1C().equals(" "))
			return 1;
		if(get2A().equals(get2B())&&get2B().equals(get2C())&&!get2A().equals(" ")&&!get2B().equals(" ")&&!get2C().equals(" "))
			return 1;
		if(get3A().equals(get3B())&&get3B().equals(get3C())&&!get3A().equals(" ")&&!get3B().equals(" ")&&!get3C().equals(" "))
			return 1;
		if(get1A().equals(get2A())&&get2A().equals(get3A())&&!get1A().equals(" ")&&!get2A().equals(" ")&&!get3A().equals(" "))
			return 1;
		if(get1B().equals(get2B())&&get2B().equals(get3B())&&!get1B().equals(" ")&&!get2B().equals(" ")&&!get3B().equals(" "))
			return 1;
		if(get1C().equals(get2C())&&get2C().equals(get3C())&&!get1C().equals(" ")&&!get2C().equals(" ")&&!get3C().equals(" "))
			return 1;
		if(get1A().equals(get2B())&&get2B().equals(get3C())&&!get1A().equals(" ")&&!get2B().equals(" ")&&!get3B().equals(" "))
			return 1;
		if(get1C().equals(get2B())&&get2B().equals(get3A())&&!get1C().equals(" ")&&!get2B().equals(" ")&&!get3A().equals(" "))
			return 1;
		if(!get1A().equals(" ")&&!get2A().equals(" ")&&!get3A().equals(" ")&&!get1B().equals(" ")&&!get2B().equals(" ")
				&&!get3B().equals(" ")&&!get1C().equals(" ")&&!get2C().equals(" ")&&!get3C().equals(" "))
			return 2;
		return 0;
	}
}
