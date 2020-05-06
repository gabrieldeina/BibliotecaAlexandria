package views;

import java.util.ArrayList;

import dao.ClienteDAO;
import dao.EmprestimoDAO;
import models.Cliente;
import models.Emprestimo;
import models.Multa;
import utils.Console;

public class RealizarDevolucao {

	private static Emprestimo e = new Emprestimo();
	private static Cliente c = new Cliente();

	public static void renderizar() {
		e = new Emprestimo();
		c = new Cliente();

		System.out.println("\n -- REALIZAR DEVOLUCAO --\n ");
		c.setCpf(Console.readString("Informe o CPF do cliente: "));
		c = ClienteDAO.buscarClientePorCpf(c.getCpf());

		if (c != null) {
			ArrayList<Emprestimo> listaEmprestimos = EmprestimoDAO.buscarEmprestimosSemDevolucaoPorCliente(c.getCpf());

			if (listaEmprestimos != null && !listaEmprestimos.isEmpty()) {
				e.setIdEmprestimo(Console.readInt("Informe o ID do emprestimo: "));
				e = EmprestimoDAO.buscarEmprestimoPorId(e.getIdEmprestimo());

				System.out.println(e.getLivros());

				e.getLivros().setEmprestado(false);
				e.setDevolucaoRealizada(true);

				Multa multa = new Multa(e);
				e.setMulta(multa);

				if (e.getMulta().getValor() == 0.0) {
					System.out.println("\nLivro retornado sem multa!\n");
				} else {
					System.out.println("\nLivro retornado com multa de: R$" + e.getMulta().getValor() + ".\n");
				}

			} else {
				System.out.println("\nCliente nao tem emprestimos ativos!\n ");
				return;
			}

		} else {
			System.out.println("\nCLIENTE NAO EXISTE\n");
		}

	}

}
