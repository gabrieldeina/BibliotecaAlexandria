package views;

import java.util.ArrayList;

import dao.LivroDAO;
import models.Livro;
import utils.Console;

public class BuscarLivroPorTitulo {
	public static void renderizar() {
		System.out.println("\n -- BUSCAR LIVRO POR TITULO --\n");	
		String titulo = Console.readString("Digite o titulo do livro a buscar: ");

		if (!titulo.isBlank()) {
			ArrayList<Livro> livrosEncontrados = LivroDAO.buscarLivroPorTitulo(titulo);

			if (!livrosEncontrados.isEmpty()) {
				for (Livro livro : livrosEncontrados) {
					System.out.println("\n" + livro);
				}
			} else {
				System.out.println("\nLIVRO NAO ENCONTRADO\n");
			}
		} else {
			System.out.println("\nTITULO NAO PODE ESTAR VAZIO\n");
		}
	}
}
