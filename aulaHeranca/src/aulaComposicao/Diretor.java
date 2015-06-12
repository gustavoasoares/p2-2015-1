package aulaComposicao;

public class Diretor extends Cargo implements Autenticavel {

	@Override
	public double calculaSalario() {
		return 100000;
	}

	@Override
	public void autentica(String senha) {
		// TODO Auto-generated method stub
	}
}
