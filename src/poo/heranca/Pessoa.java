package poo.heranca;

import java.time.LocalDate;

public abstract class Pessoa {
	private String nome;
	private LocalDate dataDeNascimento;
	private String endereco;

	public Pessoa(String nome, LocalDate dataDeNascimento, String endereco) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	public abstract String toString(); 
	
	

}
