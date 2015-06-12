package problemasDeHeranca;

import java.util.ArrayList;

public class PilhaH<E> extends ArrayList<E>{
	
	public void push(E e) {
		add(e);
	}
	
	public boolean pop() {
		if (isEmpty())
			return false; 
		remove(size()-1);
		return true;
	}
	
	public static void main(String[] args) {
		PilhaH<String> pilha = new PilhaH<String>();
		pilha.push("{");
		pilha.push("}");
		pilha.pop();
		pilha.remove(1);
		System.out.println(pilha);
		
	}

}
