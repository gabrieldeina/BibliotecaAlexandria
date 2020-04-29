package dao;

import java.util.ArrayList;
import models.Funcionario;

public class FuncionarioDAO {

	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public static Funcionario buscarFuncionarioPorCpf(String cpf) {
		for (Funcionario funcionarioCadastrado : funcionarios) {
			if (funcionarioCadastrado.getCpf().equals(cpf)) {
				return funcionarioCadastrado;
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
	public static Boolean validarFuncionario(String cpf) {
		for (Funcionario validarFuncionario : funcionarios) {
			if (validarFuncionario.getCpf().equals(cpf) && validarFuncionario.isAtivo() == true) {
				return true;
			}
		}
		return false;
	}

	public static Boolean cadastrarFuncionario(Funcionario f) {
		if (buscarFuncionarioPorCpf(f.getCpf()) == null) {
			funcionarios.add(f);
			return true;
		}
		return false;
	}

	public static ArrayList<Funcionario> retonarFuncionarios() {
		return funcionarios;
	}

}
