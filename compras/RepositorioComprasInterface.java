package compras;

import produto.Produto;

public interface RepositorioComprasInterface {

	void adicionarItem(Produto produto);

	void removerItem(String nome) throws ItemNaoEstaNoCarrinhoException;

	Produto procurarItem(String nome) throws ItemNaoEstaNoCarrinhoException;

	boolean existe(String nome);

	int inserirCupom(int codCupom);

	int calcularFrete(int cep);
}
