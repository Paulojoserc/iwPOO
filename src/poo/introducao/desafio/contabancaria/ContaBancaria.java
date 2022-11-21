package poo.introducao.desafio.contabancaria;

import java.util.Date;

public class ContaBancaria {
	Long codigo;
	String nomeCliente;
	Date dataDeNascimento;
	double saldo;

	{
		this.codigo = (long) (Math.random() * 1000) + 10;
	}

	public ContaBancaria() {
	}

	public ContaBancaria(Long codigo, String nomeCliente, Date dataDeNascimento, double saldo) {
		super();
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.dataDeNascimento = dataDeNascimento;
		this.saldo = saldo;
	}

	public void transferencia(ContaBancaria destino, double valor) {
		System.out.println();
		System.out.println(" Realizando saque ");
		System.out.println("Seu saldo anteior �: "+this.saldo);
		System.out.println("Saldo anteior Destino �: "+destino.saldo);
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println(" Saldo Posterior: "+this.saldo);
			System.out.println(" Saldo Posterior: "+destino.saldo);
		}else {
			System.out.println(" Desculpe saldo insuficiente");
		}
		System.out.println(" Fim da Transfer�ncia");
		System.out.println();
		
	}
	
	public void depositar(double valor) {
		System.out.println();
		System.out.println(" Realizando dep�sito ");
		System.out.println("Seu saldo anteior �: "+this.saldo);
		this.saldo += valor;
		System.out.println("Saldo posterior: "+this.saldo);
		System.out.println("Fim  dep�sito");
		System.out.println();
	}

	public void sacar(double valor) {
		System.out.println();
		System.out.println(" Realizando saque ");
		System.out.println("Seu saldo anteior �: "+this.saldo);
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			System.out.println(" Saldo Posterior: "+this.saldo);
		}else {
			System.out.println(" Desculpe saldo insuficiente");
		}
		System.out.println(" Fim da opera��o Saque");
		System.out.println();
	}
	
	public void verSaldo() {
		System.out.println();
		System.out.println("          Dados Banc�rios");
		System.out.println("N�mero da conta: "+ this.codigo);
		System.out.println("Titular: "+this.nomeCliente);
		System.out.println(" Saldo: "+this.saldo);
		System.out.println("      Fim da consulta");
	}
	
	@Override
	public String toString() {

		String s = "ContaBancaria [ ";
		s += "Nome do Cliente: " + nomeCliente;
		s += "; Numero da conta: " + codigo;
		s += "; Saldo: " + this.saldo;
		s += " ]";
		return s;
	}

}
