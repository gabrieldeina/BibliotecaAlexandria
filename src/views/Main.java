package views;
import dao.Dados;
import utils.Console;

public class Main {
	enum Menu {
		SAIR,
		CADASTRAR_CLIENTE,
		LISTAR_CLIENTES,
		CADASTRAR_FUNCIONARIO,
		LISTAR_FUNCIONARIOS,
		CADASTRAR_EMPRESTIMO,
		LISTAR_EMPRESTIMOS,
		CADASTRAR_LIVRO,
		LISTAR_LIVROS,
		LISTAR_LIVROS_EMPRESTADOS,
		LISTAR_LIVROS_DISPONIVEIS,
		BUSCAR_LIVRO_POR_TITULO,
		BUSCAR_LIVRO_POR_AUTOR
	}

	public static void main(String[] args) {
		int userInput 		= 0;
		Menu menuArray[]	= Menu.values();
		
		/* Cadastrar clientes, funcionarios, livros e emprestimos para teste */
		Dados.inicializar();

		do {
			System.out.println("[Biblioteca Alexandria]\n-----");

			for (Menu item : menuArray) {
				String menuEntry = item.toString().toLowerCase().replaceAll("_", " ");			// Lower case and replace underscores
				menuEntry = menuEntry.substring(0, 1).toUpperCase() + menuEntry.substring(1);	// Capitalize first letter

	            System.out.println(
	            		item.ordinal()	// Index
		    			+ " - "			// Separator
		    			+ menuEntry		// Menu Entry
	    		);
	        }

			System.out.println("-----\n");
			userInput = Console.readInt("Opcao (default = 0): ");

			try {
				System.out.println("\nOpcao escolhida: [" + menuArray[userInput] + "]");
			} catch (Exception e) {
				System.out.println("\n[Error]: " + e.getMessage());
				return;
			}
			
			switch (menuArray[userInput]) {
			case SAIR:
				System.out.println("Saindo...");
				break;
			case CADASTRAR_CLIENTE:
				CadastrarCliente.renderizar();
				break;
			case LISTAR_CLIENTES:
				ListarClientes.renderizar();
				break;
			case CADASTRAR_FUNCIONARIO:
				CadastrarFuncionario.renderizar();
				break;
			case LISTAR_FUNCIONARIOS:
				ListarFuncionarios.renderizar();
				break;
			case CADASTRAR_EMPRESTIMO:
				CadastrarEmprestimo.renderizar();
				break;
			case LISTAR_EMPRESTIMOS:
				ListarEmprestimos.renderizar();
				break;
			case CADASTRAR_LIVRO:
				CadastrarLivro.renderizar();
				break;
			case LISTAR_LIVROS:
				ListarLivros.renderizar();
				break;
			case LISTAR_LIVROS_EMPRESTADOS:
				ListarLivrosEmprestados.renderizar();
				break;
			case LISTAR_LIVROS_DISPONIVEIS:
				ListarLivrosDisponiveis.renderizar();
				break;
			case BUSCAR_LIVRO_POR_TITULO:
				BuscarLivroPorTitulo.renderizar();
				break;
			case BUSCAR_LIVRO_POR_AUTOR:
				BuscarLivroPorAutor.renderizar();
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
			}

		} while (userInput != 0);

	}
}
