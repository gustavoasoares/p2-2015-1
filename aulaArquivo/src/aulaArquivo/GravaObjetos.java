package aulaArquivo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GravaObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Pessoa> lista = new ArrayList<>();
		Endereco endereco = new Endereco("Rua Epaminondas Macaxeira", "Jardim Tavares");
		lista.add(new Pessoa("danilo", endereco));
		lista.add(new Pessoa("Daniel", endereco));
		lista.add(new Pessoa("Manoel", endereco));
		lista.add(new Pessoa("Rafael", endereco));
		lista.add(new Pessoa("Gustavo", endereco));
		lista.add(new Pessoa("Igor", endereco));

		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("lista.dat")));
		try {
			out.writeObject(lista);
		} finally {
			out.close();
		}

		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("lista.dat")));
		try {
			List<Pessoa> novaLista = (List<Pessoa>) in.readObject();
			System.out.println(novaLista);
		} finally {
			in.close();
		}
	}
}
