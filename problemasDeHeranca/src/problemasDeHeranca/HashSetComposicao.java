package problemasDeHeranca;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetComposicao<E> implements Set<E> {
	
	private HashSet<E> hashSetInterno = new HashSet<E>();
	
	private int count;
	
	@Override
	public boolean add(E e) {
		count++;
		return hashSetInterno.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		count += c.size();
		return hashSetInterno.addAll(c);
	}
	
	public int getCount() {
		return count;
	}
	
	public int size() {
		return hashSetInterno.size();
	}
	
	public static void main(String[] args) {
		
		HashSet<String> conjunto = new HashSet<String>();
		conjunto.add("Bianca");
		conjunto.add("David");
		conjunto.add("Eri");
		
		HashSetComposicao<String> conjunto2 = new HashSetComposicao<String>();
		conjunto2.addAll(conjunto);
		System.out.println(conjunto2.getCount());	
		System.out.println(conjunto2.size());
	}

	@Override
	public void clear() {
		hashSetInterno.clear();
	}

	@Override
	public boolean contains(Object arg0) {
		return hashSetInterno.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return hashSetInterno.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return hashSetInterno.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return hashSetInterno.iterator();
	}

	@Override
	public boolean remove(Object arg0) {
		return hashSetInterno.remove(arg0);
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return hashSetInterno.removeAll(arg0);
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return hashSetInterno.retainAll(arg0);
	}

	@Override
	public Object[] toArray() {
		return hashSetInterno.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return hashSetInterno.toArray(arg0);
	}
	

}
