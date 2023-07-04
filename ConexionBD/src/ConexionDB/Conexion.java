package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

	public static void main(String[] args) {
		
	try {
		String servidor = "jdbc:mysql://bcvzbtd1yrpbyauhgb2o-mysql.services.clever-cloud.com:3306/bcvzbtd1yrpbyauhgb2o";
		String usuario = "upldgvwf05icjoul";
		String pass = "z7KaOWCB4TzrTmAxHgCw";
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(servidor, usuario , pass);
		System.out.println("  conexion ok  !!");
		
	} catch(ClassNotFoundException e) {
		System.out.println(" Error al cargar el controlador ");
		e.printStackTrace();
		
	} catch (SQLException e) {
		
		System.out.println(" error en la conexion  !!!!!");
		e.printStackTrace();
	}
		
		
	}

}
