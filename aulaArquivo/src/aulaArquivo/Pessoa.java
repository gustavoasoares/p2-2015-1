package aulaArquivo;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4141998350168263601L;
	/**
	 * 
	 */
	private String nome;
	private transient Endereco endereco;
	
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
	}
	
	@Override
	public String toString() {
		return nome + "Endereço: " + endereco;
		
	}
}
