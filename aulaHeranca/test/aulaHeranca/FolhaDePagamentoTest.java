package aulaHeranca;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import aulaHeranca.Programador.Linguagem;

public class FolhaDePagamentoTest {

	@Test
	public void testCriaFolha() throws Exception {

		ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<Funcionario>();
		Gerente gerente = new Gerente("Gustavo", 3);
		Programador programador = new Programador("Ana", Linguagem.Python);
		listaDeFuncionarios.add(gerente);
		listaDeFuncionarios.add(programador);

		FolhaDePagamento folha = new FolhaDePagamento(listaDeFuncionarios);

		String extrato = folha.geraExtratoDaFolha();
		String extratoEsperado = "Extrato da folha de pagamento"
				+ FolhaDePagamento.QUEBRA_DE_LINHA + "Gustavo: R$ 11000.0"
				+ FolhaDePagamento.QUEBRA_DE_LINHA + "Ana: R$ 1200.0";

		assertEquals(extratoEsperado, extrato);
	}

}
