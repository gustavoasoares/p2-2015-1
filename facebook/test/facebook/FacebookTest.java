package facebook;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacebookTest {

	@Test
	public void testCadastraUsuario() {
		Facebook face = new Facebook();
		
		Usuario usuarioEsperado = new Usuario("Bianca",
				"bianca@ccc.ufcg.edu.br", "12345");
		face.cadastraUsuario("Bianca","bianca@ccc.ufcg.edu.br", "12345");
		
		
		assertTrue(face.usuarioExiste(usuarioEsperado));
		assertFalse(face.cadastraUsuario("Bianca",
				"bianca@ccc.ufcg.edu.br", "12345"));
	}

}
