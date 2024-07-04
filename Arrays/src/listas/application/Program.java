package listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Ana");
		list.add("Boob");
		list.add(2,"Marcus");
		
		System.out.println("tamanho da lista: "+list.size());
		
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");
		System.out.println("Index of bob "+list.indexOf("Boob"));
		System.out.println("Index of marcus "+list.indexOf("marcus"));
		
		System.out.println("------------------------------------------------- ");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); 
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------- ");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("nome: "+name);
		
		sc.close();

	}

}
