package media;

import java.util.Scanner;

public class Real {

	public static void main(String[] args) {//inicio
		double n1;
		double n2;
		
		System.out.printf("Algoritmo para calcular entre dois n�meros:");
		System.out.printf("digite o primeiro n�mero:");
		Scanner ler = new Scanner(System.in);
		n1 = ler.nextDouble();
		System.out.printf("digite o segundo n�mero:");
		n2 = ler.nextDouble();
		double media = (n1+n2)/2;
		System.out.printf(" o valor da m�dia �:%f",media);
		
		
	}
}

