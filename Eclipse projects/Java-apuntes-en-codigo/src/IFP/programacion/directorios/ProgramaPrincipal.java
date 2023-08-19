package IFP.programacion.directorios;

import java.io.File;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean creado;
		File dir = new File("miDirectorio");
		
		if (dir.exists())
			System.out.println("El directorio "+dir+" existe.");
		else {
			System.out.println("El directorio "+dir+" NO existe.");
			creado = dir.mkdir();
			System.out.println("¿El directorio ha sido creado? "+creado);
		}
		
		if (dir.canRead())
			System.out.println("El directorio "+dir+" se puede leer.");
		else
			System.out.println("El directorio "+dir+" NO se puede leer.");
		
		if (dir.canWrite())
			System.out.println("El directorio "+dir+" se puede escribir.");
		else
			System.out.println("El directorio "+dir+" NO se puede escribir.");




	}

}
