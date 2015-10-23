package refatoramento;

public class Endereco {
	public String rua;
	public String bairro;
	public String CEP;
	public int numero;

	public Endereco(String rua, int numero) {
		this.rua = rua;
		this.numero = numero;
	}
}