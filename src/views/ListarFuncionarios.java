package views;
import dao.FuncionarioDAO;
import models.Funcionario;

public class ListarFuncionarios {	
	
	public static void renderizar() {
		System.out.println("\n -- LISTAR FUNCIONARIOS --\n ");	
		
		for(Funcionario funcionarioCadastrado : FuncionarioDAO.retonarFuncionarios()) {
			System.out.println(funcionarioCadastrado);
		}
	}
}
