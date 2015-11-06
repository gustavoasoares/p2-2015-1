package aulaArquivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaArquivo {

	public void copia(String source, String dest) throws IOException {
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(dest);
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
