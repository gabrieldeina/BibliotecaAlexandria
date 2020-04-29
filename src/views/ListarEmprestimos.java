package views;

import dao.EmprestimoDAO;
import models.Emprestimo;

public class ListarEmprestimos {
	public static void listarEmprestimos() {
		System.out.println("\n -- LISTAR EMPRESTIMOS --\n ");

		for (Emprestimo emprestimoCadastrado : EmprestimoDAO.retonarEmprestimos()) {
			System.out.println(emprestimoCadastrado);
		}
	}
}
