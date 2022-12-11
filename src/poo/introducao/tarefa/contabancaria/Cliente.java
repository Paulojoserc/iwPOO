package poo.introducao.tarefa.contabancaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
	private long codigo;
	private String nome;
	private LocalDate dataDeNascimento;
	private double saldo;
	private Endereco endereco;

	{
		this.codigo = (long) (Math.random() * 1000) + 10;
	}

	public Cliente(String nome, String dataDeNascimento, double saldo, Endereco endereco) {

		this.nome = nome;
		this.dataDeNascimento = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		if (saldo < 0)
			this.saldo = 0;
		else
			this.saldo = saldo;
		this.endereco = endereco;
	}

	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getSaldo() {
		return saldo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void verSaldo() {
		System.out.println("======================");
		System.out.println("Conta: " + this.codigo);
		System.out.println("Cliente: " + this.nome + " nascimento: " + this.dataDeNascimento);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println("======================");
	}

	public void saque(double valor) {
		// tranformar em uma exceção.
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Operação realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void deposito(double valor) {
		this.saldo = valor;
	}

	public void transferir(Cliente cliente, double valor) {

		boolean condicao = valor < this.saldo && this.saldo > 0 && cliente != null;
		if (condicao) {
			this.saldo -= valor;
			cliente.saldo += valor;
		} else {
			System.out.println("Erro");
		}
	}


	@Override
	public String toString() {
		return "Cliente codigo: " + codigo + "\n Nome: " + nome + "\n Data de nascimento: " + dataDeNascimento + "\n saldo"
				+ saldo + "\n" + endereco ;
	}
	

}