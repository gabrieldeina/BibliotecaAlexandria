package models;

public class Funcionario {
	/* Variables */
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private String cidade;
	private boolean ativo;
	
	/* Methods */
	@Override
	public String toString() {
		return "-----\n"
				+ "[Funcionario]: " + this.nome
				+ "\n[Ativo]: " + ((this.ativo) ? "Sim" : "Nao")
				+ "\nCPF: " + this.cpf 
				+ " | Telefone: " + this.telefone
				+ "\nEndereco: " + this.endereco
				+ " | Cidade: " + this.cidade
				+ "\n-----\n";
	}

	/* Getters and setters */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
