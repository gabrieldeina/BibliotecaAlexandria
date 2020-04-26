package dao;

import models.Cliente;
import utils.Console;

public class Dados {

	public static void inicializar() {
		/* Cadastrar clientes */
		{
			Cliente c = new Cliente();
			c.setNome("Jerry Seinfeld");
			c.setCpf("21513124536");
			c.setTelefone("4199999901");
			c.setEndereco("Avenida das Acacias, 22");
			c.setCidade("Curitiba");
			ClienteDAO.cadastrarCliente(c);
		}
		
		{
			Cliente c = new Cliente();
			c.setNome("George Costanza");
			c.setCpf("05231357693");
			c.setTelefone("4199999902");
			c.setEndereco("Avenida das Acacias, 23");
			c.setCidade("Curitiba");
			ClienteDAO.cadastrarCliente(c);
		}

		{
			Cliente c = new Cliente();
			c.setNome("Elaine Benes");
			c.setCpf("29640837385");
			c.setTelefone("4199999903");
			c.setEndereco("Avenida das Acacias, 24");
			c.setCidade("Sao Paulo");
			ClienteDAO.cadastrarCliente(c);
		}

		{
			Cliente c = new Cliente();
			c.setNome("Cosmo Kramer");
			c.setCpf("84701617091");
			c.setTelefone("4199999904");
			c.setEndereco("Avenida das Acacias, 25");
			c.setCidade("Rio de Janeiro");
			ClienteDAO.cadastrarCliente(c);
		}
	}
	
}
