package es.cajaRegistradora.GUI;

import java.util.Scanner;

import es.cajaRegistradora.negocio.Almacen;
import es.cajaRegistradora.negocio.Venta;

public class InterfazUsuario {
	
	public InterfazUsuario() {
		
	}
	
	public String sc(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		return sc.nextLine();
	}
	

	public void verMenuPrincipal() {
		int opcion = 0;
		
		do {
			System.out.println("=================================================================");
			System.out.println("                        CAJA REGISTRADORA                        ");
			System.out.println("=================================================================");
			System.out.println("1- Nueva venta");
			System.out.println("2- Registro de ventas");
			System.out.println("3- Almacen");
			System.out.println("4- Salir");
			try {
				opcion = Integer.parseInt(sc("Indica la opcion a ejecutar:"));
				
				switch(opcion) {
					case 1: verMenuVentas();
						break;
					case 2: registroVentas();
						break;
					case 3: gestionAlmacen();
						break;
					case 4: System.out.println("Fin del programa");
						break;
					default: System.out.println("[ERROR] Las opciones disponibles son:");
				}
			} catch (NumberFormatException nfe) {
				System.out.println("[ERROR] El valor introducido debe ser un numero");
			}
		}while(opcion != 4);
	}
	
	private void gestionAlmacen() {
		Almacen almacen = new Almacen();
		Boolean fin = false;
		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                             ALMACEN                             ");
			System.out.println("-----------------------------------------------------------------");
			verMenuAlmacen();
			fin = almacen.gestionAlmacen(sc("Indica la opcion:"));
		}while(fin);
	}

	private void verMenuAlmacen() {
		System.out.println("1- Ver productos");
		System.out.println("2- Crear producto");
		System.out.println("3- Modificar producto");
		System.out.println("4- Eliminar producto");
		System.out.println("FIN para salir");
	}

	public void verMenuVentas() {
		Venta venta = new Venta();
		Boolean fin = false;
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("                             VENTAS                             ");
			System.out.println("----------------------------------------------------------------");
			venta.lineasVenta();
			System.out.println("FIN para cerrar la venta");
			fin = venta.añadirProducto(sc("Escanea un articulo..."));
		}while(fin);
	}
	
	public void registroVentas() {
		Venta venta = new Venta();
		Boolean fin = false;
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("                       REGISTRO DE VENTAS                       ");
			System.out.println("----------------------------------------------------------------");
			venta.verRegistroVentas();		
			verMenuRegistroVentas();
			fin = venta.gestionRegistroVentas(sc("Escoge la opcion"));

		}while(fin);
	}

	private void verMenuRegistroVentas() {
		System.out.println("1- Ver venta");
		System.out.println("2- Modificar venta");
		System.out.println("3- Eliminar venta");
		System.out.println("FIN para salir");
	}
	
}
