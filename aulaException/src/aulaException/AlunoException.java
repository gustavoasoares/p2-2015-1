package aulaException;

public class AlunoException extends Exception {

	public AlunoException(String message) {
		super("N�o foi poss�vel criar usu�rio." + message);
	}
}
