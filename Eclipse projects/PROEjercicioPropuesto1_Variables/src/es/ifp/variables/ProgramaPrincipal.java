package es.ifp.variables;

import java.util.Scanner;

/**
 * Realizando la actividad 1 para la práctica de variables. La práctica dice así:
 * Crea un programa en Java en el cual se declaren variables o constantes para almacenar los siguientes datos:
 *
 *- Nombre
 *- Apellidos: Conjunto de caracteres alfanuméricos
 *- DNI: Debe incluir la letra.
 *- Edad: Valor numérico.
 *- ¿Es mayor de edad? (Deberá definirse como un booleano)
 *- Peso, en kg (Deberá permitir decimales)
 *- Número de teléfono.
 *- Dirección postal:
 *Calle
 *Número.
 *Piso.
 *Letra: Solo podrá contener un caracter.
 *código postal.
 *Comportamiento del programa:
 *El programa solicitará a través de la consola cada uno de estos datos, exceptuando el dato de mayoría de edad.
 *El usuario los introducirá a través de teclado.
 *Los datos se asignarán a la variable/constante correspondiente.
 *Finalmente, el programa los mostrará por consola precidiendo cada dato con el título correspondiente.
 * @author Kevin Luna
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// Declaración de variables
		
		String nombre = new String();
		String apellidos = new String();
		String DNI = new String();
		short edad = 0;
		boolean esMayorDeEdad = false;
		float peso = 0.0f;
		String telefono = new String();
		String calleDireccion = new String();
		short numeroDireccion = 0;
		short pisoDireccion = 0;
		char letraDireccion;
		String codigoPostalDireccion = new String();
		
		Scanner sc = new Scanner(System.in);
		
		//Recogida de datos por consola
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Introduce tus apellidos:");
		apellidos = sc.nextLine();
		
		System.out.println("Introduce tu DNI:");
		DNI = sc.nextLine();
		
		System.out.println("Introduce tu edad:");
		edad = Short.parseShort(sc.nextLine());
		esMayorDeEdad = edad >= 18;
		
		System.out.println("Introduce tu peso:");
		peso = Float.parseFloat(sc.nextLine());
		
		System.out.println("Introduce tu telefono:");
		telefono = sc.nextLine();
		
		System.out.println("A continuacion se solicitaran los datos de tu direccion:");
		
		System.out.println("Introduce el nombre de tu calle:");
		calleDireccion = sc.nextLine();
		
		System.out.println("Introduce el numero:");
		numeroDireccion = Short.parseShort(sc.nextLine());
		
		System.out.println("Introduce el piso:");
		pisoDireccion = Short.parseShort(sc.nextLine());
		
		System.out.println("Introduce la letra:");
		letraDireccion = sc.nextLine().charAt(0);
		
		System.out.println("Introduce el codigo postal:");
		codigoPostalDireccion = sc.nextLine();
		
		//Salida de datos para mostrarla al Usuario
		System.out.println("A continuacion mostraremos la informacion que se ha solicitado:");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("DNI: "+DNI);
		System.out.println("Edad: "+edad);
		System.out.println("Es mayor de edad? "+esMayorDeEdad);
		System.out.println("Peso: "+peso);
		System.out.println("Telefono: "+telefono);
		System.out.println("Los datos de tu direccion son:");
		System.out.println("Calle: "+calleDireccion);
		System.out.println("Numero: "+numeroDireccion);
		System.out.println("Piso: "+pisoDireccion);
		System.out.println("Letra: "+letraDireccion);
		System.out.println("Codigo postal: "+codigoPostalDireccion);
	}

}
