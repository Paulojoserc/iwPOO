package poo.heranca;

import java.time.LocalDate;
import java.time.Month;

import poo.heranca.enuns.Curso;
import poo.heranca.enuns.Setor;

public class Teste {
	public static void main(String[] args) {
		
		
		
		Aluno a01 = new Aluno(12354L, "Roberto", LocalDate.of(1995, Month.JUNE, 5), "Meireles", Curso.JAVA);
		
		a01.setCurso(Curso.JAVA_SCRIP);
		
		a01.atribuirNota(1, 3);
		a01.atribuirNota(2, 5);
		a01.atribuirNota(3, 9);
		
		double media = a01.calcularmedia();
		
		System.out.println(a01.verificarAprovacao(media));
		
		System.out.println();
		System.out.println();
		
		
		Funcionario f01 = new Funcionario(6547L, "Neymar", LocalDate.of(1995, 12, 10), "Passaré", Setor.ADMINISTRACAO, "Dev", 5000.0);
		
		System.out.println(f01);
		System.out.println("-----------------------------------------");
		System.out.println(a01);
	}
}
