package core;

import java.util.ArrayList;
import java.util.HashMap;

public class Usuario {

	private String nome;
	private String senha;

	private HashMap<String, ArrayList<Tarefa>> tarefasPorNome;


	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		this.tarefasPorNome = new HashMap<String, ArrayList<Tarefa>>();
	}

	public HashMap<String, ArrayList<Tarefa>> getTarefasPorNome() {
		return tarefasPorNome;
	}

	
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public void cadastraTarefa(Tarefa tarefa) {

		ArrayList<Tarefa> tarefas = tarefasPorNome.get(tarefa.getNome());
		if (tarefas == null) {
			tarefas = new ArrayList<Tarefa>();
			tarefas.add(tarefa);
			tarefasPorNome.put(tarefa.getNome(), tarefas);
		} else {
			tarefas.add(tarefa);
		}

	}
}
