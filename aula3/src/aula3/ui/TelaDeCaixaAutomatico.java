package aula3.ui;

import java.util.Scanner;

import aula3.core.oo.Conta;

public class TelaDeCaixaAutomatico {

	private Scanner sc;
	
	public TelaDeCaixaAutomatico() {
		this.sc = new Scanner(System.in);
	}
	
	public String exibeMenuEscolhaDeConta() {
		System.out.println("Digite o numero da conta");
		String contaEscolhida = sc.next();
		return contaEscolhida;
	}

	public void exibeMenuDeOperacoes(Conta conta)  {
		System.out.println("Digite 1 para depositar ou 2 para sacar");
		int opcao = sc.nextInt();
		System.out.println("Digite o valor");
		double valor = sc.nextDouble();
		if (opcao == 1) {
			try {
				conta.depositar(valor);
				System.out.println("Saldo atual: " + conta.getSaldo());
			} catch (Exception e) {
				System.out.println("Não foi possível depositar o valor. " + e.getMessage());
			}
			
		} else if (opcao == 2) {
			try {
				conta.sacar(valor);
				System.out.println("Saldo atual: " + conta.getSaldo());
			} catch (Exception e) {
				System.out.println("Não foi possível sacar o valor. " + e.getMessage());
			}
			
		} else {
			System.out.println("Opção incorreta.");
		}
	}
	
	public void exibeMensagemDeErro() {
		System.out.println("Conta não encontrada");
	}
}
