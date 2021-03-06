import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String maisVelha = "";
		int idadeMaisVelha = Integer.MIN_VALUE;
		
		int[] idades = new int[5];
		for (int i = 0; i < 5; i++) {
			String nome = Tela.lerNome(scanner);
			int idade = Tela.lerIdade(scanner);
			idades[i] = idade;
			if (idade > idadeMaisVelha) {
				maisVelha = nome;
				idadeMaisVelha = idade;
			}						
		}
		
		for (int i = 0; i < 5 - 1; i++) {
			for (int j = 0; j < 5 - 1 ; j++) {
				if (idades[j] > idades[j+1]) {
					int tmp = idades[j+1];
					idades[j+1] = idades[j];
					idades[j] = tmp;
				}					
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(idades[i] + " ");
		}
		
		Tela.imprimeMaisVelho(maisVelha,idadeMaisVelha);		
	}
	
	
	
}
