package views;

import dao.LivroDAO;
import models.Cliente;
import models.Emprestimo;
import models.Funcionario;
import models.Livro;
import models.Multa;
import utils.Console;

public class CadastrarDevolucao {
	private static Cliente c = new Cliente();
	private static Emprestimo e = new Emprestimo();
	private static Funcionario f = new Funcionario();
	private static Livro l = new Livro();
	private static Multa m = new Multa();

	public static void renderizar() {
		c = new Cliente();
		e = new Emprestimo();
		f = new Funcionario();
		l = new Livro();
		m = new Multa();

		System.out.println("\n -- CADASTRAR DEVOLUCAO --\n ");
		l.setIdLivro(Console.readInt("Informe o ID do Livro: "));
		l = LivroDAO.buscarLivroPorIdLivro(l.getIdLivro());

		if (LivroDAO.validarLivroPorId(l.getIdLivro())) {
			if (!LivroDAO.validarDisponibilidadeLivro(l.getIdLivro())) {

			} else {
				System.out.println("\nLivro não encontra-se emprestado no sistema!\n");
			}
		} else {
			System.out.println("\nLivro não existe no sistema\n");
		}
	}

}
