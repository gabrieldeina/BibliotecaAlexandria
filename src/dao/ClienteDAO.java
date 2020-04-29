package dao;

import java.util.ArrayList;

import models.Cliente;

public class ClienteDAO {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public static Cliente buscarClientePorCpf(String cpf) {
		for (Cliente clienteCadastrado : clientes) {
			if (clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}

	/**
	 * Retorna um valor booleano para informar se existe um cliente cadastrado com
	 * aquele CPF na hora do empréstimo
	 * 
	 * @author gabrieldeina
	 */
	public static Boolean validarCliente(String cpf) {
		for (Cliente validarCliente : clientes) {
			if (validarCliente.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public static Boolean cadastrarCliente(Cliente c) {
		if (buscarClientePorCpf(c.getCpf()) == null) {
			clientes.add(c);
			return true;
		}
		return false;
	}

	public static ArrayList<Cliente> retonarClientes() {
		return clientes;
	}
}
