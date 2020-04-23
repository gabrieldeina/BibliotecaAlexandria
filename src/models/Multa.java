package models;

public class Multa {
	/* Variables */
	private Double valor;
	private Emprestimo emprestimo;
	
	/* Methods */
	public Double calcularMulta() {
		return 0.0;
	}

	/* Getters and setters */
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
}
