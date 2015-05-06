package facebook;

import static org.junit.Assert.*;

import org.junit.Test;

import facebook.core.Usuario;

public class UsuarioTest {

	@Test
	public void testConstrutor() throws Exception {
		Usuario usuario = new Usuario("Lílian", "lilian@gmail.com", "12345");
		assertEquals("Lílian", usuario.getNome());
		assertEquals("lilian@gmail.com", usuario.getEmail());
		assertEquals("12345", usuario.getSenha());				
	}
	
	@Test(expected = Exception.class)
	public void testConstrutorNomeInvalido1() throws Exception {
		Usuario usuario = new Usuario("", "lilian@gmail.com", "12345");
	}
	
	@Test(expected = Exception.class)
	public void testConstrutorNomeInvalido2() throws Exception {
		Usuario usuario = new Usuario(null, "lilian@gmail.com", "12345");
	}

}
