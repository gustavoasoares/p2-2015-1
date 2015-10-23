package aulaException;

public class Aluno {

	private String nome;

	public Aluno(String nome) throws AlunoException {
		if (nome == null || nome.equals(""))
			throw new AlunoException("Usuário não pode ser null ou vazio");
		this.nome = nome;
	}

}
