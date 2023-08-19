package es.ifp.programacion.uf5.ejerciciopropuesto2;

import java.util.*;

/*
 * 
 * Se busca una estructura de datos que cumpla con los siguientes requisitos:
 * - A partir del dni de una persona, se realiza una búsqueda en un sistema. 
 * - Para cada dni se retornan múltiples filas.
 * - Cada fila tiene cuatro columnas (calle, numero, localidad, municipio).
 * 
 * - Se desea almacenar los resultados de las búsquedas de todas las personas en una 
 * estructura de datos 
 * 
 * Resumen:
 * Los resultados para una persona son múltiples filas y 5 columnas. 
 * Tengo que permitir trabajar con múltiples personas.
 * Construir un programa en Java que cree las estructuras motivando tu decisión.
 * 
 * 
 * 
 * 
 * DNI      F0 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 * 			F1 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 *          F2 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 * 
 * DNI      F0 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 * 			F1 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 *          F2 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 * 
 * DNI      F0 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 * 			F1 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 *          F2 (calle="San Cristobal", num=19, loc="AB", mun="DES")
 * 
 * 
 * 
 *     K				V
 * 
 * 				K 				V
 * 
 * 							K	     V
 * 11223344A->  F0         CALLE "SAN CRISTOBAL"
 *                        NUM   19
 *                        LOC   TIAS
 *                        MUN   TINAJO
 *                        
 *             F1         CALLE "SAN CRISTOBAL"
 *                        NUM   20
 *                        LOC   TIAS
 *                        MUN   TINAJO
 *            
 *             F2         CALLE "SAN CRISTOBAL"
 *                        NUM   21
 *                        LOC   TIAS
 *                        MUN   TINAJO
 *            
 * 22223344A-> F0         CALLE "SAN CRISTOBAL"
 *                        NUM   19
 *                        LOC   TIAS
 *                        MUN   TINAJO
 *                        
 *             F1         CALLE "SAN CRISTOBAL"
 *                        NUM   20
 *                        LOC   TIAS
 *                        MUN   TINAJO
 *            
 *             F2         CALLE "SAN CRISTOBAL"
 *                        NUM   21
 *                        LOC   TIAS
 *                        MUN   TINAJO
 * 
 * 
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> datos = new HashMap<String, String>();
		datos.put("CALLE", "San Cristóbal");
		datos.put("NUM", "19");
		datos.put("LOC", "TIAS");
		datos.put("MUN", "Tinajo");
		
		//HashMap de filas para cada personas
		HashMap<String ,HashMap<String, String>> filasUsuario = new HashMap<String, HashMap<String, String>>();
		filasUsuario.put("F0", datos);
		
		
		//HashMap de personas
		HashMap<String, HashMap<String, HashMap<String, String>>> personas = 
				new HashMap<String, HashMap<String, HashMap<String, String>>>();
		
		personas.put("55443322A", filasUsuario);
		
		
		System.out.println("DNI:"+personas.toString());
		
		
		
		
		
		
		
		

	}

}
