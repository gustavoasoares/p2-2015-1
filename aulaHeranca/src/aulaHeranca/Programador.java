package aulaHeranca;



public class Programador extends Funcionario {
	
	private Linguagem linguagem;

	public Programador(String nome, Linguagem linguagem) throws Exception {
		super(nome);
		this.linguagem = linguagem;
		this.salarioBase = 1200;
	}
	
	public Linguagem getLinguagem() {
		return linguagem;
	}
	
	@Override
	public double calculaSalario() {
		if (linguagem.equals(Linguagem.Java)) {
			return salarioBase * 1.5;
		} else {
			return salarioBase * 1;
		}
	}

	enum Linguagem {
		Java, Python
	}
}
