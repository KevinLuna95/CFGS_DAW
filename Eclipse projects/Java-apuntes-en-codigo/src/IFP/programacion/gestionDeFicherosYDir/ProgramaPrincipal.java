package IFP.programacion.gestionDeFicherosYDir;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcion;
		Scanner sc = new Scanner(System.in);
		do {
			muestraMenu();
			opcion = sc.nextLine();
			
			if (opcion.toUpperCase().equals("CD")) {
				crearDirectorio();
			}
			else
				if (opcion.toUpperCase().equals("BD")) {
					borrarDirectorio();
				}
				else
					if (opcion.toUpperCase().equals("CF")) {
						crearFichero();
					}
					else
						if (opcion.toUpperCase().equals("BF")) {
							borrarFichero();
						}
						else
							if (opcion.toUpperCase().equals("EF")) {
								escribirFichero();
							}
							else
								if (opcion.toUpperCase().equals("LF")) {
									leerFichero();
								}
								else
									if (opcion.toUpperCase().equals("S")) {
										
									}
									else 
										System.out.println("Opción incorrecta");
			
		}while (!opcion.toUpperCase().equals("S"));
		System.out.println("Fin del programa");
	}
	
	
	/**
	 * Un preocedimiento que muestra las opciones de menú del programa
	 */
	public static void muestraMenu () {
		System.out.println("===========================");
		System.out.println("    Gestion de ficheros    ");
		System.out.println("===========================");
		System.out.println("Crear un directorio   (CD)");
		System.out.println("Borrar un directorio  (BD)");
		System.out.println("Crear un fichero      (CF)");
		System.out.println("Borrar un fichero     (BF)");
		System.out.println("Escribir en un fihero (EF)");
		System.out.println("Leer de un fichero    (LF)");
		System.out.println("Salir del programa    (S)");
		System.out.println("===========================");
		System.out.println("Introduzca opción:");
	}
	
	public static void crearDirectorio() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		File f = null;
		boolean result;
		
		//System.out.println("Opción: Crear directorio");
		System.out.println("Intruduzca la ruta del directorio");
		ruta = sc.nextLine();
		f = new File(ruta);
		
		result = f.mkdir();
		
		if (result) 
			System.out.println("Directorio creado correctamente");
		else
			System.out.println("Directorio no creado");
	}
	
	public static void borrarDirectorio() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		File f = null;
		boolean result;
		//System.out.println("Borrar directorio");
		System.out.println("Intruduzca la ruta del directorio a borrar");
		ruta = sc.nextLine();
		f = new File(ruta);
		
		result = f.delete();
		
		if (result) 
			System.out.println("Directorio borrado correctamente");
		else
			System.out.println("Directorio no borrado");
	}
	
	public static void crearFichero() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		File f = null;
		
		//System.out.println("Crear fichero");
		System.out.println("Intruduzca la ruta del fichero");
		ruta = sc.nextLine();
		f = new File(ruta);
		
		try {
			f.createNewFile();
			System.out.println("Fichero creado correctamente");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fichero no creado");
		}
	}
	
	public static void borrarFichero() {
		Scanner sc = new Scanner(System.in);
		String ruta;
		File f = null;
		boolean result;
		
		System.out.println("Borrar fichero");
		System.out.println("Intruduzca la ruta del fichero");
		ruta = sc.nextLine();
		f = new File(ruta);
			
		result = f.delete();
		if (result) 
			System.out.println("Fichero borrado correctamente");
		else
			System.out.println("Fichero no borrado");
	}
	
	public static void escribirFichero() {
		String ruta;
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		String cadena;
		BufferedWriter bw = null;
		
		System.out.println("introduce el fichero sobre el que se quiere escribir");
		ruta = sc.nextLine();
		
		System.out.println("Introduzca la cadena a escribir en el fichero");
		cadena = sc.nextLine();
		
		try {
			fw = new FileWriter(ruta);
			bw = new BufferedWriter(fw);
			
			bw.write(cadena);
			
			bw.close();
			fw.close();
			
			System.out.println("Fichero escrito");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fichero no escrito");
		}
		
		
	}
	
	public static void leerFichero() {
		String ruta;
		FileReader fr = null;
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		String linea ="";
		String totalLineas = "";
		
		System.out.println("introduce el fichero que quieres leer");
		ruta = sc.nextLine();
		
		try {
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			
			while ((linea = br.readLine()) != null) {
				totalLineas += "\n"+linea;
				
			br.close();
			fr.close();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch(IOException ioe) {
			ioe.printStackTrace();

		}
		System.out.println("El contenido del fichero es:");
		System.out.println(totalLineas);
	}
}
