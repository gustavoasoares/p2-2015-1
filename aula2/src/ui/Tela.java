package ui;
import java.util.Scanner;


public class Tela {

	public static int lerIdade(Scanner sc) {
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		return idade;
	}
	
	public static String lerNome(Scanner sc) {
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		return nome;
	}
	public static void imprimePessoaMaisVelha(String nome, int idade) { 
		System.out.println("A pessoa mais velha �: " + nome + " com "
				+ idade + " anos.");
	}
}
