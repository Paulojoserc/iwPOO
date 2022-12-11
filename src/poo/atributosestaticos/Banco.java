package poo.atributosestaticos;

import java.util.List;

import poo.introducao.tarefa.contabancaria.Cliente;
import poo.introducao.tarefa.contabancaria.Endereco;

public class Banco {
private static double cofre;
	
	private Long agencia;
	private Endereco endereco;
	private List<Cliente> clientes;
	
	public Banco(Long agencia, Endereco endereco, List<Cliente> clientes) {
		this.agencia = agencia;
		this.endereco = endereco;
		this.clientes = clientes;
		
		for(Cliente cliente : clientes) {
			cofre += cliente.getSaldo();
		}
		
	}

	public Long getAgencia() {
		return agencia;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public static double verCofre() {
		return cofre;
	}

	@Override
	public String toString() {
		return "Banco \n agencia " + agencia + ",\n" + endereco + ",\n clientes=" + clientes ;
	}

}
