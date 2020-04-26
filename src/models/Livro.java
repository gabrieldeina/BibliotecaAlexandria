package models;

public class Livro {
	/* Variables */
	private int idLivro;
	private String isbn;
	private String titulo;
	private String autor;
	private int ano;
	private String genero;
	private boolean emprestado;
	
	/* Methods */
	@Override
	public String toString() {
		return "-----\n"
				+ "[Livro]: " + this.titulo
				+ ", " + this.autor
				+ " (" + this.ano + ")"
				+ "\nID: " + this.idLivro
				+ " | ISBN: " + this.isbn
				+ "\nGenero: " + this.genero
				+ "\n[Emprestado]: " + ((this.emprestado) ? "Sim" : "Nao")
				+ "\n-----\n";
	}
	
	/* Getters and setters */
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
}
