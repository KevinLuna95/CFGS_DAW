package es.ifp.programacion.uf6.ejercicio.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import es.ifp.programacion.uf6.ejercicio.negocio.Departamento;
import es.ifp.programacion.uf6.ejercicio.negocio.DptoNotFoundException;
import es.ifp.programacion.uf6.ejercicio.negocio.Empleado;
import es.ifp.programacion.uf6.ejercicio.negocio.EmpleadoNotFoundException;

public class DBUtil {
	
	private Connection con;
	private PreparedStatement ps;
	private final String URL="jdbc:mysql://localhost:3306/ejerPersistenciaBD";
	
	
	public DBUtil() {
		//Inicializamos la conexión
		try {
			this.con = DriverManager.getConnection(URL, "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public ArrayList<Departamento> getDataBySQL(String sqlGetalldptos) {
		// TODO Auto-generated method stub
		return null;
	}


	public void insertNewEmpleado(Empleado emp) {
		try {
			ps = con.prepareStatement(SQLFILE.SQL_INSERTEMP);
			ps.setInt(1, emp.getNumEmpleado());
			ps.setString(2,  emp.getApellidos());
			ps.setString(3, emp.getOficio());
			ps.setInt(4, emp.getSalario());
			ps.setInt(5, emp.getNumDpto());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public ArrayList<Departamento> getAllDptos() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Departamento tmp;
		ArrayList<Departamento> lista = new ArrayList<Departamento>();
		
		try {
			ps = con.prepareStatement(SQLFILE.SQL_GETALLDPTOS);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				tmp = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
				lista.add(tmp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}



	public ArrayList<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		Empleado tmp;
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		try {
			ps = con.prepareStatement(SQLFILE.SQL_GETALLEMPLEADOS);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				tmp = new Empleado(rs.getInt(1), rs.getString(2),  rs.getInt(3), rs.getString(4), rs.getInt(5));
				lista.add(tmp);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}



	public void removeEmpleado(int numEmpleado) throws EmpleadoNotFoundException {
		int numFilas;
		try {
			ps = con.prepareStatement(SQLFILE.SQL_REMOVE_EMPLEADO_BY_ID);
			ps.setInt(1, numEmpleado);
			numFilas = ps.executeUpdate();
			if (numFilas==0)
				throw new EmpleadoNotFoundException("");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}



	public void removeDepartamento(int numDepartamento) throws DptoNotFoundException {
		int numFilas;
		try {
			ps = con.prepareStatement(SQLFILE.SQL_REMOVE_DEPARTAMENTO_BY_ID);
			ps.setInt(1, numDepartamento);
			numFilas = ps.executeUpdate();
			if (numFilas==0)
				throw new DptoNotFoundException("");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public void insertNewDepartamento(Departamento dpto) {
		try {
			ps = con.prepareStatement(SQLFILE.SQL_INSERT_DEPTO);
			ps.setInt(1, dpto.getNumDpto());
			ps.setString(2,  dpto.getNombre());
			ps.setString(3, dpto.getLocalidad());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public void updateSalario(int numEmpleado, int nuevoSalario) {
		try {
			ps = con.prepareStatement(SQLFILE.SQL_UPDATE_SALARIO);
			ps.setInt(1, nuevoSalario);
			ps.setInt(2, numEmpleado);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



	public Empleado getEmpleadoById(int numEmpleado) {
		ResultSet rs = null;
		Empleado tmp = null;
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		
		try {
			ps = con.prepareStatement(SQLFILE.SQL_GETEMPLEADO_BY_ID);
			ps.setInt(1, numEmpleado);
			rs = ps.executeQuery();
			
			System.out.println("SQL:"+SQLFILE.SQL_GETEMPLEADO_BY_ID+"-"+numEmpleado);
			
			if(rs.next())
			   tmp = new Empleado(rs.getInt(1), rs.getString(2),  rs.getInt(3), rs.getString(4), rs.getInt(5));
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tmp;		
	}

}
