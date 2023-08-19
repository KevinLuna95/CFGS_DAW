package IFP.programacion.archivosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		final String fichero = "file.txt";
		String lineasFichero;
		
		escribirFicheroTexto(fichero, "Mi primera escritura", false);
		escribirFicheroTexto(fichero, "Mi segunda escritura", true);
		lineasFichero = leerFicheroTexto(fichero);
		
		System.out.println(lineasFichero);
		
	}

	/**
	 * Método que escribe un fichero de textos en una cadena pasada como parámetros
	 * @param rutaFichero Ruta del fichero a escribir
	 * @param cadena String a escribir en el fichero
	 * @param tipo si es true se añade al final, si es false se sobreescribe
	 */
	public static void escribirFicheroTexto(String rutaFichero, String cadena, boolean tipo) {
		File fichero = null;
		
		//Clases de escritura
		FileWriter fw = null;
		// PrintWriter pw = null;
		BufferedWriter bw = null;
		//escritura en archivos texto
		
		try {
			fichero = new File(rutaFichero);
			//Si true se añade el texto al contenido existente, si false se elimina el contenido completo del archivo.
			fw = new FileWriter(fichero, tipo);
			bw = new BufferedWriter(fw);
		}
		catch(IOException ioe){
			System.out.println("Escepción al crear FileWriter");
			ioe.printStackTrace();
		}
		// Atención, el println hace que después del texto, la siguiente linea sea en otra fila (con un intro)
		// no hace referencia a la línea actual
		//pw.write("Hole esto es una prueba");
		//pw.println("Hole esto es una prueba pero en una segunda línea");
		//pw.println("Hole esto es una prueba con el println");
		//pw.println("Hole esto es una prueba sgunda prueba con pritln");
		
		try {
			bw.write(cadena);
			bw.write("\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			//pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static String leerFicheroTexto(String rutaFichero) {	
		//escritura de texto:
		File fichero = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = null;
		String totalLineas = "";
		
		//lectura en archivos de texto
		
		try {
			fichero = new File(rutaFichero);
			fr = new FileReader(fichero);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			linea = br.readLine();
			while (linea !=null) {
				totalLineas += linea+"\n";
				linea = br.readLine();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalLineas;
	}
	
}
