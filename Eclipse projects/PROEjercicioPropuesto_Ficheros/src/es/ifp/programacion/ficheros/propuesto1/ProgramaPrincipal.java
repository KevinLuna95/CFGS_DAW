package es.ifp.programacion.ficheros.propuesto1;

import java.io.File;
import java.util.Scanner;

/**
 * 1.-Contruir un programa Java que reciba como argumento de línea de comandos 
 * la ruta a un fichero y que muestre por pantalla información básica sobre el mismo
 * (como minimo el nombre del fichero, directorio donde se encuentra y su tamaño expresado en kbytes).
 * @author kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			mostrarMenu();
			ruta = sc.nextLine();
			if (!ruta.equals("S")) {
				mostrarInfo(ruta);
			}
		} while (!ruta.equals("S"));
		System.out.println("Salida");
	}
	/**
	 * Procedimiento qu emuestra el menú al usuario
	 */
	public static void mostrarMenu () {
		System.out.println("Bienvenido a l sistema de comprobación de ficheros");
		System.out.println("Indica la ruta del fichero del que deseas recibir información:");
		System.out.println("Para salir escribe S");
	}
	
	public static void mostrarInfo (String ruta) {
		File f = new File (ruta);
		
		if(f.exists()) {
			System.out.println("Nombre del fichero "+f.getName());
			System.out.println("Tamaño del fichero en kbytes: "+f.length()/1024);
			System.out.println("Ruta del archivo: "+f.getAbsolutePath());
			System.out.println("¿El fichero se puede ejecutar? "+f.canExecute());
			System.out.println("¿El fichero se puede leer? "+f.canRead());
		}else
			System.out.println("Ruta de fichero errónea o fichero inexistente");
	}
}
