package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarCliente {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.print("Informe o codigo do cliente para ser deletado: ");
		int id = sc.nextInt();
		
		//SQL
		String sql = "DELETE FROM CLIENTE WHERE IDCLIENTE = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		
		if(stmt.executeUpdate() > 0) { //executeUpdate retorna 2 caso consiga alterar
			System.out.println("Pessoa excluida com sucesso");
		} else {
			System.out.println("Não encontrado. Verifique o ID informado.");
		}
		
		conexao.close();
		sc.close();
		

	}

}
