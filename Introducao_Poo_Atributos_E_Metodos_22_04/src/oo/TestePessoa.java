package oo;

public class TestePessoa {

	public static void main(String[] args) { // Quando tem Método Main, é porque sera uma classe executavel.
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Rafael Ronaldo Ferreira Martins");
		pessoa1.setCpf("0913544548");
		pessoa1.setGenero("Masculino");
		pessoa1.setIdade(19);
		pessoa1.andar();
		pessoa1.falar("Java");
		pessoa1.comer();
		pessoa1.beber();
		pessoa1.dormir();
	}
}
