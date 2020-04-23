package views;
import dao.ClienteDAO;
import models.Cliente;
import utils.Console;
import utils.Validacao;

public class CadastrarCliente {

	private static Cliente c = new Cliente();

	public static void renderizar() {

		c = new Cliente();

		System.out.println("\n -- CADASTRAR CLIENTE --\n ");

		c.setNome(Console.readString("Digite o nome: "));
		c.setCpf(Console.readString("Digite o CPF: "));

		if (Validacao.validarCpf(c.getCpf())) {
			if (ClienteDAO.cadastrarCliente(c)) {
				System.out.println("\nCLIENTE CADASTRADO!!!\n");
			} else {
				System.out.println("\nESSE CLIENTE JA EXISTE!!!\n");
			}
		} else {
			System.out.println("\nCPF invalido!");
		}

	}

}