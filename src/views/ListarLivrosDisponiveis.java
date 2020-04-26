package views;

import dao.LivroDAO;
import models.Livro;

public class ListarLivrosDisponiveis {
	public static void renderizar() {
		System.out.println("\n -- LISTAR LIVROS DISPONIVEIS --\n ");	

		for(Livro livroDisponivel : LivroDAO.retornarLivrosDisponiveis()) {
			System.out.println(livroDisponivel);
		}
	}
}
