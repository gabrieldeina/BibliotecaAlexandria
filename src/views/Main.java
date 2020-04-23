package views;

import dao.Dados;
import models.*;
import utils.Console;

public class Main {

    public static void main(String[] args) {
        String menu[] = new String[] {
    			"Sair",
    			"Cadastrar Cliente", "Listar Clientes",
    			"Cadastrar Emprestimo", "Listar Emprestimos",
    			"Cadastrar Funcionario", "Listar Funcionarios",
    			"Cadastrar Livro", "Listar Livros",
                "Listar Vendas por Cliente"
        };
        int opcao;

        do {

            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + " - " + menu[i]);
            }

            opcao = Console.readInt("Informe qual menu deseja entrar: ");

            switch (opcao) {
            case 0:
                sair();
                break;
            case 1:
                CadastrarCliente.renderizar();
                break;
            case 2:
                ListarClientes.renderizar();
                break;
            case 3:
                CadastrarEmprestimo.renderizar();
                break;
            case 4:
                ListarEmprestimos.renderizar();
                break;
            case 5:
                CadastrarFuncionario.renderizar();
                break;
            case 6:
                ListarFuncionarios.renderizar();
                break;
            case 7:
                CadastrarLivro.renderizar();
                break;
            case 8:
            	ListarLivros.renderizar();
                break;
            case 9:
            	/* Listar Vendas por Clientes */
                break;
            default:
                padrao();
                break;
            }
        } while (opcao != 0);
    }

    public static void sair() {
        System.out.println("\nFechando o programa.");
    }

    public static void padrao() {
        System.out.println("\nOpção inválida");
    }
}
