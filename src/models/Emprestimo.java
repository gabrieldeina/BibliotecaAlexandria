package models;

import java.util.Date;

public class Emprestimo {
	/* Variables */
	private int idEmprestimo;
	private Cliente cliente;
	private Funcionario funcionario;
	private Livro livros;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	private Multa multa;

	/* Getters and setters */
	public int getIdEmprestimo() {
		return idEmprestimo;
	}

	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Livro getLivros() {
		return livros;
	}

	public void setLivros(Livro livros) {
		this.livros = livros;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Multa getMulta() {
		return multa;
	}

	public void setMulta(Multa multa) {
		this.multa = multa;
	}
	
	@Override
	public String toString() {
		return "-----\n"
				+ "[Cliente]: " + this.getCliente().getNome()
				+ " | CPF: " + this.getCliente().getCpf()
				+ "\nID Empréstimo: " + this.getIdEmprestimo()
				+ " | Livro: " + this.getLivros().getTitulo()
				+ " | ID Livro: " + this.getLivros().getIdLivro()
				+ "\nData Emprestimo: " + this.getDataEmprestimo()
				+ " | Data Devolucao: " + this.getDataDevolucao()
				+ "\n-----\n";
	}
}
