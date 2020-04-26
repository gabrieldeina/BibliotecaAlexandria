package views;

import dao.LivroDAO;
import models.Livro;

public class ListarLivrosEmprestados {
	public static void renderizar() {
		System.out.println("\n -- LISTAR LIVROS EMPRESTADOS --\n ");	

		for(Livro livroEmprestado : LivroDAO.retornarLivrosEmprestados()) {
			System.out.println(livroEmprestado);
		}
	}
}
