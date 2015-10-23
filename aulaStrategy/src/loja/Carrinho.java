package loja;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	IDescontoStrategy estrategiaDeDesconto;

	List<Item> itens;

	public Carrinho() {
		
		itens = new ArrayList<>();
		
		estrategiaDeDesconto = 
				DescontoStrategyFactory.getInstance().createDescontoStrategy();
	}
	
	public void addItem(Item item) {
		itens.add(item);
	}

	public void setDesconto(IDescontoStrategy estrategia) {
		this.estrategiaDeDesconto = estrategia;
	}

	private double getTotalSemDesconto() {
		double total = 0;
		for (Item item : itens) {
			total += item.getValor();
		}
		return total;
	}

	public double getTotal() {
		double valorSemDesconto = getTotalSemDesconto();
		return estrategiaDeDesconto.getTotal(valorSemDesconto);
	}

}
