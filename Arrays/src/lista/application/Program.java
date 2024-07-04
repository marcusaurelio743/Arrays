package lista.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import lista.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero de funcionarios:");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		 
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("funcionario "+(i+1));
			System.out.println("nome:");
			String nome = sc.nextLine();
			System.out.println("id");
			Long id = sc.nextLong();
			System.out.println("Salario:");
			Double salario = sc.nextDouble();
			Funcionario  funcinario = new Funcionario(id, nome, salario);
			list.add(funcinario);
		}
		System.out.println("-------------------------------------------");
		System.out.println("Informe o Id do funcionario para incrementar o Salario: ");
		Long idFuncionario = sc.nextLong();
		
		Funcionario func =  list.stream().filter(f -> f.getId() == idFuncionario).findFirst().orElse(null);
		
		if(func == null) {
			System.out.println("Funcionario Não existe");
		}else {
			System.out.println("informe o valor percentual:");
			Double persentual = sc.nextDouble();
			
			func.increaseSalary(persentual);
		}
			
		
		
		System.out.println("---------------------------------------");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}

}
