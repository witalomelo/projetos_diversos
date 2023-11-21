package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostrarClientes {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = null;
        ResultSet resultado = null;

		String sql = "SELECT * FROM CLIENTE";
		
		stmt = conexao.prepareStatement(sql);
		resultado = stmt.executeQuery();
		
		
		List<Cliente> clientes = new ArrayList<>();

		while (resultado.next()) { // retorna true ou false
			int idcliente = resultado.getInt("idcliente");
			String nome = resultado.getString("nome");
			String sexo = resultado.getString("sexo");
			Integer id_carro = resultado.getInt("id_carro");
			clientes.add(new Cliente(idcliente, nome, sexo, id_carro));
		}

		for (Cliente p : clientes) {
			System.out.println(p.getIdcliente() + " ," + p.getNome() + ", " + p.getSexo() + ", " + p.getId_carro());
		}

		conexao.close();

	}

}
