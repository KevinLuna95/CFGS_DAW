package es.ifp.programacion.uf6.ejercicio.ui;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import es.ifp.programacion.uf6.ejercicio.negocio.AppController;
import es.ifp.programacion.uf6.ejercicio.negocio.Empleado;
import es.ifp.programacion.uf6.ejercicio.negocio.EmpleadoNotFoundException;
import es.ifp.programacion.uf6.ejercicio.negocio.Departamento;
import es.ifp.programacion.uf6.ejercicio.negocio.DptoExistsException;
import es.ifp.programacion.uf6.ejercicio.negocio.DptoNotFoundException;


public class InterfazDeUsuario {
	
	private Scanner sc = new Scanner(System.in);
	
	
	public  InterfazDeUsuario() {
	}
	
	
	
	/**
	 * Muestra el menú de la aplicación, recoje las opciones
	 * del usuario y llama a la capa de negocio para realizar las 
	 * operaciones correspondientes.
	 */
	public void start() {
		showMenu();
	}
	
	
	/**
	 * Muestra el menú gráfico para la ejecución de la aplicación en un bucle,
	 * recoge las opciones.
	 */
	private void showMenu() {
		String opcion=null;
			do {
				try {
					
					System.out.println("\n");
					System.out.println("=============================================");
					System.out.println("GESTION DE EMPLEADOS Y DEPARTAMENTOS");
					System.out.println("=============================================");
					System.out.println("1.- Crear departamento");
					System.out.println("2.- Borrar departamento");
					System.out.println("3.- Mostrar todos los departamentos");
					System.out.println("4.- Crear empleado en un departamento");
					System.out.println("5.- Modificar salario de un empleado");
					System.out.println("6.- Borrar empleado");
					System.out.println("7.- Mostrar todos los empleados");
					System.out.println("8.- Mostrar empleado por número de empleado");
					System.out.println("9.- Salir de la aplicación");
					System.out.println("=============================================");
					System.out.println("Introduzca la opción del menú a ejecutar:");
					opcion = this.sc.nextLine();
					
					//Validamos que la opción es correcta. 
						if (Integer.parseInt(opcion)>9 || Integer.parseInt(opcion)<1)
							System.out.println("\n[ERROR] Opción incorrecta.");
						else //Si es opción entre 1 y 7 solicitamos datos en función
							//de la operación a realizar.
							showAndGetData(opcion);
				}
				catch(Exception e) {
					//Podríamos escribir el error en un fichero si quisieramos
					//También podríamos utilizar log4j como gestor de errores
					System.out.println("\nSe ha producido durante la ejecución del menú:"+opcion);
				}
			}
			while (!opcion.equals("9"));
			sc.close();
			System.out.println("Fin de la ejecución del programa.");
		
	}
	
	/**
	 * Método que, en función del tipo de operación a realizar, muestra mensajes al usuario
	 * y recoge los datos para crear el objeto correspondiente.
	 * @param opcion
	 */
	public void showAndGetData(String opcion) {
		
		
		switch(opcion) {
		
			case "1":
				getDataAndExecuteNewDepartamento();
				break;
				
			case "2":
				getDataAndRemoveDepartamento();
				break;
	
			case "3":
				showAllDptos();
				break;
			
			case "4":
				getDataAndExecuteNewEmpleado();
				break;
			
			case "5":
				getDataAndUpdateSalario();
				break;
			
			case "6":
				getDataAndRemoveEmpleado();
				break;
			
			case "7":
				showAllEmpleados();
				break;

			case "8":
				getEmpleadoByNumEmpleado();
				break;
		}
		//Podríamos poner un default, pero esta validación ya se hace en el UI
	}
	
	



	private void showAllEmpleados() {
		AppController controlador = new AppController();
		try {
			ArrayList<Empleado>lista= controlador.getAllEmpleados();
			
			Iterator<Empleado> it = lista.iterator();
			System.out.println("LISTA DE EMPLEADOS:");
			while (it.hasNext())
				System.out.println(it.next().toString());
		} catch(Exception e) {
			System.out.println("[ERROR] Se ha producido un error al obtener los empleados:"+e.getMessage());
			
		}
		
	}


