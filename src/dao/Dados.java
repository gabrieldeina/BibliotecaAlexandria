package dao;

import models.Cliente;
import models.Funcionario;
import models.Livro;

public class Dados {

	public static void inicializar() {
		/* Cadastrar clientes */
		{
			Cliente c = new Cliente();
			c.setNome("Jerry Seinfeld");
			c.setCpf("21513124536");
			c.setTelefone("41999999901");
			c.setEndereco("Avenida das Acacias, 22");
			c.setCidade("Curitiba");
			ClienteDAO.cadastrarCliente(c);
		}
		
		{
			Cliente c = new Cliente();
			c.setNome("George Costanza");
			c.setCpf("05231357693");
			c.setTelefone("41999999902");
			c.setEndereco("Avenida das Acacias, 23");
			c.setCidade("Curitiba");
			ClienteDAO.cadastrarCliente(c);
		}

		{
			Cliente c = new Cliente();
			c.setNome("Elaine Benes");
			c.setCpf("29640837385");
			c.setTelefone("11999999903");
			c.setEndereco("Avenida das Acacias, 24");
			c.setCidade("Sao Paulo");
			ClienteDAO.cadastrarCliente(c);
		}

		{
			Cliente c = new Cliente();
			c.setNome("Cosmo Kramer");
			c.setCpf("84701617091");
			c.setTelefone("21999999904");
			c.setEndereco("Avenida das Acacias, 25");
			c.setCidade("Rio de Janeiro");
			ClienteDAO.cadastrarCliente(c);
		}
		
		/* Cadastrar funcionarios */
		{
			Funcionario f = new Funcionario();
			f.setNome("Art Vandelay");
			f.setCpf("83546586271");
			f.setTelefone("21988888801");
			f.setEndereco("1st Ave, 31");
			f.setCidade("Rio de Janeiro");
			f.setAtivo(true);
			FuncionarioDAO.cadastrarFuncionario(f);
		}
		
		{
			Funcionario f = new Funcionario();
			f.setNome("Martin Van Nostrand");
			f.setCpf("99716786328");
			f.setTelefone("41988888802");
			f.setEndereco("2nd St, 42");
			f.setCidade("Curitiba");
			f.setAtivo(false);
			FuncionarioDAO.cadastrarFuncionario(f);
		}
		
		{
			Funcionario f = new Funcionario();
			f.setNome("H.E. Pennypacker");
			f.setCpf("73962880100");
			f.setTelefone("41988888803");
			f.setEndereco("10th Ave, 53");
			f.setCidade("Curitiba");
			f.setAtivo(true);
			FuncionarioDAO.cadastrarFuncionario(f);
		}
		
		/* Cadastrar livros */
		{
			Livro l = new Livro();
			l.setIdLivro(1);
			l.setIsbn("9780547928210");
			l.setTitulo("The Lord of the Rings: The Fellowship of the Ring");
			l.setAutor("J.R.R. Tolkien");
			l.setAno(1954);
			l.setGenero("Fantasia");
			l.setEmprestado(true);
			LivroDAO.cadastrarLivro(l);
		}
		
		{
			Livro l = new Livro();
			l.setIdLivro(2);
			l.setIsbn("9780547928203");
			l.setTitulo("The Lord of the Rings: The Two Towers");
			l.setAutor("J.R.R. Tolkien");
			l.setAno(1954);
			l.setGenero("Fantasia");
			l.setEmprestado(false);
			LivroDAO.cadastrarLivro(l);
		}
		
		{
			Livro l = new Livro();
			l.setIdLivro(3);
			l.setIsbn("9780547928197");
			l.setTitulo("The Lord of the Rings: The Return of the King");
			l.setAutor("J.R.R. Tolkien");
			l.setAno(1955);
			l.setGenero("Fantasia");
			l.setEmprestado(false);
			LivroDAO.cadastrarLivro(l);
		}
		
		{
			Livro l = new Livro();
			l.setIdLivro(4);
			l.setIsbn("9780345539434");
			l.setTitulo("Cosmos");
			l.setAutor("Carl Sagan");
			l.setAno(1980);
			l.setGenero("Ciencia");
			l.setEmprestado(true);
			LivroDAO.cadastrarLivro(l);
		}
	}
}
