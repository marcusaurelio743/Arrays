package teste;

public class Teste {

	public static void main(String[] args) {
		String[] vect = new String[] {"Ana","BOB","Maria"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------------------------------------");
		
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
