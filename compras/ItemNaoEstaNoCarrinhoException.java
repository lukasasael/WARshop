package compras;

public class ItemNaoEstaNoCarrinhoException extends Exception {
	public ItemNaoEstaNoCarrinhoException() {
		super("O item não está no carrinho");
	}
}
