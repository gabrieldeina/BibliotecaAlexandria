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

		c.setCpf(Console.readString("Digite o CPF: "));
		if (Validacao.validarCpf(c.getCpf())) {
			if (ClienteDAO.cadastrarCliente(c)) {
				c.setNome(Console.readString("Digite o nome: "));
				c.setRg(Console.readString("Digite o RG: "));

				do {
					c.setSexo(Console.readString("Informe o sexo do cliente Masculino | Feminino: "));
				} while (!c.getSexo().equals("Masculino") && !c.getSexo().equals("Feminino"));

				c.setTelefone(Console.readString("Digite o telefone (com DDD): "));
				c.setEndereco(Console.readString("Digite o Endereco: "));
				c.setCidade(Console.readString("Digite a Cidade: "));
				System.out.println("\nCLIENTE CADASTRADO");
			} else {
				System.out.println("\nESSE CLIENTE JA EXISTE\n");
			}
		} else {
			System.out.println("\nCPF INVALIDO!\n");
		}
	}
}
