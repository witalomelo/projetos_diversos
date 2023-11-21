package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() {
		
		try {
			final String url = "jdbc:mysql://localhost/";
			final String usuario = "root";
			String senha = "123456";

			return DriverManager.getConnection(url, usuario, senha);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
	
	}

}
