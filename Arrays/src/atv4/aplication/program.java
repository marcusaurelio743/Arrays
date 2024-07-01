package atv4.aplication;

import java.util.Locale;
import java.util.Scanner;

import atv4.entities.Rent;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("informe a quantidade de quartos?");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<= n; i++) {
			System.out.println("Rent #"+i+" :");
			System.out.println("name:");
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			Rent rent = new Rent(name, email);
			sc.nextLine();
			vect[room] = rent;
			
		}
		System.out.println();
		System.out.println("busy rooms:");
		for(int i=0; i<10; i++) {
			if(vect[i]!= null) {
				System.out.println(i+": "+vect[i]);
			}
		}
		
		sc.close();

	}

}
