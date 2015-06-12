package aulaHeranca;

public class Diretor extends FuncionarioAutenticavel {

	public Diretor(String nome) throws Exception {
		super(nome);
	}

	@Override
	public double calculaSalario() {
		return 100000;
	}
}
