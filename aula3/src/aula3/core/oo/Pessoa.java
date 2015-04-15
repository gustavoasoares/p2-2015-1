package aula3.core.oo;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		//primeiro verificar se idade é valida
		this.idade = idade;
	}
	
	public void falaNomeEIdade() {
		
		if (sexo.equals("Masculino")) {
			System.out.println("|||||||||||");
			System.out.println("----------");
			System.out.println("|         |");
			System.out.println("| O    O  |");
			System.out.println("|   (     |");
			System.out.println("|   __    |");
			System.out.println("|_________|");	
		} else {
			System.out.println(" =====V=====");
			System.out.println("/|---------|\\");
			System.out.println("$| ))   )) ||$");
			System.out.println("$| O    O  ||$");
			System.out.println("$|   (     ||$");
			System.out.println("$|   __    ||$");
			System.out.println("$|_________||$");
		}		
		System.out.println("Oi, meu nome é " + this.nome + ", e eu tenho " + this.idade + " anos");
	}
	
}
