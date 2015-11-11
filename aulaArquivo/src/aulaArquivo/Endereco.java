package aulaArquivo;


public class Endereco {

	public Endereco(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	private String rua;
	private String bairro;
	
	@Override
	public String toString() {
		return "rua: " + rua + " Bairro: " + bairro;
	}
}
