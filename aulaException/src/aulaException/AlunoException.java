package aulaException;

public class AlunoException extends Exception {

	public AlunoException(String message) {
		super("Não foi possível criar usuário." + message);
	}
}
