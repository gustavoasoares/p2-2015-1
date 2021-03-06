package core;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		final int NUMERO_DE_PESSOAS = 5;
		Scanner sc = new Scanner(System.in);

		String pessoaMaisVelha = "";
		int idadePessoaMaisVelha = Integer.MIN_VALUE;

		for (int i = 0; i < NUMERO_DE_PESSOAS; i++) {
			System.out.println("Digite seu nome: ");
			String nome = sc.next();

			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();

			if (idade > idadePessoaMaisVelha) {
				idadePessoaMaisVelha = idade;
				pessoaMaisVelha = nome;
			}
		}

		System.out.println("A pessoa mais velha �: " + pessoaMaisVelha + " com "
				+ idadePessoaMaisVelha + " anos.");

		sc.close();
	}

}
