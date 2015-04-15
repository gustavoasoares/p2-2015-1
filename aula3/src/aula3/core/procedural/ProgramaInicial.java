package aula3.core.procedural;

public class ProgramaInicial {
	
	public static void main(String[] args) {
		String nome = "Joao";
		int idade = 19;
		String sexo = "Masculino";
		
		String nome2 = "Maria";
		int idade2 = 20;
		String sexo2 = "Feminino";
		
		
		falaNomeEIdade(nome, idade, sexo);
		falaNomeEIdade(nome2, idade2, sexo2);
		
	}

	private static void falaNomeEIdade(String nome, int idade, String sexo) {
		
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
		System.out.println("Oi, meu nome é " + nome + ", e eu tenho " + idade + " anos");
	}

}
