package atv3.application;


import java.util.Locale;
import java.util.Scanner;

import atv.entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			System.out.println("informe o numero de pessoas que vai digitar?");
			int n = sc.nextInt();
			Pessoa[] vet = new Pessoa[n];
			sc.nextLine();
			
			for(int i=0; i <vet.length; i++) {
				System.out.println("Informe a "+(i+1)+" pessoa");
				System.out.println("Nome:");
				String nome = sc.nextLine();
				System.out.println("Idade:");
				int idade = sc.nextInt();
				System.out.println("altura:");
				double altura = sc.nextDouble();
				vet[i] = new Pessoa(nome, idade, altura);
				sc.nextLine();
			}
			
			double soma = 0.00;
			int cont = 0;
			System.out.print("Pessoas com menos de 16 anos: ");
			
			for(int i=0; i <vet.length; i++) {
				soma+=vet[i].getAltura();
				cont++;
				if(vet[i].getIdade()<16) {
					System.out.print(" "+vet[i].getNome());
				}
			}
			System.out.println();
			
			double media = soma / vet.length;
			System.out.printf("\nmedia das alturas: %.2f\n",media);
			
		
		
		sc.close();

	}

}
