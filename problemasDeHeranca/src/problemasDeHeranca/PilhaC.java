package problemasDeHeranca;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
	
	public E pop() {
		if (lista.isEmpty())
			return null; 
		E e = lista.get(size()-1);
		lista.remove(lista.size()-1);
		return e;
	}
	
	@Override
	public String toString() {
		return lista.toString();
	}
	
	public static void main(String[] args) {
		PilhaC<String> pilha = new PilhaC<String>();
		pilha.push("{");
		pilha.push("}");
		pilha.pop();
		pilha.pop();
		pilha.push("Matteus Sthefano");
		System.out.println(pilha.pop());
		System.out.println(pilha.size());
	}
}
