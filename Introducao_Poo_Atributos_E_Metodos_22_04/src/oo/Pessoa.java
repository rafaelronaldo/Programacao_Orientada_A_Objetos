package oo;

public class Pessoa {
	//Quando não tem método Main é porque não sera uma classe executavel.
	
	//Atributos
	private String nome;
	private String cpf;
	private String genero;
	private int idade;
	
	
	//Métodos Acessadores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void andar() {
		System.out.println("Andando....");
	}
	public void falar(String assunto) {
		System.out.println("Falando sobre "+assunto);
	}
	public void comer() {
		System.out.println("Comendo....");
	}
	public void beber() {
		System.out.println("Bebendo....");
	}
	public void dormir() {
		System.out.println("Dormindo....");
	}
}


