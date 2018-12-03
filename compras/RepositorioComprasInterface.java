package compras;

import produtos.produto.*;

public interface RepositorioComprasInterface {

	void inserir(Produto produto) throws ExceptionLimiteAtingidoCompras;

	void remover(String nome) throws ExceptionItemNaoEstaNoCarrinho;

	Produto procurar(String nome) throws ExceptionItemNaoEstaNoCarrinho;

	boolean existe(String nome);

	int inserirCupom(int codCupom);

	int calcularFrete(int cep);
}
