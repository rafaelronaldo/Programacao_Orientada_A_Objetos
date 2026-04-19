package Atividade_Java;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a nota final do aluno: ");
		double notaFinal = leitor.nextDouble();
		
		System.out.println("Digite a carga horária total: ");
		int cargaHoraria = leitor.nextInt();
		
		System.out.println("Digite a quantidade de faltas: ");
		int faltas = leitor.nextInt();
		
		double limiteFaltas = cargaHoraria * 0.15;
		
		System.out.println("\n--- Resultado ---");
		
		if (notaFinal >= 7.00 && faltas <= limiteFaltas) {
			System.out.println("Situação: APROVADO!");
		}
		else {
			System.out.println("Situação: REPROVADO!");
		}
		
		

	}

}
