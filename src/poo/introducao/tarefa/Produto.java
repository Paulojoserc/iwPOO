package poo.introducao.tarefa;

public class Produto {
	String nome;
	Double preco;
	Integer quantidade;
	Long codigo;
	String tipo;

	{
		this.codigo = (long) (Math.random()*1000)+10;
	}
	
	
	public Produto() {
	}

	public Produto(String nome, Double preco, Integer quantidade, Long codigo, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public double retornaPreco() {
		return preco;
	}

	public void acrecimo(double percentual) {
		double porcentagemAcrecimo = (this.preco * percentual / 100.0);
		this.preco += porcentagemAcrecimo;
	}

	public void desconto(double percentual) {
		double porcentagemDesconto = (this.preco * percentual / 100.0);
		this.preco -= porcentagemDesconto;
	}

	public int estoque() {
		return this.quantidade;
	}

	public double comprar(int quantidade) {
		this.quantidade -= quantidade;
		double precoTotal = this.preco * quantidade;
		return precoTotal;
	}

	public String toString() {
		return "Produto: " + codigo + " nome: " + nome + " tipo: " + tipo;
	}

}
