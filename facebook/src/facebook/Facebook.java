package facebook;

import java.util.ArrayList;
import java.util.List;

public class Facebook {
	
	private ArrayList<Usuario> listaDeUsuarios;

	public Facebook() {
		listaDeUsuarios = new ArrayList<Usuario>();
	}

	public boolean cadastraUsuario(String nome, String email, String senha) {
		Usuario usuario = new Usuario(nome,email,senha);
		if (!listaDeUsuarios.contains(usuario)) {
			listaDeUsuarios.add(usuario);
			return true;
		}
		return false;
	}

	public boolean usuarioExiste(Usuario usuario) {
		for (int i = 0; i < listaDeUsuarios.size(); i++) {
			Usuario usuarioAtual = listaDeUsuarios.get(i);
			if (usuarioAtual.equals(usuario))
				return true;
		}
		return false;
	}

}
