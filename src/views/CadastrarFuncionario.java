package views;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import models.Funcionario;
import utils.Console;
import utils.Validacao;

public class CadastrarFuncionario {

	private static Funcionario f = new Funcionario();

	public static void renderizar() {

		f = new Funcionario();

		System.out.println("\n -- CADASTRAR FUNCIONARIO --\n ");

		f.setNome(Console.readString("Digite o nome: "));
		f.setCpf(Console.readString("Digite o CPF: "));
		
		if (Validacao.validarCpf(f.getCpf())) {
			if (FuncionarioDAO.cadastrarFuncionario(f)) {
				System.out.println("\nFUNCIONARIO CADASTRADO!!!\n");
			} else {
				System.out.println("\nESSE FUNCIONARIO JA EXISTE!!!\n");
			}
		} else {
			System.out.println("\nCPF invalido!");
		}

	}

}