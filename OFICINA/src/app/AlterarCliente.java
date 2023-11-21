package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarCliente {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String select = "SELECT IDCLIENTE, NOME, SEXO, ID_CARRO FROM CLIENTE WHERE IDCLIENTE = ?";
		String update = "UPDATE CLIENTE SET NOME = ? WHERE IDCLIENTE = ?";
		;

		System.out.println("Informe o ID para alteracao: ");
		Integer id = sc.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, id);

		ResultSet r = stmt.executeQuery();

		if (r.next()) {
			Integer idCliente = r.getInt("IDCLIENTE");
			String nome = r.getString("NOME");
			String sexo = r.getString("SEXO");
			Integer idCarro = r.getInt("ID_CARRO");

			Cliente c = new Cliente(idCliente, nome, sexo, idCarro);

			System.out.println("O nome atual é: " + c.getNome());
			sc.nextLine();

			System.out.println("Informe o novo nome: ");
			String novoNome = sc.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, id);

			int linhasAfetadas = stmt.executeUpdate();

			if (linhasAfetadas > 0) {
				System.out.println("Cliente alterado com sucesso");
			} else {
				System.out.println("ERRO: Verifique o ID informado.");
			}

		}

		sc.close();
		conexao.close();
	}

}
