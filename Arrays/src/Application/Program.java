package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];//criando um vetor com java
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.00;
		for(int i = 0; i<n; i++) {
			sum += vect[i];
		}
		
		double media = sum / n;
		
		System.out.printf("Media das alturas: %.2f\n",media);
		
		
		
		
		sc.close();

	}

}
