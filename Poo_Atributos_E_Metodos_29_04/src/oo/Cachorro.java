package oo;

public class Cachorro {
	
	//Atributos (As características/dados que o cachorro possui)
	// O 'private' serve para proteger os dados, ninguém de fora mexe direto aqui
	private String nome;
	private String cor;
	private String raca;
	
	//Método Construtor (A "Certidão de Nascimento")
	/* Sem o construtor, os atributos nome, cor e raca começariam vazios (null). 
	  Com o construtor, você obriga quem está usando a classe a definir esses valores logo de cara
	 */
	public Cachorro(String nome, String cor, String raca) {
		super();
		this.nome = nome; // 'this' diz que o dado vai para a variável lá de cima (Atributo)
		this.cor = cor;
		this.raca = raca;
	}

	
	//Métodos Getters E Setters 
	// Como os atributos são privados, usamos esses métodos para ler (get) ou alterar (set) os valores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;	
	}
	
	// Métodos de Ação (O que o objeto faz) 
	public void correr() {
		// Usa o atributo 'nome' para personalizar a mensagem
		System.out.println(nome + " correndo... ");
	}
	
	public void comer(String alimento) {
		//Recebe um dado de fora (alimento) e executa a ação
		System.out.println(nome + " comendo " + alimento);
	}
	public void descansar() {
		System.out.println(nome + " está descansando... ");
	}
	
	public void dormir() {
		System.out.println(nome + " está dormindo... ");
	}

	//Método toString ("O "Crachá" do objeto)
	//Serve para mostrar os dados do objeto em formato de texto legível
	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", cor=" + cor + ", raca=" + raca + "]";
	}
	
}