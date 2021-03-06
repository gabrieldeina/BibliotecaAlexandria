package dao;

import java.util.ArrayList;

import models.Emprestimo;

public class EmprestimoDAO {
	private static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	/* Retorna todos os emprestimos do cliente */
	public static ArrayList<Emprestimo> buscarEmprestimosPorCliente(String cpf) {
		ArrayList<Emprestimo> emprestimosEncontrados = new ArrayList<Emprestimo>();

		for (Emprestimo emprestimoCadastrado : emprestimos) {
			if (emprestimoCadastrado.getCliente().getCpf().equals(cpf)) {
				emprestimosEncontrados.add(emprestimoCadastrado);
				System.out.println(emprestimoCadastrado);
			}
		}
		return emprestimosEncontrados;
	}
	
	public static ArrayList<Emprestimo> buscarEmprestimosSemDevolucaoPorCliente(String cpf) {
		ArrayList<Emprestimo> emprestimosEncontrados = new ArrayList<Emprestimo>();

		for (Emprestimo emprestimoCadastrado : emprestimos) {
			if (emprestimoCadastrado.getCliente().getCpf().equals(cpf) && !emprestimoCadastrado.isDevolucaoRealizada()) {
				emprestimosEncontrados.add(emprestimoCadastrado);
				System.out.println(emprestimoCadastrado);
			}
		}
		return emprestimosEncontrados;
	}

	public static Emprestimo buscarEmprestimoPorCliente(String cpf) {
		for (Emprestimo emprestimoCadastrado : emprestimos) {
			if (emprestimoCadastrado.getCliente().getCpf().equals(cpf)) {
				return emprestimoCadastrado;
			}
		}
		return null;
	}
	
	public static Emprestimo buscarEmprestimoPorId(int id) {
		for (Emprestimo emprestimoCadastrado : emprestimos) {
			if (emprestimoCadastrado.getIdEmprestimo() == id) {
				return emprestimoCadastrado;
			}
		}
		return null;
	}

	public static Boolean cadastrarEmprestimo(Emprestimo e) {
		if (buscarEmprestimoPorId(e.getIdEmprestimo()) == null ) {
			emprestimos.add(e);	
			return true;
		}
		return false;
	}

	public static ArrayList<Emprestimo> retonarEmprestimos(){
		return emprestimos;
	}
}
