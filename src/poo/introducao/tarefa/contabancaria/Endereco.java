package poo.introducao.tarefa.contabancaria;

public class Endereco {
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String estado;
	private String pais;

	public Endereco() {
	}

	public Endereco(String logradouro, String numero, String bairro, String cep, String estado, String pais) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.pais = pais;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco  logradouro: " + logradouro + " Numero: " + numero + "\n Bairro: " + bairro + "\n CEP: " + cep
				+ "\n Estado: " + estado + "\n Pais: " + pais;
	}
	
}
