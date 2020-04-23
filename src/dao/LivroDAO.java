package dao;

import java.util.ArrayList;

import models.Livro;

public class LivroDAO {
	private static ArrayList<Livro> livros = new ArrayList<Livro>();

	public static Livro buscarLivroPorTitulo(String titulo) {
		for (Livro livroCadastrado : livros) {
			if (livroCadastrado.getTitulo().equals(titulo)) {
				return livroCadastrado;
			}
		}
		return null;
	}
	
	public static Livro buscarLivroPorAutor(String autor) {
		for (Livro livroCadastrado : livros) {
			if (livroCadastrado.getAutor().equals(autor)) {
				return livroCadastrado;
			}
		}
		return null;
	}

	public static Boolean cadastrarLivro(Livro l) {
		if (buscarLivroPorTitulo(l.getTitulo()) == null) {
			livros.add(l);
			return true;
		}
		return false;
	}

	public static ArrayList<Livro> retonarLivros() {
		return livros;
	}
	
	public static ArrayList<Livro> retornarLivrosEmprestados() {
		/* TODO: implementar */
		return livros;
	}
	
	public static ArrayList<Livro> retornarLivrosDisponiveis() {
		/* TODO: implementar */
		return livros;
	}
}
