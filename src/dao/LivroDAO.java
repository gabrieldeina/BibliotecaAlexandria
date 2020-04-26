package dao;

import java.util.ArrayList;

import models.Livro;

public class LivroDAO {
	private static ArrayList<Livro> livros = new ArrayList<Livro>();

	public static ArrayList<Livro> buscarLivroPorTitulo(String titulo) {
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();

		for (Livro livroCadastrado : livros) {
			if (livroCadastrado.getTitulo().contains(titulo)) {
				livrosEncontrados.add(livroCadastrado);
			}
		}
		return livrosEncontrados;
	}
	
	public static ArrayList<Livro> buscarLivroPorAutor(String autor) {
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();

		for (Livro livroCadastrado : livros) {
			if (livroCadastrado.getAutor().contains(autor)) {
				livrosEncontrados.add(livroCadastrado);
			}
		}
		return livrosEncontrados;
	}

	public static Livro buscarLivroPorIsbn(String isbn) {
		for (Livro livroCadastrado : livros) {
			if (livroCadastrado.getIsbn().equals(isbn)) {
				return livroCadastrado;
			}
		}
		return null;
	}

	public static Boolean cadastrarLivro(Livro l) {
		if (buscarLivroPorIsbn(l.getIsbn()) == null) {
			livros.add(l);
			return true;
		}
		return false;
	}

	public static ArrayList<Livro> retonarLivros() {
		return livros;
	}
	
	public static ArrayList<Livro> retornarLivrosEmprestados() {
		ArrayList<Livro> livrosEmprestados = new ArrayList<Livro>();

		for (Livro livroCadastrado : livros) {
			if (livroCadastrado.isEmprestado()) {
				livrosEmprestados.add(livroCadastrado);
			}
		}
		return livrosEmprestados;
	}
	
	public static ArrayList<Livro> retornarLivrosDisponiveis() {
		ArrayList<Livro> livrosDisponiveis = new ArrayList<Livro>();

		for (Livro livroCadastrado : livros) {
			if (!livroCadastrado.isEmprestado()) {
				livrosDisponiveis.add(livroCadastrado);
			}
		}
		return livrosDisponiveis;
	}
}
