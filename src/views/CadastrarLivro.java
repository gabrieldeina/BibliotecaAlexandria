package views;

import dao.LivroDAO;
import models.Livro;
import utils.Console;
import utils.Validacao;

public class CadastrarLivro {

	private static Livro l = new Livro();

	public static void renderizar() {
		l = new Livro();

		System.out.println("\n -- CADASTRAR LIVRO --\n ");

		l.setIdLivro(Console.readInt("Digite o ID: "));
		l.setIsbn(Console.readString("Digite o ISBN 13: "));
		l.setTitulo(Console.readString("Digite o titulo: "));
		l.setAutor(Console.readString("Digite o autor: "));
		l.setAno(Console.readInt("Digite a ano: "));
		l.setGenero(Console.readString("Digite o genero: "));
		l.setEmprestado(false);

		if (Validacao.validarIsbn(l.getIsbn())) {
			if (LivroDAO.cadastrarLivro(l)) {
				System.out.println("\nLIVRO CADASTRADO\n");
			} else {
				System.out.println("\nESSE LIVRO JA EXISTE\n");
			}
		} else {
			System.out.println("\nISBN invalido!");
		}
	}
}
