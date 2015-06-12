package aulaComposicao;

import java.util.ArrayList;
import java.util.List;

import aulaComposicao.Programador.Linguagem;

public class FolhaDePagamento {

	public static final String QUEBRA_DE_LINHA = System
			.getProperty("line.separator");

	private ArrayList<Funcionario> listaDeFuncionarios;

	public FolhaDePagamento(ArrayList<Funcionario> listaDeFuncionarios) {
		this.listaDeFuncionarios = listaDeFuncionarios;
	}

	public String geraExtratoDaFolha() {

		StringBuilder sb = new StringBuilder();
		System.out.println("Isso é um teste");
		sb.append("Extrato da folha de pagamento");
		for (Funcionario funcionario : listaDeFuncionarios) {
			sb.append(QUEBRA_DE_LINHA);
			sb.append(funcionario.getNome());
			sb.append(": R$ ");
			sb.append(funcionario.calculaSalario());
		}
		return sb.toString();
	}

	public static void main(String[] args) throws Exception {

		List<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();

		Funcionario funcionario1 = new Funcionario("Gustavo", new Gerente(3));
		Funcionario funcionario2 = new Funcionario("Ana", new Programador(
				Linguagem.Python));

		System.out.println(funcionario1.calculaSalario());
		funcionario1.setCargo(new Diretor());
		System.out.println(funcionario1.calculaSalario());
		listaDeFuncionarios.add(funcionario1);
		listaDeFuncionarios.add(funcionario2);

	}

}
