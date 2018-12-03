package compras;

public class ExceptionLimiteAtingidoCompras extends Exception {
    ExceptionLimiteAtingidoCompras(){
        super("O limite do carrinho de compras foi atingido");
    }
}
