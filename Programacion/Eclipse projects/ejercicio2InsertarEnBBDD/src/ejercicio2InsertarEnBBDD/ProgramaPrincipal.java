package ejercicio2InsertarEnBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Enunciado:
 * Dado el script adjunto a la tarea, que crea una BBDD y dos tablas en MySQL (departamentos y empleados), se pide:
 * 
 * - Crea una clase Departamento con los atributos correspondientes que puedes obtener de la definición de la tabla Departamento.
 * - Insertar un departamento en la tabla correspondiente.
 * - Modulariza la operación de inserción dentro del programa principal.
 * 
 * Se adjunta también, en una clase aparte la consulta SQL necesaria para realizar la inserción.
 * Los datos del departamento se podrán solicitar al usuario a través de la consola o añadirlos directamente en el programa principal.
 * @author Kevin Luna Botey
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		Connection conexion = null;
		Scanner sc = new Scanner(System.in);
		int res = 0;
		

		try {
			conexion = DriverManager.getConnection(SQLFILE.CONEXION_URL,"root","");		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		do {
			menu();
			res = Integer.parseInt(sc.nextLine());
			
			switch(res) {
			case 1: insertarDepartamento(conexion);
				break;
			case 2: obtenerTodosDepartamentos(conexion);
				break;
			case 3: borrarDepartamento(conexion);
				break;
			case 4: crearEmpleado(conexion);
				break;
			case 5: modificarSalario(conexion);
				break;
			case 6: borrarEmpleado(conexion);
				break;
			case 7: mostrarTodosEmpleados(conexion);
				break;
			case 8: System.out.println(mostrarEmpleadoPorId(conexion));;
				break;
			case 0: break;
			}
		}while(res != 0);
		
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void mostrarTodosEmpleados(Connection conexion) {
		Empleado emp = null;
		Statement sentencia = null;
		ResultSet rs = null;
		
		try {
			sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(SQLFILE.SQL_GETALLEMPLEADOS);
			
			while(rs.next()) {
				emp = new Empleado(rs.getInt("emp_no"),rs.getString("apellido"),rs.getString("oficio"),rs.getFloat("salario"),rs.getInt("dpto_no"));
				System.out.println(emp.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void borrarEmpleado(Connection conexion) {
		Empleado emp = mostrarEmpleadoPorId(conexion);
		
		PreparedStatement ps = null;
		
		try {
			ps = conexion.prepareStatement(SQLFILE.SQL_REMOVE_EMPLEADO_BY_ID);
			ps.setInt(1, emp.getEmp_no());
			if(ps.executeUpdate() == 1)
				System.out.println("Empleado eliminado correctamente");
			else
				System.out.println("El empleado no ha podido eliminarse");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	private static void modificarSalario(Connection conexion) {
		Scanner sc = new Scanner(System.in);
		Empleado emp = mostrarEmpleadoPorId(conexion);
		PreparedStatement ps = null;
		
		
		System.out.println("Indica el nuevo salario");
		try {
			ps = conexion.prepareStatement(SQLFILE.SQL_UPDATE_SALARIO);
			ps.setFloat(1, Float.parseFloat(sc.nextLine()));
			ps.setInt(2, emp.getEmp_no());
			if(ps.executeUpdate() == 1)
				System.out.println("Salario modificado correctamente");
			else
				System.out.println("El salario no se ha podido modificar");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private static Empleado mostrarEmpleadoPorId(Connection conexion) {
		Scanner sc = new Scanner(System.in);
		int idEmpleado = 0;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Empleado emp = null;
		System.out.println("Indica el ID del empleado:");
		idEmpleado = Integer.parseInt(sc.nextLine());
		try {
			ps = conexion.prepareStatement(SQLFILE.SQL_GETEMPLEADO_BY_ID);
			ps.setInt(1, idEmpleado);
			rs = ps.executeQuery();
			rs.next();
			emp = new Empleado (rs.getInt("emp_no"),rs.getString("apellido"),rs.getString("oficio"),rs.getFloat("salario"),rs.getInt("dpto_no"));
			return emp;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emp;
		
	}

	private static void crearEmpleado(Connection conexion) {
		Scanner sc = new Scanner(System.in);
		PreparedStatement ps = null;
		Empleado emp = null;
		String apellido = "";
		String oficio = "";
		Float salario = 0f;
		int dpto_no = 0;
		
		System.out.println("Indica el apellido:");
		apellido = sc.nextLine();
		System.out.println("Indica el oficio:");
		oficio = sc.nextLine();
		System.out.println("Indica el salario");
		salario = Float.parseFloat(sc.nextLine());
		System.out.println("Indica a qué departamento pertenece:");
		obtenerTodosDepartamentos(conexion);
		dpto_no = Integer.parseInt(sc.nextLine());
		emp = new Empleado(apellido, oficio, salario, dpto_no);
		
		try {
			ps = conexion.prepareStatement(SQLFILE.SQL_INSERTEMP);
			ps.setString(1, emp.getApellido());
			ps.setString(2, emp.getOficio());
			ps.setFloat(3, salario);
			ps.setInt(4, dpto_no);
			if(ps.executeUpdate() == 1) 
				System.out.println("Empleado "+emp.getApellido()+" creado correctamente");
			else
				System.out.println("Error al crear el empleado");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void borrarDepartamento(Connection conexion) {
		Scanner sc = new Scanner(System.in);
		int idDepartamento = 0;;
		PreparedStatement ps = null;
		System.out.println("Indica el ID del departamento al eliminar");
		idDepartamento = Integer.parseInt(sc.nextLine());
		
		try {
			ps = conexion.prepareStatement(SQLFILE.SQL_REMOVE_DEPARTAMENTO_BY_ID);
			ps.setInt(1,idDepartamento);
			if(ps.executeUpdate() == 1)
				System.out.println("El departamento con ID "+idDepartamento+" ha sido eliminado correctamente.");
			else
				System.out.println("Error al crear el empleado");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void obtenerTodosDepartamentos(Connection conexion) {
		ArrayList<Departamento> dptoList = new ArrayList<Departamento>();
		Departamento dpto = null;
		Statement sentencia = null;
		ResultSet rs = null;
		Iterator it = null;
		
		try {
			sentencia = conexion.createStatement();
			rs = sentencia.executeQuery(SQLFILE.SQL_GETALLDPTOS);
			
			while(rs.next()) {
				dpto = new Departamento(rs.getInt(1),rs.getString(2),rs.getString(3));
				dptoList.add(dpto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				sentencia.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		it = dptoList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
	}

	public static void insertarDepartamento(Connection conexion) {
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);
		int idDepartamento = 0;
		String nombreDepartamento = "";
		String localidadDepartamento = "";
		
		System.out.println("Indica el ID del departamento:");
		idDepartamento = Integer.parseInt(sc.nextLine());
		
		System.out.println("Indica el nombre del departamento:");
		nombreDepartamento = sc.nextLine();
		
		System.out.println("Indica la localidad del departamento:");
		localidadDepartamento = sc.nextLine();
		
		
		Departamento dpto = new Departamento(idDepartamento,nombreDepartamento,localidadDepartamento); 
		

		try {
			ps = conexion.prepareStatement(SQLFILE.SQL_INSERT_DEPTO);
			ps.setInt(1, dpto.getDpto_no());
			ps.setString(2, dpto.getNombre());
			ps.setString(3, dpto.getLocalidad());
			if(ps.executeUpdate() == 1) 
				System.out.println("El departamento '"+dpto.getNombre()+"' Ha sido creado correctamente.");
			else
				System.out.println("Ha ocurrido un error y el departamento no ha sido creado correctamente.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void menu(){
		System.out.println("===============================================");
		System.out.println("GESTION DE EMPLEADOS Y DEPARTAMENTOS");
		System.out.println("===============================================");
		System.out.println("1- Crear departamento");
		System.out.println("2- Obtener todos los departamentos");
		System.out.println("3- Borrar departamento");
		System.out.println("4- Crear empleado en un departamento");
		System.out.println("5- Modificar salario de un empleado");
		System.out.println("6- Borrar empleado");
		System.out.println("7- Mostrar todos los empleados");
		System.out.println("8- Mostrar empleado por numero de empleado");
		System.out.println("0- Salir");
		System.out.println("===============================================");
		System.out.println("Escoge la opcion:");
	}

}
