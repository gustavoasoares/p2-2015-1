package aulaHeranca;

import java.util.ArrayList;
import java.util.List;

import aulaHeranca.Programador.Linguagem;

public class FolhaDePagamento {
	
	public static final String QUEBRA_DE_LINHA = System.getProperty("line.separator");

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
		
		List<Funcionario> listaDeFuncionarios = 
				new ArrayList<Funcionario>();
		
		Gerente gerente = new Gerente("Gustavo", 3);
		Programador programador = 
				new Programador("Ana", Linguagem.Python);
		
		listaDeFuncionarios.add(gerente);
		listaDeFuncionarios.add(programador);

	}

}
