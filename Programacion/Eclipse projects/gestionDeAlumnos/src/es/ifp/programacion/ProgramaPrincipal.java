package es.ifp.programacion;

import java.util.HashMap;
import java.util.Scanner;
/**
 * La forma correcto de hacerlo era con un linked list de Alumno
 * @author kkevi
 *
 */
public class ProgramaPrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Alumno alumno;
		String tmp;
		Alumno alumno2 = new Alumno("Kevin","Luna","Botey","48065888M");
		Alumno alumno3 = new Alumno("Kevin","Luna","Botey","48064853M");
		Alumno alumno4 = new Alumno("Kevin","Luna","Botey","48061254M");
		HashMap<String,Alumno> info = new HashMap<String,Alumno>();
		info.put(alumno2.getDNI(),alumno2);
		info.put(alumno3.getDNI(),alumno3);
		info.put(alumno4.getDNI(),alumno4);
		int menu;
		do {
			menu = menu();
			switch(menu) {
			case 1: 
				alumno = crearAlumno();
				info.put(alumno.getDNI(),alumno);
				break;
			case 2: 
				eliminarPorDni(info);
				break;
			case 3: 
				mostrarAlumnos(info);
				break;
			case 4: 
				System.out.println("Fin de la ejecucion");
				break;
			default: System.out.println("Valor introducido no valido. Prueba del 1 al 4");
			}
		}while (menu != 4);
	}
	
	/**
	 * Muestra un menu y pregunta al usuario que desea hacer
	 * @return un entero con la opcion del cliente
	 */
	public static int menu() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("=======================MENU=======================");
		System.out.println("Introduce el numero para acceder a la opcion");
		System.out.println("Opcion 1: Crear Alumno");
		System.out.println("Opcion 2: Borrar Alumno");
		System.out.println("Opcion 3: Mostrar todos los alumnos");
		System.out.println("Opcion 4: Salir");
		return sc.nextInt();
	}
	
	/**
	 * Crea un alumno y lo retorna
	 * @return el nuevo alumno
	 */
	public static Alumno crearAlumno() {
		Scanner sc =  new Scanner(System.in);
		String nombre;
		String apellido1;
		String apellido2;
		String dni;
		String correoElectronico;
		int edad;
		Residencia residencia;
		String calle;
		int numero;
		String puerta;
		String localidad;
		String municipio;
		
		System.out.println("Indica los datos del alumno:");
		System.out.println("Nombre:");
		nombre = sc.nextLine();
		System.out.println("Primer Apellido:");
		apellido1 = sc.nextLine();
		System.out.println("Segundo Apellido:");
		apellido2 = sc.nextLine();
		System.out.println("DNI:");
		dni = sc.nextLine();
		System.out.println("Correo electronico:");
		correoElectronico = sc.nextLine();
		System.out.println("Edad:");
		edad = Integer.parseInt(sc.nextLine());
		System.out.println("calle:");
		calle = sc.nextLine();
		System.out.println("Numero:");
		numero =Integer.parseInt(sc.nextLine());
		System.out.println("Puerta:");
		puerta = sc.nextLine();
		System.out.println("Localidad:");
		localidad = sc.nextLine();
		System.out.println("Municipio:");
		municipio = sc.nextLine();
		
		residencia = new Residencia(calle,numero,puerta,localidad,municipio);
		return new Alumno(nombre,apellido1,apellido2,dni,correoElectronico,edad,residencia);
	}
	
	/**
	 * Recorre el Hash Map y lo muestra por consola
	 * @param info el hash map del que extraer la informacion
	 */
	public static void mostrarAlumnos(HashMap<String,Alumno> info){
		for (String elemento : info.keySet()) {
			System.out.println(info.get(elemento));
		}
	}
	
	/**
	 * Elimina un alumno mediante el DNI
	 * @param info el hash map del que extraer la informacion
	 */
	public static void eliminarPorDni(HashMap<String,Alumno> info) {
		String dni;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idica el DNI que deseas eliminar:");
		dni = sc.nextLine();
		if(info.containsKey(dni)) {
			info.remove(dni);
			System.out.println("Alumno con DNI :"+dni+" ha sido eliminado correctamente");
		}
		else
			System.out.println("El DNI: "+dni+" no existe");
	}
}
