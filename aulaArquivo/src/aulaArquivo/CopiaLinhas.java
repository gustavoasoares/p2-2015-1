package aulaArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopiaLinhas {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("nomes.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("copia.txt"));
		try {
			String s;
			while ((s = in.readLine()) != null) {
				out.println(s);
			}	
		} finally {
			in.close();
			out.close();
		}
	}
}
