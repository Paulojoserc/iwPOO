package poo.atributosestaticos.tarefa;

import java.util.List;
import java.util.Map;

public class Loja {
	private List<Funcionario> funcionarios;
	private List<Produto> produtos;
	private Double lucroLoja;
	private static Double LucroTotal=0.0;
	private Double despesasLoja;
	private static Double despesaTotal=0.0;

	public Loja(List<Funcionario> funcionarios, List<Produto> produtos) {
		super();
		this.funcionarios = funcionarios;
		this.produtos = produtos;
		lucroLoja = 0.0;
		despesasLoja = 0.0;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Double getLucroLoja() {
		return lucroLoja;
	}

	public void setLucroLoja(Double lucroLoja) {
		this.lucroLoja = lucroLoja;
	}

	public Double getDespesasLoja() {
		return despesasLoja;
	}

	public void setDespesasLoja(Double despesasLoja) {
		this.despesasLoja = despesasLoja;
	}

	public static Double verDespesaTotal() {
		return despesaTotal;
	}

	public static Double verLucroTotal() {
		return LucroTotal;
	}

	public void realizarVenda(Funcionario funcionario, Map<Produto, Integer> lista) {
		for (Produto produto : lista.keySet()) {
			Double preco = produto.getPreco();
			Integer quantidade = lista.get(produto);
			Double total = quantidade * preco;
			this.lucroLoja += total;
			LucroTotal+= total;
			
		}
	}

public void resumoVenda(Funcionario funcionario,Map<Produto,Integer> lista) {
		
		double total = 0;
		

		System.out.println("vendedor: "+ funcionario.getNome());
		
		for(Produto produto : lista.keySet()) {
			double preco = produto.getPreco();
			int quantidade = lista.get(produto);	
			total += preco * quantidade;
			
			System.out.println("- "+ produto.getNome() +" "+ preco+ " x "+
			 quantidade+ " = " +(preco*quantidade));	
		}
		
		System.out.println("- total:\t\t" +total);
	}

}
