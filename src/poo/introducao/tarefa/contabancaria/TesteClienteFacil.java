package poo.introducao.tarefa.contabancaria;

import java.util.ArrayList;
import java.util.List;

public class TesteClienteFacil {
	public static void main(String[] args) {
		Endereco e01 = new Endereco("Bezerra de Meneses", "20", "São Gerardo", "60533280", "Ceará", "Brasil");

		Cliente c01 = new Cliente("Maria", "30/05/2014", 5000, e01);
		Cliente c02 = new Cliente("Lucas", "30/05/2014", 1200, e01);

		List<Cliente> clientes = new ArrayList<>();
		clientes.add(c01);
		clientes.add(c02);

		for (Cliente cliente : clientes) {
			System.out.println("======================");
			System.out.println("Conta: " + cliente.getCodigo());
			System.out.println("Cliente: " + cliente.getNome());
			System.out.println(
					"Logradouro: " + cliente.getEndereco().getLogradouro() + " nº" + cliente.getEndereco().getNumero());
			System.out.println("Bairro: " + cliente.getEndereco().getBairro());
			System.out.println("CEP: " + cliente.getEndereco().getCep());
			System.out.println("UF: " + cliente.getEndereco().getEstado());
			System.out.println("Bairro: " + cliente.getEndereco().getPais());
			System.out.println("Saldo: R$" + cliente.getSaldo());
			System.out.println("======================");
		}
	}
}
