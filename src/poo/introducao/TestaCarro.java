package poo.introducao;

public class TestaCarro {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro generico = new Carro();
		c1.setMarca("bmw");
		c1.setModelo("z4");
		c1.setCor("preta");
		c1.setAno(2022);
		c1.setMotor("B58");
		c1.setQuantidadedePortas(2);
		c1.setValor(750_000);
		

		
		c1.acelerar();
		
		c1.nitro(80);
		double velocidadeDOCarro = c1.velocimetro();
		
		System.out.println(c1.velocimetro());
		
		System.out.println(c1);
		/*System.out.println(c1.velocidade);
		c1.velocimetro();
		c1.freia();
		System.out.println(c1.velocidade);
		c1.para();
		System.out.println(c1.velocidade);
		c1.buzina();
		
		System.out.println("velocidade do genérico: " +generico.velocidade);
		*/
		
	}
}
