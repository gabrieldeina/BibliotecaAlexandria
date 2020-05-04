package views;

import java.util.ArrayList;

import dao.EmprestimoDAO;
import models.Emprestimo;
import models.Multa;
import utils.Console;

public class RealizarDevolucao {

	private static Emprestimo e = new Emprestimo();

	public static void renderizar() {
		e = null;

		System.out.println("\n -- REALIZAR DEVOLUCAO --\n ");
		String cpfCliente = Console.readString("Informe o CPF do cliente: ");

		ArrayList<Emprestimo> listaEmprestimos = EmprestimoDAO.buscarEmprestimosPorCliente(cpfCliente);

		if (listaEmprestimos == null) {
			System.out.println("\nCliente nao tem emprestimos realizados!\n ");
			return;
		}

		while (e == null) {
			int idEmprestimo = Console.readInt("Informe o ID do emprestimo: ");

			for (Emprestimo emprestimo : listaEmprestimos) {
				if (idEmprestimo == emprestimo.getIdEmprestimo()) {
					e = emprestimo;
				}
			}
		}

		System.out.println(e.getLivros());
		char confirmacao = 'N'; // Default value
		confirmacao = Console.readChar("\nConfirmar devolucao? (y/N): ");

		if (confirmacao != 'y' || confirmacao != 'Y') {
			return;
		}

		e.getLivros().setEmprestado(false);

		Multa multa = new Multa(e);
		e.setMulta(multa);

		if (e.getMulta().getValor() == 0.0) {
			System.out.println("\nLivro retornado sem multa!\n");
		} else {
			System.out.println("\nLivro retornado com multa de: R$" + e.getMulta().getValor() + ".\n");
		}

	}

}
