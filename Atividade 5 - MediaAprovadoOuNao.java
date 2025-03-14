package aulas;
import java.util.Scanner;
public class MediaAprovadoOuNao {
	public static void main (String [] args) {
		double n1;
		double n2;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Algoritmo para calcular a média entre dois números!");
		System.out.println("Digite a 1° nota: ");
		n1 = ler.nextDouble();
		System.out.println("Digite a 2° nota: ");
		n2 = ler.nextDouble();
		
		double media = (n1 + n2)/2;
		
		System.out.printf("O valor da nota é %.0f", media);
		System.out.println("  Voce esta: ");
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		
		
		
		
		
		
		}


}
