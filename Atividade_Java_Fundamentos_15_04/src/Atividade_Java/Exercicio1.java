package Atividade_Java;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		String nome;
		int quantidadeHoras;
		double salario;	
		
		System.out.println("Sistema de Cálculo de Salário");
		System.out.println("Nome... ");
		nome = entrada.nextLine();
		
		System.out.println("Qte de horas trabalhadas...");
		quantidadeHoras = entrada.nextInt();
		
		//Calculo do salario
		salario = quantidadeHoras * 32.0;
		
		System.out.println("Salário do Empregado");
		System.out.println("Nome....." + nome);
		System.out.println("Salário....." + salario);

	}

}
