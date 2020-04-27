package views;

import java.util.ArrayList;

import dao.LivroDAO;
import models.Livro;
import utils.Console;

public class ListarLivros {

	public static void listarLivros() {
		System.out.println("\n -- LISTAR LIVROS --\n ");

		for (Livro livroCadastrado : LivroDAO.retonarLivros()) {
			System.out.println(livroCadastrado);
		}
	}

	public static void listarLivrosDisponiveis() {
		System.out.println("\n -- LISTAR LIVROS DISPONIVEIS --\n ");

		for (Livro livroDisponivel : LivroDAO.retornarLivrosDisponiveis()) {
			System.out.println(livroDisponivel);
		}
	}

	public static void listarLivrosEmprestados() {
		System.out.println("\n -- LISTAR LIVROS EMPRESTADOS --\n ");

		for (Livro livroEmprestado : LivroDAO.retornarLivrosEmprestados()) {
			System.out.println(livroEmprestado);
		}
	}

	public static void buscarLivroPorAutor() {
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

	public static void buscarLivroPorTitulo() {
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