	private void getDataAndRemoveEmpleado() {
		int numEmpleado;
		String opc;
		
		//Recogemos los datos del UI para crear el objeto empleado que deseamos almacenar
		System.out.println("\n=============================================");
		System.out.println("BORRAR EMPLEADO:");
		System.out.println("=============================================");
		
		try {
			
			System.out.println("Introduzca el número de empleado (valor único) a eliminar:");
			numEmpleado = Integer.parseInt(this.sc.nextLine());
			System.out.println("¿Está seguro de que desea borrar el empleado número "+numEmpleado+"? (S/N):");
			opc = this.sc.nextLine();
			if (opc.equals("S")) {
				AppController controlador = new AppController();
				try {
					controlador.removeEmpleado(numEmpleado);
				} catch (EmpleadoNotFoundException e) {
					System.out.println("[ERROR] El número de empleado que ha introducido no existe. Número de empleado:"+numEmpleado);
				}
				catch(Exception e) {
					System.out.println("[ERROR] Se ha producido un error al crear el empleado:"+e.getMessage());
				}
			}
			else
				System.out.println("Se ha cancelado el borrado del empleado número "+numEmpleado);
		}
		catch(Exception e) {
			System.out.println("Se ha producido un error al eliminar el empleado. No se ha realizado el borrado.");
		}
	}



	private void getDataAndRemoveDepartamento() {
		int numDepartamento;
		String opc;
		//Recogemos los datos del UI para crear el objeto empleado que deseamos almacenar
		System.out.println("\n=============================================");
		System.out.println("BORRAR DEPARTAMENTO:");
		System.out.println("=============================================");
		try {
			System.out.println("Introduzca el número de departamento (valor único) a eliminar:");
			numDepartamento = Integer.parseInt(this.sc.nextLine());			
			System.out.println("¿Está seguro de que desea borrar el departamento número "+numDepartamento+"? (S/N):");
			opc = this.sc.nextLine();
			if (opc.equals("S")) {
				AppController controlador = new AppController();
				try {
					controlador.removeDepartamento(numDepartamento);
				} catch (DptoNotFoundException e) {
					System.out.println("[ERROR] El número de departamento que ha introducido no existe. Número de departamento:"+numDepartamento);
				}
				catch(Exception e) {
					System.out.println("[ERROR] Se ha producido un error al crear el empleado:"+e.getMessage());
				}
			}
			else
				System.out.println("Se ha cancelado el borrado del departamento número "+numDepartamento);
		}
		catch(Exception e) {
			System.out.println("Se ha producido un error al eliminar el empleado. No se ha realizado el borrado.");
		}
	}


