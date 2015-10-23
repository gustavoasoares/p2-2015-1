package loja;

public class SemDesconto implements IDescontoStrategy {

	@Override
	public double getTotal(double valorSemDesconto) {
		return valorSemDesconto;
	}

}
