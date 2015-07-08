package aulaComposicao;



public class Programador extends Cargo implements Autenticavel {
	
	private Linguagem linguagem;

	public Programador(Linguagem linguagem) throws Exception {
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

	@Override
	public void autentica(String senha) {
		// TODO Auto-generated method stub
		
	}
}
