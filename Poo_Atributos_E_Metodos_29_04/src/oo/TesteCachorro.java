package oo;

public class TesteCachorro {

	public static void main(String[] args) {
		
		//Criação do objeto (Instanciação)
		//Aqui o construtor é chamado. "chanel" é o nome da variável que guarda o objeto
		Cachorro chanel = new Cachorro("Chanel", "Branco", "Spitz");
		
		//Chamada de Métodos
		//O objeto 'chanel' executa as ações definidas na classe
		chanel.comer("frango desfiado com aguá de coco");
		chanel.correr();
		chanel.descansar();
		chanel.dormir();

		//Impressão do Objeto
		// Ao colocar 'chanel' dentro do println, o Java chama automaticamene o toString()
		// que você criou, mostrando os detalhes da Chanel no console.
		System.out.println(chanel);
	}

}
