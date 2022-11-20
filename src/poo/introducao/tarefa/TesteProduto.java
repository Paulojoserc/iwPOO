package poo.introducao.tarefa;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();

		
		p1.nome = "Tomate";
		p1.preco = 5.50;
		p1.quantidade = 100;
		p1.tipo = "Legumos";

		p1.desconto(50);

		System.out.println(p1.retornaPreco());

		System.out.println(p1.comprar(10));

		System.out.println(p1.quantidade);
		
		System.out.println("Fim da compra avista");
		
		
		p2.nome = "Tomate";
		p2.preco = 5.50;
		p2.quantidade = 100;
		p2.tipo = "Legumos";
		
		p2.acrecimo(10);
		
		System.out.println(p1.codigo);
		System.out.println(p2.codigo);
		System.out.println(p2.retornaPreco());

		System.out.println(p2.comprar(10));

		System.out.println(p2.quantidade);
		
		System.out.println("Fim da compra a prazo");
	}
}
