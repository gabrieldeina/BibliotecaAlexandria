package views;

import dao.LivroDAO;
import models.Livro;

public class ListarLivros {
	public static void renderizar() {
		System.out.println("\n -- LISTAR LIVROS --\n ");	

		for(Livro livroCadastrado : LivroDAO.retonarLivros()) {
			System.out.println(livroCadastrado);
		}
	}
}
