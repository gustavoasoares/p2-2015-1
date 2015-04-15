package aula3.core.procedural;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String agencia1 = "1234-5";
		String cc1 = "123142-1";
		double saldo1 = 0;
		String nome1 = "Joao";
		String CPF1 = "4325543532";
		
		String agencia2 = "1987-5";
		String cc2 = "198742-7";
		double saldo2 = 200.50;
		String nome2 = "Maria";
		String CPF2 = "423587436";
		
		System.out.println("Digite o numero da conta");
		String contaEscolhida = sc.next();
		if (contaEscolhida.equals(cc1)) {
			System.out.println("Digite 1 para depositar ou 2 para sacar");
			int opcao = sc.nextInt();
			System.out.println("Digite o valor");
			double valor = sc.nextDouble();
			if (opcao == 1) {
				saldo1 += valor;
				System.out.println("Saldo atual: " + saldo1);
			} else if (opcao == 2) {
				saldo1 -= valor;
				System.out.println("Saldo atual: " + saldo1);
			} else {
				System.out.println("Opção incorreta.");
			}
		} else if (contaEscolhida.equals(cc2)) {
			System.out.println("Digite 1 para depositar ou 2 para sacar");
			int opcao = sc.nextInt();
			System.out.println("Digite o valor");
			double valor = sc.nextDouble();
			if (opcao == 1) {
				saldo2 += valor;
				System.out.println("Saldo atual: " + saldo2);
			} else if (opcao == 2) {
				saldo2 -= valor;
				System.out.println("Saldo atual: " + saldo2);
			} else {
				System.out.println("Opção incorreta.");
			}
		} else {
			System.out.println("Conta não encontrada");
		}
		sc.close();
	}
}
