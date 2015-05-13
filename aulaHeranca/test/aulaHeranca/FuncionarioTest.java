package aulaHeranca;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;


public class FuncionarioTest {

	@Test
	public void testProgramador() throws Exception {
		Programador programador = new Programador("Matteus",Programador.Linguagem.Java);
		assertEquals("Matteus", programador.getNome());
		assertEquals(Programador.Linguagem.Java,programador.getLinguagem());
		
		assertEquals(1800, programador.calculaSalario(),0);
	}
	
	@Test(expected = Exception.class)
	public void testConstrutorInvalido() throws Exception {
		Funcionario programador = new Programador("",Programador.Linguagem.Java);
		
	}
	
	@Test
	public void testGerente() throws Exception {
		int numeroDeProjetos = 2;
		Gerente gerente = new Gerente("Bianca",numeroDeProjetos);
		assertEquals("Bianca", gerente.getNome());
		assertEquals(2, gerente.getNumeroDeProjetos());
		
		assertEquals(9000.0, gerente.calculaSalario(),0);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
}
