package es.ifp.programacion.uf6.ejercicio.negocio;

import java.util.ArrayList;
import java.util.Iterator;

import java.sql.*;

import es.ifp.programacion.uf6.ejercicio.persistencia.*;


public class AppController {
	
	public AppController() {
		
	}
	
	public void newEmpleado(Empleado emp) throws DptoNotFoundException{
		DBUtil dbUtil = new DBUtil();
		//Verificamos si se puede insertar: ¿Existe el departamento? 
		if (existsDepartamento(emp.getNumDpto())) {
			dbUtil.insertNewEmpleado(emp);
			System.out.println("Empleado insertado correctamente!");
		}
		else {
			System.out.println("No se ha insertado el empleado.");
			throw new DptoNotFoundException("Departamento no existente");
		}	
	}
	
	
	private boolean existsDepartamento(int numDepartamento) {
		ArrayList<Departamento> listaDptos = getAllDepartamentos();
		Iterator<Departamento> it = listaDptos.iterator();
		Departamento dpto = null;
		
		while (it.hasNext()) {
			dpto = it.next();
			if (numDepartamento==dpto.getNumDpto()) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Departamento> getAllDepartamentos() {
		DBUtil dbUtil = new DBUtil();
		return dbUtil.getAllDptos();
	}
	
	
	
	public ArrayList<Empleado> getAllEmpleados() {
		DBUtil dbUtil = new DBUtil();
		return dbUtil.getAllEmpleados();

	}

	public void removeEmpleado(int numEmpleado) throws EmpleadoNotFoundException {
		DBUtil dbUtil = new DBUtil();
		dbUtil.removeEmpleado(numEmpleado);
		System.out.println("Empleado "+ numEmpleado+" eliminado correctamente.");
	
	}

	public void removeDepartamento(int numDepartamento) throws DptoNotFoundException {
		DBUtil dbUtil = new DBUtil();
		dbUtil.removeDepartamento(numDepartamento);
		System.out.println("Departamento "+ numDepartamento+" eliminado correctamente.");
	}

	public void newDepartamento(Departamento dpto) throws DptoExistsException {
		DBUtil dbUtil = new DBUtil();
		//Verificamos si se puede insertar: ¿Existe el departamento? 
		if (!existsDepartamento(dpto.getNumDpto())) {
			dbUtil.insertNewDepartamento(dpto);
			System.out.println("Departamento insertado correctamente!");
		}
		else {
			System.out.println("Ya existe un departamento con ese número.");
			throw new DptoExistsException("Departamento ya existe.");
		}	
	
	}

	public void updateSalario(int numEmpleado, int nuevoSalario) throws EmpleadoNotFoundException{
		DBUtil dbUtil = new DBUtil();
		//Verificamos si se puede insertar: ¿Existe el empleado? 
		if (existsEmpleado(numEmpleado)) {
			dbUtil.updateSalario(numEmpleado, nuevoSalario);
			System.out.println("Departamento actualizado correctamente!");
		}
		else {
			System.out.println("No existe el empleado.");
			throw new EmpleadoNotFoundException("No existe el empleado con número "+numEmpleado);
		}	
	
		
		
	}

	private boolean existsEmpleado(int numEmpleado) {
			ArrayList<Empleado> listaEmpleados = this.getAllEmpleados();
			Iterator<Empleado> it = listaEmpleados.iterator();
			Empleado emp = null;
			
			while (it.hasNext()) {
				emp = it.next();
				if (numEmpleado==emp.getNumEmpleado()) {
					return true;
				}
			}
			return false;
		}

	public Empleado getEmpleadoById(int numEmpleado) throws EmpleadoNotFoundException {
		DBUtil dbUtil = new DBUtil();
		return dbUtil.getEmpleadoById(numEmpleado);
		
	}
	
	
	

	

}
