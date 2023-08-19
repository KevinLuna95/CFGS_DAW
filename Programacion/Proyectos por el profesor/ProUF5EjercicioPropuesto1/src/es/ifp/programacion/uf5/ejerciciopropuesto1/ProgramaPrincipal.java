package es.ifp.programacion.uf5.ejerciciopropuesto1;



import java.util.*;

 
/**
 * Dadas las tres clases adjuntas (Alumno, Persona y Residencia) crea un programa principal que 
 * emule un sistema de gestión de altas y bajas de alumnos muy sencillo. Por lo que deberá 
 * tenerse en cuenta que se deben almacenar todos los alumnos.
 * Para ello, se mostrará un menú con las siguientes opciones:
 * 
 * 1.- Nuevo alumno
 * 2.- Borrar alumno (por dni)
 * 3.- Mostrar todos los alumnos
 * 4.- Salir del programa
 * 
 * La opción 1 creará un nuevo Alumno.
 * La opción 2 solicitará al usuario el dni del alumno a borrar, solicitando confirmación..
 * La opción 3 mostrará todos los alumnos en la consola.
 * El menú se mostrará repetidamente hasta que haya elegido la opción salir.
 * 
 * @author juramire
 */


public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcion;
		Scanner sc = new Scanner(System.in);
		LinkedList<Alumno> lList = new LinkedList<Alumno>();
		Alumno alumno;
		
		do {
			
			muestraMenu();
			opcion = sc.nextLine();
			
			switch(opcion) {
			
			case "1": 
				alumno=creaAlumno();
				lList.add(alumno);
				break;
			
			case "2": 
				alumno=borraAlumnoPorDni(lList);
				if (alumno!=null)
					lList.remove(alumno);
				break;
			
			case "3": 
				muestraTodosLosResultados(lList);
				break;
			case "4":
				System.out.println("Fin de la ejecución del programa");
				break;
			default:
				System.out.println("Opción incorrecta.");
				break;
			}
			
		}while(!opcion.equals("4"));
		
	
	}
	
	
	/**
	 * Pide datos al usuario para crear un objeto de tipo Alumno 
	 * 
	 * @return el objeto de tipo Alumno creado a partir de los datos solicitados al usuario.
	 */
	public static Alumno creaAlumno() {
		String nombre, ape1, ape2, dni;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los datos del alumno.");
		System.out.println("Nombre:");
		nombre = sc.nextLine();
		System.out.println("Primer apellido:");
		ape1 = sc.nextLine();
		System.out.println("Segundo apellido:");
		ape2 = sc.nextLine();
		System.out.println("DNI:");
		dni = sc.nextLine();
		
		Alumno alumno = new Alumno(nombre, ape1, ape2, dni);
		return alumno;
		
		
		
	}
	
	/**
	 * Pedir el dni al usuario
	 * Buscar el usuario con ese dni
	 * Recorrer la lista enlazada y buscar el dni
	 * 
	 * ALUMNO -> ALUMNO
	 * 
	 * 
	 * @return
	 */
	public static Alumno borraAlumnoPorDni(LinkedList<Alumno> listaAlumnos) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el dni del alumno a borrar");
		String dni = sc.nextLine();
		
		Iterator<Alumno> it = listaAlumnos.iterator();
		Alumno alumno;
		while (it.hasNext()) {
			alumno = it.next();
			if (alumno.getDNI().equals(dni))
				return alumno;
		}
		
		System.out.println("No se han encontrado resultado para el dni:"+dni);
		return null;
		
		
		
	}
	
	public static void muestraTodosLosResultados(LinkedList<Alumno> listaAlumnos) {
		
		Iterator<Alumno> it = listaAlumnos.iterator();
		Alumno tmp;
		while(it.hasNext()) {
			tmp = it.next();
			System.out.println("========================================");
			System.out.println("ALUMNO");
			System.out.println("Nombre:"+tmp.getNombre());
			System.out.println("Apellidos:"+tmp.getPrimerApellido()+", "+tmp.getSegundoApellido());
			System.out.println("DNI:"+tmp.getDNI());
			System.out.println("========================================");
			
		}
		
		if (listaAlumnos.isEmpty())
			System.out.println("No hay resultados.");
		
		
	}
	
	
	
	
	/**
	 * Muestra las opciones de menú de la aplicación
	 */
	public static void muestraMenu() {
		System.out.println("==========================================================");
		System.out.println("Opciones:");
		System.out.println("1.- Nuevo alumno");
		System.out.println("2.- Borrar alumno");
		System.out.println("3.- Mostrar todos los alumnos");
		System.out.println("4.- Salir");
		System.out.println("==========================================================");
		System.out.print("Seleccione opción:");
		
		
	}
	
	

}
