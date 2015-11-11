package aulaArquivo;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CopiaArquivosTest {

	private CopiaArquivos copiaArquivos;
	private File sourceFile;
	private File destFile;

	@Before
	public void setUp() {
		copiaArquivos = new CopiaArquivos();
		String source = "resources/example2-fig1.gif";
		sourceFile = new File(source);
		String dest = "resources/example2-fig1-copia.gif";
		destFile = new File(dest);
		destFile.delete();
	}
	
	@Test
	public void testCopia() throws IOException {
		
		copiaArquivos.copia(sourceFile.getAbsolutePath(),destFile.getAbsolutePath());
		assertTrue(destFile.exists());
		assertEquals(sourceFile.length(), destFile.length());
	}
	
	@Test
	public void testCopiaComBuffer() throws IOException {
		copiaArquivos.copiaComBuffer(sourceFile.getAbsolutePath(),destFile.getAbsolutePath());
		assertTrue(destFile.exists());
		assertEquals(sourceFile.length(), destFile.length());
	}
	
	@Test
	public void testCopiaDiretorio() throws IOException {
		String source = "resources/folder";
		String dest = "resources/folderCopia";
		copiaArquivos.copiaDiretorio(source, dest);
		File destFile = new File(dest);
		File arquivo1= new File(dest, "example2-fig1.gif");
		File subpasta = new File(dest, "subfolder");
		File arquivo2= new File(subpasta, "lista.dat");
		File subsubpasta1 = new File(subpasta, "subsubfolder");
		File arquivo3= new File(subsubpasta1, "nomes.txt");
		File subsubpasta2 = new File(subpasta, "subsubfolder2");
		File arquivo4= new File(subsubpasta2, "nomes.txt");
		assertTrue(destFile.exists());
		assertTrue(arquivo1.exists());
		assertTrue(arquivo2.exists());
		assertTrue(arquivo3.exists());
		assertTrue(arquivo4.exists());
		assertTrue(subpasta.exists());
		assertTrue(subsubpasta1.exists());
		assertTrue(subsubpasta2.exists());
		
		
	}


}
