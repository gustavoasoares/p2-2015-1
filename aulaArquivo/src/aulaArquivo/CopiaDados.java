package aulaArquivo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaDados {

	public static void main(String[] args) throws IOException {

		DataOutputStream out = new DataOutputStream(new FileOutputStream("primitivos.dat"));

		int a = 10;
		String s = "P2";
		boolean b = true;
		try {
			out.writeInt(a);
			out.writeUTF(s);
			out.writeBoolean(b);
		} finally {
			out.close();
		}
		DataInputStream in = new DataInputStream(new FileInputStream("primitivos.dat"));
		try {
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			System.out.println(in.readBoolean());
		} finally {
			in.close();
		}
	}
}
