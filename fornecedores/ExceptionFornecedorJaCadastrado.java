package fornecedores;

public class ExceptionFornecedorJaCadastrado extends Exception {
    public ExceptionFornecedorJaCadastrado() {
        super("Um fornecedor com esse nome ja existe no nosso sistema.");
    }
}