package aulas;
import java.util.Scanner;
public class ResistenciaSerieParalela {
	public static void main (String [] args) {

		double r1, r2, r3;
		String sair;
		Scanner ler = new Scanner(System.in);
		
		while(true) {
			System.out.println("Algoritmo para Calcular a Resistência! ");
			System.out.println("Digite o valor da 1° resistência: ");
			r1 = ler.nextDouble();
			
			System.out.println("Digite o valor da 2° resistência: ");
			r2 = ler.nextDouble();
			
			System.out.println("Digite o valor da 3° resistência: ");
			r3 = ler.nextDouble();
			
			System.out.println("Digite 1 para resistência em serie");
			System.out.println("Digite 2 para resistência paralela");
			String opcao = ler.next();
			double resistencia;
			
			switch (opcao) {
			case "1": {
				resistencia = r1 + r2 + r3;
				break;
			}
			case "2": {
				resistencia = (1/r1) + (1/r2) + (1/r3);
				break;
			}
			default: {
				System.out.println("Opção Inválida");
				resistencia = 0;
			}
			}
		
			System.out.println("Resistencia Total é igua a " + resistencia);
			
			System.out.println("Deseja continua?? S = Sim N = Não");
			sair = ler.next();
			
			if (sair.equals("N")) {
				break;
			}
		}
		
	}

}
