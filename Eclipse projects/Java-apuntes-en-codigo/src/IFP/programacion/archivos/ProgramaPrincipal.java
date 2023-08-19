package IFP.programacion.archivos;

import java.io.File;
import java.io.IOException;

/**
 * Programa que realiza operaciones basicas con un fichero
 * -Comprobar si existe
 * -Obtener el nombre fichero
 * -Obtener el directorio padre
 * -Obtener la ruta absoluta del fichero
 * -Comprobar si es un fichero o un directorio
 * -Comprobar si el fichero se puede ejecutar
 * -Comprobar si es un fichero oculto
 * @author kkevi
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fichCreado;
		
		//Ruta absoluta vs ruta relativa
		File fichero = new File("file.txt");
		
		if (fichero.exists())
			System.out.println("El fichero existe");
		else {
			System.out.println("El fichero no existe");
			try {
				fichCreado = fichero.createNewFile();
				System.out.println("fichero creado");
			}
			catch(IOException ioe) {
				System.out.println("Error al crear el fichero");
			}
		}
		
		System.out.println("El nombre del fichero con getName(): "+fichero.getName());
		System.out.println("Directorio padre con getParent(): "+fichero.getParent());
		System.out.println("La ruta absoluta del fichero con getAbsolutePath(): "+fichero.getAbsolutePath());
		System.out.println("La longitud del fichero con length(): "+fichero.length());
		System.out.println("¿Es un directorio? con isDitectory(): "+fichero.isDirectory());
		System.out.println("¿Es un fichero? con isFile(): "+fichero.isFile());
		System.out.println("¿Se puede ejecutar el fichero? con canExecute(): "+fichero.canExecute());
		System.out.println("¿Es un fichero oculto? con isHidden(): "+fichero.isHidden());



		
	}

}
