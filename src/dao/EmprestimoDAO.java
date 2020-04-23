package dao;

import java.util.ArrayList;

import models.Emprestimo;

public class EmprestimoDAO {
	private static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public static Emprestimo buscarEmprestimoPorCliente(String cpf) {
		for (Emprestimo emprestimoCadastrado : emprestimos) {
			if (emprestimoCadastrado.getCliente().getCpf().equals(cpf)) {
				return emprestimoCadastrado;
			}
		}
		return null;
	}

	public static Boolean cadastrarEmprestimo(Emprestimo e) {
		if(buscarEmprestimoPorCliente(e.getCliente().getCpf()) == null) {
			emprestimos.add(e);	
			return true;
		}
		return false;
	}

	public static ArrayList<Emprestimo> retonarEmprestimos(){
		return emprestimos;
	}
}
