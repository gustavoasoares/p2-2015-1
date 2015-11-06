package aulaArquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaCaracteres {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("nomes.txt");
		FileWriter out = new FileWriter("copia.txt");

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
}
