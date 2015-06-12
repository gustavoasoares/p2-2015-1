package problemasDeHeranca;

import java.util.Collection;
import java.util.HashSet;

public class NovoHashSet<E> extends HashSet<E>{

	private int count;
	
	@Override
	public boolean add(E e) {
		count++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		count += c.size();
		return super.addAll(c);
	}
	
	public int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {
		
		HashSet<String> conjunto = new HashSet<String>();
		conjunto.add("Bianca");
		conjunto.add("David");
		conjunto.add("Eri");
		
		NovoHashSet<String> conjunto2 = new NovoHashSet<String>();
		conjunto2.addAll(conjunto);
		System.out.println(conjunto2.getCount());	
		System.out.println(conjunto2.size());
	}
	
}
