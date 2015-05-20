package core;

public class Tarefa {

	private String nome;
	private int tempo;

	public Tarefa(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return nome + " " + tempo;
	}

}
