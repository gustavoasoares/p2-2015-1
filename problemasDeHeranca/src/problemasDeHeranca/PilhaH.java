package problemasDeHeranca;

import java.util.ArrayList;

public class PilhaH<E> extends ArrayList<E>{
	
	public void push(E e) {
		add(e);
	}
	
	public E pop() {
		if (isEmpty())
			return null; 
		E e = this.get(size()-1);
		remove(size()-1);
		return e;
	}
	
	public static void main(String[] args) {
		PilhaH<String> pilha = new PilhaH<String>();
		pilha.push("{");
		pilha.push("}");
		System.out.println(pilha.pop());
		
	}

}
