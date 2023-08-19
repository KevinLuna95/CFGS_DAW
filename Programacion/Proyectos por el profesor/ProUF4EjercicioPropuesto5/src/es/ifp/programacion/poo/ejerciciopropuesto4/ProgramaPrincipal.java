package es.ifp.programacion.poo.ejerciciopropuesto4;
/**
 * Función, programa que realiza el programa principal
 * 
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entrenador entrenador = new Entrenador("Santiago", "Lakovic Guasch", "11223344A", 10);
		
		Jugador j1 = new Jugador("Nombre j1", "Apellidos j1", "11111111A", 1);
		Jugador j2 = new Jugador("Nombre j2", "Apellidos j2", "22222222A", 2);
		Jugador j3 = new Jugador("Nombre j3", "Apellidos j3", "33333333A", 3);
		Jugador j4 = new Jugador("Nombre j4", "Apellidos j4", "44444444A", 4);
		Jugador j5 = new Jugador("Nombre j5", "Apellidos j5", "55555555A", 5);
		
		EquipoBaloncesto equipoBal = new EquipoBaloncesto("Baloncesto Medianía La Pasadilla",
				j1, j2, j3, j4, j5, entrenador);
		
		
		System.out.println("===============Equipo Baloncesto===================");
		System.out.println(equipoBal.toString());
		
		
		System.out.println("===============Acciones equipo Baloncesto===================");
		
		equipoBal.partidoGanado();
		
		equipoBal.partidoPerdido();
		
		System.out.println("===============Equipo Baloncesto tras jugar===================");
		System.out.println(equipoBal.toString());
		
		
		
		
	}

}
