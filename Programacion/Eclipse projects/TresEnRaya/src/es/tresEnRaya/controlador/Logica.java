package es.tresEnRaya.controlador;

import es.tresEnRaya.interfazGrafica.GUI;

public class Logica {
	public void partidaTresEnRaya() {
		GUI gui=new GUI();
		Tablero tablero = new Tablero();
		String primerJugador = "";
		String segundoJugador = "";
		String tmp = "";
		Boolean band = false;
		Boolean bandComprobacion = false;
		int victoria;
		
		do {
			tmp = gui.sc("Indica que jugador emepara antes: O / X");
			
			if (!tmp.equals("X")&&!tmp.equals("O"))
				System.out.println("Ha indicado "+tmp+" Debe indicar que jugador empieza con la letra X o la letra O");
			else {
				primerJugador = tmp;
				if(tmp.equals("X"))
					segundoJugador = "O";
				else
					segundoJugador = "X";
			}
		}while(!tmp.equals("X")&&!tmp.equals("O"));
		
		do {
			if(band == false) {
				System.out.println(tablero.tableroActual());
				do {
					tmp = gui.sc("Es el turno de "+primerJugador+" indica donde colocar tu ficha");
					bandComprobacion = tablero.contienePosicion(tmp);
					if(bandComprobacion) {
						tablero.setValue(tmp, primerJugador);
						tablero.nuevaJugada(tablero.tableroActual());
					} else {
						System.out.println("El valor intoducido no es valido o la posicion ya esta ocupada");
					}
				}while(!bandComprobacion);
				victoria = tablero.revisarVictoria();
				if (victoria != 0) {
					band = true;
					System.out.println(tablero.tableroActual());
					if (victoria == 1)
						System.out.println("VICTORIA para el jugador "+primerJugador);
					else
						System.out.println("EMPATE");
					
				}
			}

			if (band == false) {
				System.out.println(tablero.tableroActual());
				do {
					tmp = gui.sc("Es el turno de "+segundoJugador+" indica donde colocar tu ficha");
					bandComprobacion = tablero.contienePosicion(tmp);
					if(bandComprobacion) {
						tablero.setValue(tmp, segundoJugador);
						tablero.nuevaJugada(tablero.tableroActual());
					} else {
						System.out.println("El valor intoducido no es valido o la posicion ya esta ocupada");
					}
				}while(!bandComprobacion);
				victoria = tablero.revisarVictoria();
				if (victoria != 0) {
					band = true;
					System.out.println(tablero.tableroActual());
					if (victoria == 1)
						System.out.println("VICTORIA para el jugador "+segundoJugador);
					else
						System.out.println("EMPATE");
				}
			}
		}while(band == false);
	}
}
