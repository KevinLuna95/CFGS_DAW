package es.ifp.programacion.poo.ejerciciopropuesto7;
/**
 * Función, programa que realiza el programa principal
 * 
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entrenador entrenador = new Entrenador("Santiago", "Lakovic Guasch", "11223344A", 10);
		
		JugadorBaloncesto j1 = new JugadorBaloncesto("Nombre j1", "Apellidos j1", "11111111A", 1);
		JugadorBaloncesto j2 = new JugadorBaloncesto("Nombre j2", "Apellidos j2", "22222222A", 2);
		JugadorBaloncesto j3 = new JugadorBaloncesto("Nombre j3", "Apellidos j3", "33333333A", 3);
		JugadorBaloncesto j4 = new JugadorBaloncesto("Nombre j4", "Apellidos j4", "44444444A", 4);
		JugadorBaloncesto j5 = new JugadorBaloncesto("Nombre j5", "Apellidos j5", "55555555A", 5);
		
		EquipoBaloncesto equipoBal = new EquipoBaloncesto("Baloncesto Medianía La Pasadilla",
				j1, j2, j3, j4, j5, entrenador);
		
		
		System.out.println("===============Equipo Baloncesto===================");
		System.out.println(equipoBal.toString());
		
		
		System.out.println("===============Acciones equipo Baloncesto===================");
		
		equipoBal.partidoGanado();
		
		equipoBal.partidoPerdido();
		
		System.out.println("===============Equipo Baloncesto tras jugar===================");
		System.out.println(equipoBal.toString());
		
		
		System.out.println("===============Futbolista===================");
		JugadorFutbol futbolista = new JugadorFutbol("Miguel", "Ramos", "33445566D", false);
		System.out.println(futbolista.toString());
		
		
		System.out.println("===============Nadador===================");
		Nadador nadador = new Nadador("Roman", "Phelps", "88776699H", 77, 13);
		System.out.println(nadador.toString());
		
		
		
		
	}

}
