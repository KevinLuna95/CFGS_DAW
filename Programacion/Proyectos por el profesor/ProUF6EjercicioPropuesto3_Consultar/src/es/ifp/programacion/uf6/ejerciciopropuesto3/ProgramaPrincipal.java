package es.ifp.programacion.uf6.ejerciciopropuesto3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Obtengo todos los departamentos de la BBDD
		ArrayList<Departamento> allDptos = getAllDepartamentos();
		//Recorrer el ArrayList e imprimir sus datos
		
		if (allDptos.size()==0)
			System.out.println("No hay departamentos en la BBDD");
		else {
			Iterator<Departamento> it = allDptos.iterator();
			Departamento tmp;
			while (it.hasNext())  {
				tmp = it.next();
				System.out.println(tmp.toString());
			}
		}
	}
	
	
	
	
	private static ArrayList<Departamento> getAllDepartamentos(){
		Connection conexion=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Departamento dpto;
		ArrayList<Departamento> listaTodosDptos=new ArrayList<Departamento>();
		String URL = "jdbc:mysql://localhost:3306/ejerPersistenciaBD";
		
		
		try {
			conexion = DriverManager.getConnection(URL, "root", "");
			ps = conexion.prepareStatement(SQLFILE.SQL_GETALLDPTOS);
			rs = ps.executeQuery();
			while(rs.next()) {
				dpto = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
				listaTodosDptos.add(dpto);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
	      try {		
			conexion.close();
			rs.close();
			ps.close();
	      }
	      catch(Exception ex) {
	    	  ex.printStackTrace();
	      }
		}
		
		return listaTodosDptos;
	}
	
	

}
