package aulaArquivo;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CopiaArquivoTest {
	
	@Before
	public void setUp() {
		String dest = "resources/example2-fig1-copia.gif";
		File destFile = new File(dest);
		destFile.delete();
	}

	@Test
	public void testArquivo() throws IOException {
		
		CopiaArquivo copiaArquivo = new CopiaArquivo();
		String source = "resources/example2-fig1.gif";
		String dest = "resources/example2-fig1-copia.gif";
		copiaArquivo.copia(source,dest);
		File sourceFile = new File(source);
		File destFile = new File(dest);
		assertTrue(destFile.exists());
		assertTrue(sourceFile.length() == destFile.getTotalSpace());
	}

}
