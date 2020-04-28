package views;

import dao.ClienteDAO;
import dao.LivroDAO;
import models.Cliente;
import models.Emprestimo;
import models.Livro;
import utils.Console;

public class CadastrarEmprestimo {
	private static Emprestimo e = new Emprestimo();
	private static Cliente c = new Cliente();
	private static Livro l = new Livro();

	public static void renderizar() {
		e = new Emprestimo();
		c = new Cliente();
		l = new Livro();

		System.out.println("\n -- CADASTRAR EMPRESTIMO --\n ");
		c.setCpf(Console.readString("Informe o CPF do cliente: "));

		if (ClienteDAO.validarCliente(c.getCpf())) {
			l.setIsbn(Console.readString("Informe o ID do livro: "));
			if (LivroDAO.validarLivroPorId(l.getIdLivro())) {
				if (LivroDAO.validarDisponibilidadeLivro(l.getIdLivro())) {
					// Cadastrar emprestimo
					e.setCliente(c);
					e.setLivros(l);
					l.setEmprestado(true);
				} else {
					System.out.println("\nLIVRO ENCONTRA-SE EMPRESTADO NO SISTEMA\nEFETUE A DEVOLUCAO NO MENU");
				}

			} else {
				System.out.println("\nLIVRO NAO EXISTE\n");
			}
		}

	}
}