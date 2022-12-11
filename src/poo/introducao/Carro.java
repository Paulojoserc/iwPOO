package poo.introducao;

public class Carro {
private	String marca;
private	String modelo;
private	String cor;
private	int ano;
private	int quantidadedePortas;
private	String motor;
private	double valor;
private	double velocidade;
private boolean novo;


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
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getQuantidadedePortas() {
		return quantidadedePortas;
	}

	public void setQuantidadedePortas(int quantidadedePortas) {
		this.quantidadedePortas = quantidadedePortas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
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
