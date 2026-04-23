package oo;

public class Carro {
	//Quando não tem método Main é porque não sera uma classe executavel.
	
	//Atributos
	private String modelo;
	private String cor;
	private String proprietario;
	
	//Métodos Acessadores
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public void ligar() {
		System.out.println("Carro ligado...");
	}
	public void desligar() {
		System.out.println("Carro desligado...");
	}
	
	
}
