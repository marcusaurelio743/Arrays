package lista.entities;

public class Funcionario {
	private Long id;
	private String nome;
	private Double salario;
	
	
	public Funcionario(Long id, String nome, Double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public Funcionario() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}
	
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
	
	
	

}
