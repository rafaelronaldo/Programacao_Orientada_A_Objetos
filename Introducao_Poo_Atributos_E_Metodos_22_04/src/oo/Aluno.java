package oo;

public class Aluno extends Pessoa{ // A classe aluno herdara os atributos da classe Pessoa
	
	private String matricula;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void estudar(String assunto) {
		System.out.println("Estudando "+assunto);
	}
	
	
	
	
	
	
	
	
}
