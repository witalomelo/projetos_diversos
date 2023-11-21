package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
	
	public static void main(String[] args) throws SQLException {
		
	     	Connection conexao = FabricaConexao.getConexao();

	        Statement stmt = conexao.createStatement();
	        stmt.execute("CREATE DATABASE CODER");
	        
	        conexao.close();
	}

}

