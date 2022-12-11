package poo.heranca;

import java.time.LocalDate;

import poo.heranca.enuns.Setor;
import poo.heranca.inteface.BonusEmFolha;
import poo.heranca.inteface.DescontoEmFolha;

public class Funcionario extends Pessoa implements DescontoEmFolha, BonusEmFolha{
private long matricula;
private Setor setor;
private String Funcao;
private double salario;

public Funcionario(long matricula, String nome, LocalDate dataDeNascimento, String endereco, Setor setor,
		String funcao, double salario) {
	super(nome, dataDeNascimento, endereco);
	this.matricula = matricula;
	this.setor = setor;
	Funcao = funcao;
	this.salario = salario;
}

public long getMatricula() {
	return matricula;
}

public void setMatricula(long matricula) {
	this.matricula = matricula;
}

public Setor getSetor() {
	return setor;
}

public void setSetor(Setor setor) {
	this.setor = setor;
}

public String getFuncao() {
	return Funcao;
}

public void setFuncao(String funcao) {
	Funcao = funcao;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

@Override
public String toString() {
	return "Funcionario: \nMatricula: " + matricula +"\nNome: "+ getNome()+"\nData de nascimento:"+getDataDeNascimento()+"\nEnd: "+getEndereco()+ "\nSetor: " + setor.getNome() + "\nFuncao: " + Funcao + "\nSalario: " + salario
			;
}

@Override
public double comissao(double salario) {
	boolean condicao = true;
	return condicao ? salario * 0.15 : 0;
}

@Override
public double periculosidade(double salario) {
	
	return salario * 0.30;
}

@Override
public double fgts(double salario) {
	
	return salario *0.08;
}

@Override
public double valeAlimentacao(double salario) {
	
	return salario * 0.1;
}

@Override
public double valeTransporte(double salario) {
	
	return salario * 0.1;
}


}
