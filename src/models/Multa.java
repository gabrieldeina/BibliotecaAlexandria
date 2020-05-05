package models;

import java.util.Date;

public class Multa {
	/* Variables */
	private Double valor;
	private Emprestimo emprestimo;
	
	/* Constructor */
	public Multa (Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
		this.valor = calcularMulta();
	}

	/* Methods */
	public Double calcularMulta() {
		Date dateNow = new Date();
		Double valorMulta = 0.0;
		
		/* Livro retornado sem multa */
		if (this.emprestimo.getDataDevolucao().after(dateNow)) {
			return valorMulta;
		} else {
			/* Valor inicial da multa */
			valorMulta = 5.0;

			/* Adicionando 0,50 centavos por dia */
			long diffTime = dateNow.getTime() - this.emprestimo.getDataDevolucao().getTime();
			long diffDays = diffTime / (1000 * 60 * 60 * 24);

			valorMulta += 0.50 * diffDays;

			System.out.println("A diferenca entre "
					  + dateNow + " e "
					  + this.emprestimo.getDataDevolucao() + " = "
					  + diffDays + " dias.");
		}

		return valorMulta;
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
