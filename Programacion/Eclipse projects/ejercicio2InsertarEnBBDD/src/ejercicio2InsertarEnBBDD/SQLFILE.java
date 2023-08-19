package ejercicio2InsertarEnBBDD;

public class SQLFILE {
	public static final String CONEXION_URL = "jdbc:mysql://localhost/ejerpersistenciabd";
	
	public static final String SQL_INSERT_DEPTO = "INSERT INTO DEPARTAMENTOS (dpto_no, nombre, localidad) VALUES (?,?,?)";
	public static final String SQL_GETALLDPTOS="SELECT * FROM DEPARTAMENTOS";
	public static final String SQL_GETALLEMPLEADOS="SELECT emp_no, apellido, salario,oficio, dpto_no  FROM EMPLEADOS";
	public static final String SQL_GETEMPLEADO_BY_ID = "SELECT emp_no, apellido, salario, oficio, dpto_no FROM EMPLEADOS WHERE EMP_NO=?";
	public static final String SQL_INSERTEMP = "INSERT INTO EMPLEADOS (apellido, oficio, salario, dpto_no)VALUES (?,?,?,?)";
	public static final String SQL_REMOVE_EMPLEADO_BY_ID = "DELETE FROM EMPLEADOS WHERE emp_no=?";
	public static final String SQL_REMOVE_DEPARTAMENTO_BY_ID = "DELETE FROM DEPARTAMENTOS WHERE dpto_no=?";
	public static final String SQL_UPDATE_SALARIO = "UPDATE EMPLEADOS SET SALARIO=? WHERE EMP_NO=?";

}
