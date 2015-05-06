package aula3.core.oo;

public class Conta {

	private Cliente titular;
	private String agencia;
	private String numero;
	private double saldo;

	public Conta(String ag, String numero, double saldo, Cliente titular) {
		this.agencia = ag;
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) throws Exception {
		if (valor <= 0)
			throw new Exception("O valor do deposito tem que ser positivo");
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws Exception {
		if (valor > saldo)
			throw new Exception("Saldo insuficiente");
		this.saldo -= valor;
	}
}
