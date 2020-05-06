package models;

import java.util.Calendar;
import java.util.Date;

public class Emprestimo {
	/* Variables */
	private int idEmprestimo;
	private Cliente cliente;
	private Funcionario funcionario;
	private Livro livros;
	private Date dataEmprestimo;
	private Date dataADevolver;
	private Date dataDevolucao;
	private Multa multa;
	private boolean devolucaoRealizada;
	
	/* Constructor */
	public Emprestimo(Date dataEmprestimo) {
		if (dataEmprestimo != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(dataEmprestimo);
			cal.add(Calendar.DATE, 15);

			this.dataADevolver = cal.getTime();
			this.dataEmprestimo = dataEmprestimo;
		}
	}
	
	public Emprestimo() {
		/* Empty constructor */
	}

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
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataEmprestimo);
		cal.add(Calendar.DATE, 15);

		this.dataADevolver = cal.getTime();
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
	
	public boolean isDevolucaoRealizada() {
		return devolucaoRealizada;
	}

	public void setDevolucaoRealizada(boolean devolucaoRealizada) {
		this.devolucaoRealizada = devolucaoRealizada;
	}

	public Date getDataADevolver() {
		return dataADevolver;
	}

	public void setDataADevolver(Date dataADevolver) {
		this.dataADevolver = dataADevolver;
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
				+ " | Data a Devolver: " + this.getDataADevolver()
				+ " | Data Devolucao: " + this.getDataDevolucao()
				+ "\n[Devolucao Relizada]: " + ((this.devolucaoRealizada) ? "Sim" : "Nao")
				+ "\n-----\n";
	}
}
