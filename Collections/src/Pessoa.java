
public class Pessoa {
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return nome; 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object outro) {
		
		if (!(outro instanceof Pessoa))
			return false;
		Pessoa outraPessoa = (Pessoa) outro;
		
		if (!this.nome.equals(outraPessoa.getNome()))
			return false;
		
		return true; 
	}

}
