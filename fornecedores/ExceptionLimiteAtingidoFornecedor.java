package fornecedores;

public class ExceptionLimiteAtingidoFornecedor extends Exception {
    public ExceptionLimiteAtingidoFornecedor() {
        super("O limite de fornecedores que o sistema pode cadastrar foi atingido.");
    }
}