	private void getDataAndExecuteNewEmpleado() {
		int numEmpleado, salario, numDpto;
		String apellidos, oficio;
		
		//Recogemos los datos del UI para crear el objeto empleado que deseamos almacenar
		System.out.println("\n=============================================");
		System.out.println("CREAR EMPLEADO:");
		System.out.println("=============================================");
		
		try {
			
			System.out.println("Introduzca el número de empleado (valor único):");
			numEmpleado = Integer.parseInt(this.sc.nextLine());
			
			
			System.out.println("Introduzca los apellidos del empleado:");
			apellidos = this.sc.nextLine();
			if (apellidos.length()>64)
				throw new Exception("[ERROR] Tamaño máximo excedido para el apellido");
			
			System.out.println("Introduzca el salario del empleado:");
			salario = Integer.parseInt(this.sc.nextLine());
			
			System.out.println("Introduzca el puesto del empleado:");
			oficio = this.sc.nextLine();
			
			System.out.println("Introduzca el departamento del empleado:");
			numDpto = Integer.parseInt(this.sc.nextLine());

			System.out.println("=============================================");
			
			Empleado emp = new Empleado(numEmpleado, apellidos, salario, oficio, numDpto);
			AppController controlador = new AppController();
			try {
				controlador.newEmpleado(emp);
			} catch (DptoNotFoundException e) {
				System.out.println("[ERROR] El departamento que ha introducido no existe.");
			}
			catch(Exception e) {
				System.out.println("[ERROR] Se ha producido un error al crear el empleado:"+e.getMessage());
			}
		}
		catch(NumberFormatException nfe) {
			System.out.println("Valor introducido no válido: Introduzca un número.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	private void showAllDptos() {
		AppController controlador = new AppController();
		try {
			ArrayList<Departamento>lista= controlador.getAllDepartamentos();
			
			Iterator<Departamento> it = lista.iterator();
			System.out.println("LISTA DE DEPARTAMENTOS:");
			while (it.hasNext())
				System.out.println(it.next().toString());
		} catch(Exception e) {
			System.out.println("[ERROR] Se ha producido un error al obtener los departamentos:"+e.getMessage());
		}
	}
	
	


	private void getDataAndExecuteNewDepartamento() {
		int numDpto;
		String nombre, localidad;
		Scanner sc = new Scanner (System.in);
		
		//Recogemos los datos del UI para crear el objeto empleado que deseamos almacenar
		System.out.println("\n=============================================");
		System.out.println("CREAR DEPARTAMENTO:");
		System.out.println("=============================================");
		
		try {
			
			System.out.println("Introduzca el número de departamento (valor único):");
			numDpto = Integer.parseInt(this.sc.nextLine());
			
			
			System.out.println("Introduzca el nombre:");
			nombre = this.sc.nextLine();
			if (nombre.length()>64)
				throw new Exception("[ERROR] Tamaño máximo excedido para el nombre del departamento");
			
			System.out.println("Introduzca la localidad:");
			localidad = this.sc.nextLine();
			

			System.out.println("=============================================");
			
			Departamento dpto = new Departamento(numDpto, nombre, localidad);
			AppController controlador = new AppController();
			try {
				controlador.newDepartamento(dpto);
			} 
			catch(DptoExistsException de) {
				System.out.println("[ERROR] Ya existe un departamento con ese número");
				
			}
			catch(Exception e) {
				System.out.println("[ERROR] Se ha producido un error al crear el departamento:"+e.getMessage());
			}
		}
		catch(NumberFormatException nfe) {
			System.out.println("Valor introducido no válido: Introduzca un número.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	private void getDataAndUpdateSalario() {
		int numEmpleado;
		int nuevoSalario;
		String opc;
		Scanner sc = new Scanner (System.in);
		//Recogemos los datos del UI para crear el objeto empleado que deseamos almacenar
		System.out.println("\n=============================================");
		System.out.println("ACTUALIZAR SALARIO DE EMPLEADO:");
		System.out.println("=============================================");
		try {
			System.out.println("Introduzca el número de empleado del que desea actualizar el salario:");
			numEmpleado = Integer.parseInt(this.sc.nextLine());		
			
			System.out.println("¿Cuál es el nuevo salario?");
			nuevoSalario = Integer.parseInt(this.sc.nextLine());		
			
				AppController controlador = new AppController();
				try {
					controlador.updateSalario(numEmpleado, nuevoSalario);
					
				} catch (EmpleadoNotFoundException e) {
					System.out.println("[ERROR] El número de empleado que ha introducido no existe:"+numEmpleado);
				}
				catch(Exception e) {
					System.out.println("[ERROR] Se ha producido un error al crear el empleado:"+e.getMessage());
				}
		}
		catch(Exception e) {
			System.out.println("Se ha producido un error al eliminar el empleado. No se ha realizado el borrado.");
		}		
	}
	
	


	private void getEmpleadoByNumEmpleado() {
		int numEmpleado;
		String opc;
		Scanner sc = new Scanner (System.in);
		Empleado emp;
		
		//Recogemos los datos del UI para crear el objeto empleado que deseamos almacenar
		System.out.println("\n=============================================");
		System.out.println("OBTENER DATOS DE EMPLEADO:");
		System.out.println("=============================================");
		
		try {
			
			System.out.println("Introduzca el número de empleado (valor único):");
			numEmpleado = Integer.parseInt(this.sc.nextLine());
				AppController controlador = new AppController();
				try {
					emp=controlador.getEmpleadoById(numEmpleado);
					System.out.println(emp.toString());
				} catch (EmpleadoNotFoundException e) {
					System.out.println("[ERROR] El número de empleado que ha introducido no existe. Número de empleado:"+numEmpleado);
				}
				catch(Exception e) {
					System.out.println("[ERROR] Se ha producido un error al crear el empleado:"+e.getMessage());
				}
			}
		catch(Exception e) {
			System.out.println("Se ha producido un error al eliminar el empleado. No se ha realizado el borrado.");
		}
		
	}

	
	
	
	
	
	

}
