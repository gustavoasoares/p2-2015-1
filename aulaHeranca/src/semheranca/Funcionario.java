package semheranca;


public class Funcionario {
	
	private String nome;
	private Cargo cargo;
	private Linguagem linguagem;
	private int numeroDeProjetos;
	private final double salarioBaseGerente = 5000;
	private final double salarioBaseProgramador = 1200;
	private final double bonusPorProjeto = 2000;
	
	public Funcionario(String nome, Cargo cargo, Linguagem linguagem) throws Exception {
		if (nome == null || nome.equals("")) 
			throw new Exception("Nome inválido");
		this.nome = nome;
		this.cargo = cargo;
		this.linguagem = linguagem;
	}
	
	public Funcionario(String nome, Cargo cargo, int numeroDeProjetos) {
		this.nome = nome;
		this.cargo = cargo;
		this.numeroDeProjetos = numeroDeProjetos;
	}

	public int getNumeroDeProjetos() {
		return numeroDeProjetos;
	}
	public String getNome() {
		return nome;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public Linguagem getLinguagem() {
		return linguagem;
	}

	public double calculaSalario() {
		if (cargo.equals(Cargo.Gerente)) {
			return salarioBaseGerente + numeroDeProjetos * bonusPorProjeto;	
		} else {
			if (linguagem.equals(Linguagem.Java)) {
				return salarioBaseProgramador * 1.5;
			} else {
				return salarioBaseProgramador * 1;
			}
		}
		
	}

	enum Cargo {
		Gerente, Programador
	}
	
	enum Linguagem {
		Java, Python
	}
}

