package poo.introducao;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int ano;
	int quantidadedePortas;
	String motor;
	double valor;
	double velocidade;

	public Carro() {

	}

	public Carro(String marca, String modelo, String cor, int ano, int quantidadedePortas, String motor, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.quantidadedePortas = quantidadedePortas;
		this.motor = motor;
		this.valor = valor;
		this.velocidade =0;
	}

	public void acelerar() {
		this.velocidade = 10;
	}

	public void nitro(double velocidade) {
		this.velocidade += velocidade;

	}

	public void freia() {
		this.velocidade--;

		if (this.velocidade < 0) {
			this.velocidade = 0;
		}
	}

	public void para() {
		this.velocidade = 0;
	}

	public void buzina() {
		System.out.println("biiiii");
	}

	public double velocimetro() {
		return this.velocidade;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + "]";
	}
}
