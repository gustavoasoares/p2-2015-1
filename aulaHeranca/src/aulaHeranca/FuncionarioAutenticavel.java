package aulaHeranca;

public abstract class FuncionarioAutenticavel extends Funcionario 
implements Autenticavel {

	public FuncionarioAutenticavel(String nome) throws Exception {
		super(nome);
	}
	
	public void autentica(String senha) {
		// faz autenticação
	}
}
