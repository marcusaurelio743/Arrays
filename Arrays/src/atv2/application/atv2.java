package atv2.application;

import java.util.Locale;
import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos números vai digitar?");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}
		System.out.print(" valores informados ");
		double soma = 0.00;
		for(int i=0; i< vet.length; i++) {
			System.out.printf(" %.2f ",vet[i]);
			soma+= vet[i];
		}
		System.out.printf("\nSoma dos valores: %.2f\n",soma);
		System.out.printf("media dos valores: %.2f",soma/vet.length);
		sc.close();

	}

}
