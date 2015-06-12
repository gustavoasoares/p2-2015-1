package problemasDeHeranca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserManager {

	private Set<String> usuarios;
	
	private List<String> alunos = new ArrayList<String>();
	
	public UserManager(Set<String> usuarios) {
		this.usuarios = usuarios;
	}
	
	public Set<String> getUsuarios() {
		return usuarios;
	}
	
	public static void main(String[] args) {
		
		Set<String> usuarios = new HashSet<String>();
		usuarios.add("Bianca");
		usuarios.add("David");
		usuarios.add("Eri");
		
		UserManager a = new UserManager(usuarios);
		System.out.println(a.getUsuarios());
	}
}
