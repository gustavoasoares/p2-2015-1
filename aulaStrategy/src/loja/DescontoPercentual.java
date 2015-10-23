package loja;

public class DescontoPercentual implements IDescontoStrategy {

	private double percentual;

	public DescontoPercentual(double percentual) {
		this.percentual = percentual;
	}
	@Override
	public double getTotal(double valorSemDesconto) {
		return valorSemDesconto * this.percentual;
	}

}
