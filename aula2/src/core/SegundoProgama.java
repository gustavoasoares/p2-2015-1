package core;
import java.util.Scanner;
import ui.*;

public class SegundoProgama {

	public static void main(String[] args) {

		final int NUMERO_DE_PESSOAS = 5;
		Scanner sc = new Scanner(System.in);

		String pessoaMaisVelha = "";
		int idadePessoaMaisVelha = Integer.MIN_VALUE;

		for (int i = 0; i < NUMERO_DE_PESSOAS; i++) {
			String nome = Tela.lerNome(sc);
			int idade = Tela.lerIdade(sc);

			if (idade > idadePessoaMaisVelha) {
				idadePessoaMaisVelha = idade;
				pessoaMaisVelha = nome;
			}
		}
		Tela.imprimePessoaMaisVelha(pessoaMaisVelha, idadePessoaMaisVelha);
		sc.close();
	}
	
	
	
	

}
