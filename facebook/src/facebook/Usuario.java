package facebook;

public class Usuario {

	private String nome;
	private String email;
	private String senha;

	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public boolean equals(Object outro) {
		if (!(outro instanceof Usuario))
			return false;

		Usuario outroUsuario = (Usuario) outro;
		if (this.email.equals(outroUsuario.getEmail())) {
			return true;
		}

		return false;
	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public String getSenha() {
		return this.senha;
	}

}