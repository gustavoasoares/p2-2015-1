package aulaHeranca;


public abstract class Funcionario {

	private String nome;	
	protected double salarioBase;
	
	public Funcionario(String nome) throws Exception {
		if (nome == null || nome.equals("")) 
			throw new Exception("Nome inválido");
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	

	public abstract double calculaSalario();
	
}

