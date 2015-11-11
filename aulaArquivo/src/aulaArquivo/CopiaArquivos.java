package aulaArquivo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CopiaArquivos {

	public void copia(String source, String dest) throws IOException {
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(dest);
		transfereBytes(in, out);
	}

	public void copiaComBuffer(String source, String dest) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		transfereBytes(in, out);
	}

	private void transfereBytes(InputStream in, OutputStream out) throws IOException {
		try {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			in.close();
			out.close();
		}
	}

	public static void main(String[] args) {
		String source = "resources/folder";
		String dest = "resources/copia/folder";
		CopiaArquivos copiaArquivos = new CopiaArquivos();
		double start = System.currentTimeMillis();
		try {
			copiaArquivos.copia(source, dest);
			double stop = System.currentTimeMillis();
			System.out.println("Tempo total: " + (stop - start) / 1000);
		} catch (IOException e) {
			System.err.println("Não foi possível copiar o arquivo: " + e.getMessage());
		}
	}

	public void copiaDiretorio(String source, String dest) throws IOException {
		File sourceFile = new File(source);
		if (sourceFile.isDirectory()) {
			File destFile = new File(dest);
			if (!destFile.exists()) {
				destFile.mkdir();
			}
			File[] listFiles = sourceFile.listFiles();
			for (File file : listFiles) {
				String destinoAtual = destFile.getAbsolutePath() + 
						File.separator + file.getName();
				if (file.isFile()) {
					copiaComBuffer(file.getAbsolutePath(), destinoAtual);
				} else {
					copiaDiretorio(file.getAbsolutePath(), destinoAtual);
				}
			}
		}
	}

}
