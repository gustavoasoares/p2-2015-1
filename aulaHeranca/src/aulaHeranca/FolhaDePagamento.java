package aulaHeranca;

import java.util.ArrayList;

public class FolhaDePagamento {
	
	public static final String QUEBRA_DE_LINHA = System.getProperty("line.separator");

	private ArrayList<Funcionario> listaDeFuncionarios;

	public FolhaDePagamento(ArrayList<Funcionario> listaDeFuncionarios) {
		this.listaDeFuncionarios = listaDeFuncionarios;
	}

	public String geraExtratoDaFolha() {
		String resultado = "Extrato da folha de pagamento" ;
		for (Funcionario funcionario : listaDeFuncionarios) {
			resultado += QUEBRA_DE_LINHA + funcionario.getNome() + ": R$ " +
					funcionario.calculaSalario();
		}
		
		return resultado;
	}

}
