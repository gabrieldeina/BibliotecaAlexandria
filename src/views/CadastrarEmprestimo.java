package views;

import java.util.Date;

import dao.ClienteDAO;
import dao.EmprestimoDAO;
import dao.FuncionarioDAO;
import dao.LivroDAO;
import models.Cliente;
import models.Emprestimo;
import models.Funcionario;
import models.Livro;
import utils.Console;

public class CadastrarEmprestimo {
	private static Emprestimo e = new Emprestimo();
	private static Cliente c = new Cliente();
	private static Livro l = new Livro();
	private static Funcionario f = new Funcionario();

	public static void renderizar() {
		e = new Emprestimo();
		c = new Cliente();
		l = new Livro();
		f = new Funcionario();

		System.out.println("\n -- CADASTRAR EMPRESTIMO --\n ");
		c.setCpf(Console.readString("Informe o CPF do cliente: "));
		c = ClienteDAO.buscarClientePorCpf(c.getCpf());

		if (ClienteDAO.validarCliente(c.getCpf())) {
			e.setCliente(c);
			f.setCpf(Console.readString("Informe o CPF do funcionário: "));
			f = FuncionarioDAO.buscarFuncionarioPorCpf(f.getCpf());

			if (FuncionarioDAO.validarFuncionario(f.getCpf())) {
				e.setFuncionario(f);
				l.setIdLivro(Console.readInt("Informe o ID do livro: "));
				l = LivroDAO.buscarLivroPorIdLivro(l.getIdLivro());

				if (LivroDAO.validarLivroPorId(l.getIdLivro())) {
					e.setLivros(l);
					if (LivroDAO.validarDisponibilidadeLivro(l.getIdLivro())) {
						System.out.println("Data de Empréstimo\n");
						Date dataEmprestimo = Console.validarData();
						while (dataEmprestimo == null) {
							System.out.println("\nData de Empréstimo\n");
							dataEmprestimo = Console.validarData();
						}
						e.setDataEmprestimo(dataEmprestimo);
						e.setIdEmprestimo(Console.readInt("Informe um ID para este empréstimo: "));
						EmprestimoDAO.cadastrarEmprestimo(e);
						l.setEmprestado(true);
						System.out.println("\nLIVRO EMPRESTADO COM SUCESSO PARA \n" + e.getCliente() + "\n");

					} else {
						System.out.println("\nLIVRO ENCONTRA-SE EMPRESTADO NO SISTEMA\nEFETUE A DEVOLUCAO NO MENU\n");
					}

				} else {
					System.out.println("\nLIVRO NAO EXISTE\n");
				}
			} else {
				System.out.println("\nFUNCIONARIO NAO EXISTE OU ESTÁ INATIVO\n");
			}
		}

	}

}