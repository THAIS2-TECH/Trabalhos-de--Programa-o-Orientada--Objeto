package aulas;
import java.util.Scanner;
public class SalarioComComissao {
	public static void main (String [] args){
		
		String nome;
		double salario, vendas, comissao, valor_a_receber;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Algoritmo de Comissões");
		
		//System.out.println("Digite seu nome: ");
		nome = ler.next();
		
		//System.out.println("Digite seu salário: ");
		salario = ler.nextDouble();
		
		//System.out.println("Digite o valor das vendas efetuadas no mês: ");
		vendas = ler.nextDouble();
		
		comissao = vendas * 0.15;
		valor_a_receber = salario + comissao;
	
		System.out.printf("R$ %.2f", valor_a_receber);
		
	}

}
