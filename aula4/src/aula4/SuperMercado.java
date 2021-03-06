package aula4;

public class SuperMercado {
	
	private static final int CAPACIDADE_INICIAL_DA_LISTA = 2;
	private Produto[] listaDeProdutos;
	private int indexDoProdutoAtual = 0;
	
	
	public SuperMercado() {
		listaDeProdutos = new Produto[CAPACIDADE_INICIAL_DA_LISTA];
	}

	public void cadastrarProduto(Produto produto) {
		if (listaEstaCheia()) {
			dobraLista();
		}		
		adicionaProdutoNaLista(produto);
	}

	private void adicionaProdutoNaLista(Produto produto) {
		this.listaDeProdutos[indexDoProdutoAtual] = produto;
		indexDoProdutoAtual++;
	}

	private void dobraLista() {
		Produto[] novoArray = new Produto[listaDeProdutos.length*2];
		System.arraycopy(listaDeProdutos, 0, novoArray, 0, listaDeProdutos.length);
		this.listaDeProdutos = novoArray;
	}

	private boolean listaEstaCheia() {
		return indexDoProdutoAtual == listaDeProdutos.length;
	}
	
	public int getQuantidadeDeProdutos() {
		return indexDoProdutoAtual;
	}
}
