package app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoTabela {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = """
				CREATE TABLE PESSOAS(
					CODIGO INT PRIMARY KEY AUTO_INCREMENT,
					NOME VARCHAR(30) NOT NULL					
					);
				""";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("tabela criada");
		conexao.close();
	}

}
