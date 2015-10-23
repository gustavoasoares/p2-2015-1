package aulaStrategy;

import static org.junit.Assert.*;

import org.junit.Test;

import loja.Carrinho;
import loja.Item;

public class CarrinhoTest {

	@Test
	public void testGetTotal() {
		
		Carrinho carrinho = new Carrinho();
		carrinho.addItem(new Item("iphone6s", 4500));
		carrinho.addItem(new Item("case do Iphone", 120));
		carrinho.addItem(new Item("seguro", 500));
		
		double totalEsperado = 5020;
		assertEquals(totalEsperado, carrinho.getTotal(),0);
		
	}

}
