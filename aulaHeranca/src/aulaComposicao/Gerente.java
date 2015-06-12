package aulaComposicao;

public class Gerente extends Cargo implements Autenticavel {
	
	private int numeroDeProjetos;
	private final double bonusPorProjeto = 2000;
	
	public Gerente(int numeroDeProjetos) throws Exception {
		this.numeroDeProjetos = numeroDeProjetos;
		this.salarioBase = 5000;
	}

	public int getNumeroDeProjetos() {
		return numeroDeProjetos;
	}

	@Override
	public double calculaSalario() {
		return salarioBase + numeroDeProjetos * bonusPorProjeto;
	}

	@Override
	public void autentica(String senha) {
		// TODO Auto-generated method stub
		
	}

}
