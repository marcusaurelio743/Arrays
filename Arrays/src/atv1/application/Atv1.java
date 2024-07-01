package atv1.application;

import java.util.Locale;
import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos números vai digitar?");
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos informados");
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
