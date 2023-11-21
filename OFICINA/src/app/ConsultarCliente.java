package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarCliente {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		

		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM CLIENTE WHERE NOME LIKE ?";

		System.out.println("Informe o valor para pesquisa: ");
		String valor = sc.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Cliente> clientes = new ArrayList<>();

		while(resultado.next()){ //retorna true ou false 
			int idcliente = resultado.getInt("idcliente");
			String nome = resultado.getString("nome");
			String sexo = resultado.getString("sexo");
			Integer id_carro = resultado.getInt("id_carro");
			clientes.add(new Cliente(idcliente, nome, sexo, id_carro));
		}

		for(Cliente p : clientes){
			System.out.println(p.getIdcliente() + " ," + p.getNome() + ", " + p.getSexo() + ", " + p.getId_carro());
		}

		conexao.close();
		

	}

}
