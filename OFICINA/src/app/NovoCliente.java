package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovoCliente {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();

		System.out.print("Informe o sexo (M/F): ");
		String sexo = sc.nextLine();
		
		Connection conexao = FabricaConexao.getConexao(); 
		
		String sql = "INSERT INTO CLIENTE(NOME, SEXO) VALUES (?,?)";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		
		stmt.setString(1, nome);
		stmt.setString(2, sexo);
		
		stmt.execute();
				
		System.out.println("Cliente inserido com sucesso");
		sc.close();

	}

}
