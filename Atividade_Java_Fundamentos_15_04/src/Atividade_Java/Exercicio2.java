package Atividade_Java;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome, endereco, sexo, cidade, estado;
        double salarioBruto, salarioLiquido;
        
        System.out.println("Digite o nome: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite o endereço: ");
        endereco = leitor.nextLine();
        
        System.out.println("Digite o sexo: ");
        sexo = leitor.nextLine();
        
        System.out.println("Digite a cidade: ");
        cidade = leitor.nextLine();
        
        System.out.println("Digite o estado: ");
        estado = leitor.nextLine();
        
        System.out.println("Digite o salário bruto: ");
        salarioBruto = leitor.nextDouble();
        
        // Descontos (17%)
        double descontoVT = salarioBruto * 0.02;
        double descontoVA = salarioBruto * 0.05;
        double descontoSaude = salarioBruto * 0.10;
        
        salarioLiquido = salarioBruto - (descontoVT + descontoVA + descontoSaude);
        
        System.out.println("\n--- Ficha do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Localização: " + cidade + "/" + estado);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        leitor.close(); // Boa prática fechar o scanner
    } 
}