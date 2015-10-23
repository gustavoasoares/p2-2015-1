package loja;

import java.math.BigDecimal;

public class Item implements Comparable<Item> {

	private String nome;
	private double valor;

	public Item(String nome, double  valor) {
		this.setNome(nome);
		this.setValor(valor);
		
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Item outro) {
		if (valor < outro.valor)
			return -1;
		if (valor == outro.valor)
			return 0;
		return 1;
	}
	
	public String toString() {
		return this.nome + " " + this.valor;
	}
}
