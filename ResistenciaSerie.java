package calculos;
import java.util.Scanner;
public class ResistenciaSerie {
	public static void main (String [] args) {
		double r1;
		double r2;
		double r3;
		double r4;
	
		Scanner ler = new Scanner (System.in);
		System.out.println("Escreva o valor");
		r1 = ler.nextDouble();
		r2 = ler.nextDouble();
		r3 = ler.nextDouble();
		r4 = ler.nextDouble();
		
		double resistencia_total = r1 + r2 + r3 + r4;
		
		System.out.printf("A resistência total é igual a %f.", resistencia_total);
	
		
		
		
	}

}
