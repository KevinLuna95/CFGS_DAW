package es.ifp.programacion.ficheros.propuesto3y4;

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
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		
		do {
			menu();
			opcion = sc.nextLine();
			switch(opcion) {
			case "A": escribirFichero();
				break;
			case "B": leerFichero();
				break;
			case "S": System.out.println("Fin del programa");
				break;
			default : System.out.println("Opción desconocida.");
			}
		} while (!opcion.equals("S"));
	}
	
	public static void menu () {
		System.out.println("¿Que quieres hacer?");
		System.out.println("A - Escribir fichero");
		System.out.println("B - Leer y sumar");
		System.out.println("S - Salir");
	}
	public static File obtenerRuta() {
		Scanner sc = new Scanner(System.in);
		File archivo = null;
		String nombreRuta = "";
		
		System.out.println("Indica la ruta y el nombre del archivo:");
		nombreRuta = sc.nextLine();
		archivo = new File(nombreRuta);
		return archivo;
	}
	public static void escribirFichero () {
		Scanner sc = new Scanner(System.in);
		File ruta = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		int numero = 0;

		ruta = obtenerRuta();
		
		if(ruta.exists()) {
			try {
				fw = new FileWriter(ruta,true);
				bw = new BufferedWriter(fw);
				
				System.out.println("Indica el número deseado a escribir. -1 para finalizar");
				numero = sc.nextInt();
				while (numero !=-1) {
					bw.write(numero+"\n");
					numero = sc.nextInt();
				}
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("La ruta no existe o es incorecta, desea crear el fichero? S/N");
			if(sc.nextLine().equals("S")) {
				try {
					ruta.createNewFile();
					fw = new FileWriter(ruta,true);
					bw = new BufferedWriter(fw);
					System.out.println("Indica el número deseado a escribir. -1 para finalizar");
					numero = sc.nextInt();
					while (numero !=-1) {
						bw.write(numero+"\n");
						numero = sc.nextInt();
					}
					bw.close();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else
				System.out.println("Fichero no creado");
		}
	}
	
	public static void leerFichero () {
		Scanner sc = new Scanner(System.in);
		File ruta = null;
		FileReader fr = null;
		BufferedReader br = null;
		int resultado = 0;
		String tmp = "";
		
		ruta = obtenerRuta();
		if (ruta.exists()) {
			try {
				fr = new FileReader(ruta);
				br = new BufferedReader(fr);
				
				tmp = br.readLine();
				while (tmp != null) {
					resultado += Integer.parseInt(tmp);
					tmp = br.readLine();
				}
				System.out.println("El resultado de la suma es: "+resultado);
				
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}else {
			System.out.println("La ruta o el fichero no existe, introduce otra ruta.");
			leerFichero();
		}
	}
}
