package oo;

public class TesteCarro {

	public static void main(String[] args) { // Quando tem Método Main, é porque sera uma classe executavel.
		
		Carro gol = new Carro();
		gol.setCor("Branco");
		gol.setModelo("Gol III");
		gol.setProprietario("João da Silva");
		gol.ligar();
		gol.desligar();
	}
}
