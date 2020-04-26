package views;

import java.util.ArrayList;

import dao.LivroDAO;
import models.Livro;
import utils.Console;

public class BuscarLivroPorAutor {
	public static void renderizar() {
		System.out.println("\n -- BUSCAR LIVRO POR AUTOR --\n");	
		String autor = Console.readString("Digite o autor do livro a buscar: ");

		if (!autor.isBlank()) {
			ArrayList<Livro> livrosEncontrados = LivroDAO.buscarLivroPorAutor(autor);

			if (!livrosEncontrados.isEmpty()) {
				for (Livro livro : livrosEncontrados) {
					System.out.println("\n" + livro);
				}
			} else {
				System.out.println("\nLIVRO NAO ENCONTRADO\n");
			}
		} else {
			System.out.println("\nAUTOR NAO PODE ESTAR VAZIO\n");
		}
	}
}
