package poo.heranca.enuns;

public enum Setor {
	ADMINISTRACAO("Administração"), CORPO_DISCENTE("Corpo Discente"), CORPO_DOCENTE("Corpo Docente");

	private String nome;

	Setor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
