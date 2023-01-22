package poo.atributosestaticos;

import java.util.ArrayList;
import java.util.List;

import poo.introducao.tarefa.contabancaria.Cliente;
import poo.introducao.tarefa.contabancaria.Endereco;

public class TesteBanco {

	public static void main(String[] args) {

		Endereco e01 = new Endereco("Bezerra de Menezes", "20", "São Gerardo", "60320000", "CE", "Brasil");

		Endereco e02 = new Endereco("Av Sargento Hermínio", "144", "Presidente Kennedy", "60320166", "CE", "Brasil");

		Endereco e03 = new Endereco("Treze de Maio", "20", "Fátima", "6032xxxx", "CE", "Brasil");

		Cliente c01 = new Cliente("Ana", "11/12/1998", 3100, e01);

		Cliente c02 = new Cliente("José", "30/05/2001", 1200, e02);

		Cliente c03 = new Cliente("José", "30/05/2001", 4200, e02);

		Banco b01 = new Banco(12345L, e03, List.of(c01, c02));
		Banco b02 = new Banco(23456L, e03, List.of(c03));
		for (Cliente cliente : b01.getClientes()) {
			System.out.println(cliente.toString());
			System.out.println();
		}
		for (Cliente cliente : b02.getClientes()) {
			System.out.println(cliente.toString());
			System.out.println();

		}
		System.out.println(Banco.verCofre());

	}
}