package compras;

public class ExceptionItemNaoEstaNoCarrinho extends Exception {
	public ExceptionItemNaoEstaNoCarrinho() {
		super("O item não está no carrinho");
	}
}
