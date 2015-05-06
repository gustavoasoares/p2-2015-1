package facebook;

import static org.junit.Assert.*;

import org.junit.Test;

import facebook.core.Facebook;
import facebook.core.Usuario;

public class FacebookTest {

	
	public void testCadastraUsuario() throws Exception {
		Facebook face = new Facebook();

		Usuario usuarioEsperado = new Usuario("Bianca",
				"bianca@ccc.ufcg.edu.br", "12345");

		face.cadastraUsuario("Bianca", "bianca@ccc.ufcg.edu.br", "12345");
		assertTrue(face.usuarioExiste(usuarioEsperado));
	}
	
	@Test(expected = Exception.class)
	public void testCadastraUsuarioDuplicado() throws Exception {
		Facebook face = new Facebook();
		face.cadastraUsuario("Bianca", "bianca@ccc.ufcg.edu.br", "12345");
		face.cadastraUsuario("Bianca", "bianca@ccc.ufcg.edu.br", "12345");
	}
	
	@Test
	public void testRemoveUsuario() throws Exception {
		Facebook face = new Facebook();

		Usuario usuarioEsperado = new Usuario("Bianca",
				"bianca@ccc.ufcg.edu.br", "12345");
		
		face.cadastraUsuario("Bianca", "bianca@ccc.ufcg.edu.br", "12345");
		face.removeUsuario("bianca@ccc.ufcg.edu.br");
		assertFalse(face.usuarioExiste(usuarioEsperado));
	}

}
