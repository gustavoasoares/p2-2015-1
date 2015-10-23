package loja;

public class DescontoAbsoluto implements IDescontoStrategy{

	private double valorDesconto;
	
	public DescontoAbsoluto(double valor) {
		valorDesconto = valor;
	}
	
	@Override
	public double getTotal(double valorSemDesconto) {
		if (valorSemDesconto - valorDesconto < 0)
			return 0;
		return valorSemDesconto - valorDesconto;
	}

}
