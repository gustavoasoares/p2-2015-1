package loja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploStrategy {

	public static void main(String[] args) {
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("iphone6s", 4500));
		itens.add(new Item("case do Iphone", 120));
		itens.add(new Item("seguro", 500));

		Collections.sort(itens, new Comparator<Item>() {
			@Override
			public int compare(Item arg0, Item arg1) {
				return arg0.getNome().compareTo(arg1.getNome());
			}
		});
		
		System.out.println(itens);

	}

}
