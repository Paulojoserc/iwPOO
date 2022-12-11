package poo.atributosestaticos.tarefa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestLoja {
	public static void main(String[] args) {
		Funcionario f01 = new Funcionario("George");

		Funcionario f02 = new Funcionario("João");

		Produto p01 = new Produto("Sapato", 150.0);

		Produto p02 = new Produto("Camisa", 40.0);

		Produto p03 = new Produto("Boné", 250.0);
		Produto p04 = new Produto("Short", 60.0);
		Loja l01 = new Loja(List.of(f01), List.of(p01, p02));
		Loja l02 = new Loja(List.of(f02), List.of(p03, p04));
		Map<Produto, Integer> lista = new HashMap<>();

		lista.put(p01, 3);
		lista.put(p02, 2);

		l01.realizarVenda(f01, lista);
		l01.resumoVenda(f01, lista);

		lista.clear();
		lista.put(p03, 2);
		lista.put(p04, 4);
		l02.realizarVenda(f02, lista);
		l02.resumoVenda(f02, lista);
		System.out.println(Loja.verLucroTotal());
	}
}
