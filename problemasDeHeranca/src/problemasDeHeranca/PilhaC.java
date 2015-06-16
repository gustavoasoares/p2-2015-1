package problemasDeHeranca;

import java.util.ArrayList;
import java.util.List;

public class PilhaC<E> {
	
	private List<E> lista;
	
	public PilhaC() {
		lista = new ArrayList<E>(); 
	}
	
	public void push(E e) {
		lista.add(e);
	}
	
	public int size() {
		return lista.size();
	}
	
	public boolean pop() {
		if (lista.isEmpty())
			return false; 
		lista.remove(lista.size()-1);
		return true;
	}
	
	public static void main(String[] args) {
		PilhaC<String> pilha = new PilhaC<String>();
		pilha.push("{");
		pilha.push("}");
		pilha.pop();
		System.out.println(pilha);
	}
}
