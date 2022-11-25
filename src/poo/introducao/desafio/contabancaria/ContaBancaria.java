package poo.introducao.desafio.contabancaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaBancaria {
	Long codigo;
	String nomeCliente;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date dataDeNascimento;
	double saldo;

	{
		this.codigo = (long) (Math.random() * 1000) + 10;
	}

	public ContaBancaria() {
	}
	public ContaBancaria(String nomeCliente, Date dataDeNascimento, double saldo) {
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.dataDeNascimento = dataDeNascimento;
		this.saldo = saldo;
	}


	public ContaBancaria(Long codigo, String nomeCliente, Date dataDeNascimento, double saldo) {
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.dataDeNascimento = dataDeNascimento;
		this.saldo = saldo;
	}

	public void transferencia(ContaBancaria destino, double valor) {
		System.out.println();
		System.out.println(" Realizando Transferencia ");
		System.out.println("Seu saldo anteior conta de origem: "+this.saldo);
		System.out.println("Saldo anteior da conta destino é: "+destino.saldo);
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println(" Saldo Posterior  conta de origem: "+this.saldo);
			System.out.println(" Saldo Posterior da conta destino é: "+destino.saldo);
		}else {
			System.out.println(" Desculpe saldo insuficiente");
		}
		System.out.println(" Fim da Transferência");
		System.out.println();
		
	}
	
	public void depositar(double valor) {
		System.out.println();
		System.out.println(" Realizando depósito ");
		System.out.println("Seu saldo anteior é: "+this.saldo);
		this.saldo += valor;
		System.out.println("Saldo posterior: "+this.saldo);
		System.out.println("Fim  depósito");
		System.out.println();
	}

	public void sacar(double valor) {
		System.out.println();
		System.out.println(" Realizando saque ");
		System.out.println("Seu saldo anteior é: "+this.saldo);
		if ((this.saldo - valor) >= 0) {
			this.saldo -= valor;
			System.out.println(" Saldo Posterior: "+this.saldo);
		}else {
			System.out.println(" Desculpe saldo insuficiente");
		}
		System.out.println(" Fim da operação Saque");
		System.out.println();
	}
	
	public void saldoBancario() throws ParseException {
		System.out.println();
		System.out.println("          Dados Bancários");
		System.out.println("Número da conta: "+ this.codigo);
		System.out.println("Titular: "+this.nomeCliente);
		System.out.println("Data de nascimento: "+sdf.format(dataDeNascimento));
		System.out.println(" Saldo: "+this.saldo);
		System.out.println("      Fim da consulta");
	}
	@Override
	public String toString() {
		String s= "Dados Bancaria : ";
	s+=	" Número da conta:" + codigo;
	s+= " Titular: " + nomeCliente; 
	s+=" Data de nascimento: " + sdf.format(dataDeNascimento); 
	s+=" Saldo: R$" +String.format("%.2f%n", saldo) ;
		 return s;
	}
	
	

}
