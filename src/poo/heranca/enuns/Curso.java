package poo.heranca.enuns;

public enum Curso {
	JAVA("Java"), PHP("Php"), JAVA_SCRIP("Js"), PYTON("Pyton");

	private String descricao;

	Curso(String nome) {
		this.descricao = nome;
	}

	public String getNome() {
		return descricao;
	}

}
