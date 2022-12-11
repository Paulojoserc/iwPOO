package poo.heranca;

import java.time.LocalDate;

import poo.heranca.enuns.Curso;
import poo.heranca.inteface.GerenciadorDeNotas;

public class Aluno extends Pessoa implements GerenciadorDeNotas {

	private long matricula;
	private Curso curso;
	private double notas[] = new double[3];
	
	public Aluno(long matriccula, String nome, LocalDate dataDeNascimento, String endereco, Curso curso) {
		super(nome, dataDeNascimento, endereco);
		this.matricula =matriccula;
		this.curso = curso;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno: Matricula: " + matricula +"\n Nome: "+ getNome()+"\n Data de nascimento:"+getDataDeNascimento()+"\n End: "+getEndereco()+ "\n Curso:" + curso.getNome() ;
	}

	@Override
	public void atribuirNota(int indice, double nota) {
		this.notas[indice -1] = nota;
		
	}

	@Override
	public double calcularmedia() {
		double media =0;
		for (double nota : notas) {
			media+=nota;
		}
		return media/notas.length;
	}

	@Override
	public String verificarAprovacao(double media) {
		 
		return media >=7 ? "aprovado" : "reprovado";
	}

	

	

}
