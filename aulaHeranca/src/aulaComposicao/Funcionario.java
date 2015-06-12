package aulaComposicao;


public class Funcionario {

	private String nome;	

	private Cargo cargo;
	
	public Funcionario(String nome, Cargo cargo) throws Exception {
		if (nome == null || nome.equals("")) 
			throw new Exception("Nome inválido");
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double calculaSalario() {
		return cargo.calculaSalario();
	}
	

	
	
}

