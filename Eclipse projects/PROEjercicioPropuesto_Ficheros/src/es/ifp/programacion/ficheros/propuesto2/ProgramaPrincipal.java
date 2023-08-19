package es.ifp.programacion.ficheros.propuesto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Construir un programa que cree un fichero en la ruta indicada por el usuario
 * y escriba lineas hasta que el usuario escriba EOF (End of File)
 * en una nueva linea (condición de salida)
 * @author kevin
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreFichero;
		String ruta;
		String rutaFinal;
		File fichero = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================");
		System.out.println("Ejercicio Propuesto 2");
		System.out.println("=====================");
		System.out.println("Indica la ruta del fichero que quieres crear o escribir");
		ruta = sc.nextLine();
		System.err.println("Indica el nombre del archivo");
		nombreFichero = sc.nextLine();
		
		if(ruta.isEmpty())
			rutaFinal = nombreFichero;
		else
			rutaFinal = (ruta+"/"+nombreFichero);
		
		fichero = new File(rutaFinal);
		
		if (!fichero.exists()) {
			System.out.println("¿Desea crear el fichero? S/N");
			
			if (sc.nextLine().equals("S")) {
				crearFichero(rutaFinal);
				System.out.println("El fichero se ha creado ¿Quieres escribirlo? S/N");
				
				if(sc.nextLine().equals("S"))
					escribirFichero(fichero);
				else 
					System.out.println("Has salido del programa");
			}else
				System.out.println("El fichero no se ha creado");
		}else
			escribirFichero(fichero);
		
		System.out.println("Fin del programa");
	}

	public static void crearFichero (String rutaFinal) {
		File archivo = new File(rutaFinal);
		try {
			archivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void escribirFichero(File fichero) {
		String cadena = "";
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		System.out.println("Para finalizar escribe: EOF");
		try {
			fw = new FileWriter(fichero, true);
			bw = new BufferedWriter(fw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(!cadena.equals("EOF")) {
			System.out.println("Indica qué quieres escribir en el archivo");
			if(!cadena.equals("EOF")) {
				cadena = sc.nextLine();
				try {
					bw.write("\n"+cadena);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
