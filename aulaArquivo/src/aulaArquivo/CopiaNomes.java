package aulaArquivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaNomes {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("nomes.txt");
		FileOutputStream out = new FileOutputStream("copia.txt");
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
