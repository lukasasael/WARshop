package fornecedores;

public class ExceptionFornecedorNaoExiste extends Exception {
    public ExceptionFornecedorNaoExiste() {
        super("A busca por esse fornecedor não retornou resultado.");
    }
}