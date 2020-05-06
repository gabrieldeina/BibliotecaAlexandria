package models;

public class Cliente {
	/* Variables */
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String endereco;
	private String cidade;
	private String sexo;

	/* Methods */
	@Override
	public String toString() {
		return "-----\n"
				+ "[Cliente]: " + this.nome
				+ "\nCPF: " + this.cpf
				+ " | RG: " + this.rg
				+ "\nSexo: " + this.sexo
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
