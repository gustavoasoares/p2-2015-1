package facebook.ui;

import java.util.Scanner;

import facebook.core.Facebook;

public class TelaDoFacebook {
	
	private static final int CADASTRAR = 1;
	private static final int SAIR = 3;
	private static final String QUEBRA_DE_LINHA = System.getProperty("line.separator");
	
	private Facebook face;
	
	public TelaDoFacebook() {
		face = new Facebook();
	}

	public static void main(String[] args) {
		TelaDoFacebook tela = new TelaDoFacebook();
		tela.exibeTelaInicial();
	}

	private void exibeTelaInicial() {
		Scanner sc = new Scanner(System.in);
		exibeMensagemDeBoasVindas();
		int opcao;
		do {
			exibeMenuDeOpcoesIniciais();
			opcao = sc.nextInt();	
			sc.nextLine();
			switch (opcao) {
			case CADASTRAR:
				exibeTelaDeCadastroDoUsuario(sc);
				break;

			default:
				break;
			}
		} while (opcao != SAIR);
	}

	private void exibeMenuDeOpcoesIniciais() {
		System.out.println("Digite uma op��o");
		System.out.println("1 - Cadastrar usu�rio" + QUEBRA_DE_LINHA
				+ "2 - Fazer login" + QUEBRA_DE_LINHA + "3 - Sair do programa");
	}

	private void exibeMensagemDeBoasVindas() {
		System.out.println("Bem vindo ao Facebook vers�o 0.00001 alpha");
	}

	private void exibeTelaDeCadastroDoUsuario(Scanner sc) {
		System.out.println("Digite o nome do usu�rio: ");
		String nome = sc.nextLine();
		System.out.println("Digite o email do usu�rio: ");
		String email = sc.nextLine();
		System.out.println("Digite a senha do usu�rio");
		String senha = sc.nextLine();
		try {
			face.cadastraUsuario(nome, email, senha);
			System.out.println("Cadastro realizado com sucesso");	
		} catch (Exception exception) {
			System.out.println("N�o foi poss�vel cadastrar o usu�rio. " 
					+ exception.getMessage());
			exibeTelaDeCadastroDoUsuario(sc);
		}
	}

}
