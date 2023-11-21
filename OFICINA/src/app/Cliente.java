package app;

public class Cliente {
	
	private int idcliente;
	private String nome;
	private String sexo;
	private int id_carro;
	
	public Cliente(int idcliente, String nome, String sexo, int id_carro) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.sexo = sexo;
		this.id_carro = id_carro;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId_carro() {
		return id_carro;
	}

	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
	}
	

}
