package oo;

public class Professor extends Pessoa{
	
	private String formacao;
	private String disciplina;
	private long registro;
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public long getRegistro() {
		return registro;
	}
	public void setRegistro(long registro) {
		this.registro = registro;
	}
	
	public void DarAula(String conteudo) {
		System.out.println("Dando aula de "+conteudo);
	}
	
}
