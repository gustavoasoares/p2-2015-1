package aula3.core.oo;


public class ProgramaInicial {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Joao", 19, "Masculino");
		Pessoa pessoa2 = new Pessoa("Maria",20, "Feminino");

		pessoa1.falaNomeEIdade();
		pessoa2.falaNomeEIdade();		
	}
}
