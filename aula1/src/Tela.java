import java.util.Scanner;


public class Tela {
	
	public static String lerNome(Scanner scanner) {
		System.out.println("Digite o seu nome: ");
		String nome = scanner.next();
		return nome;
	}
	
	public static int lerIdade(Scanner scanner) {
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		return idade;
	}
	
	public static void imprimeMaisVelho(String nome, int idade) {
		System.out.println("A pessoa mais velha é: " + nome + " com " + idade + " anos");	
	}
	
}
