package aulaArquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class CopiaCaracteres {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(new FileInputStream("nomes.txt"),
				Charset.forName("ISO-8859-1").newDecoder());

		FileWriter out = new FileWriter("nomesUTF8.txt");

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
