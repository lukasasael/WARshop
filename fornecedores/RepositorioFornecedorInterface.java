package fornecedores;

public interface RepositorioFornecedorInterface {

    void inserir(Fornecedor fornecedor) throws ExceptionFornecedorJaCadastrado, ExceptionLimiteAtingidoFornecedor;

    Fornecedor procurar(String marca) throws ExceptionFornecedorNaoExiste;

    void deletar(String marca) throws ExceptionFornecedorNaoExiste;

    void atualizaMarca(String marca, String novaMarca) throws ExceptionFornecedorNaoExiste;

    void atualizaContato(String marca, String contato) throws ExceptionFornecedorNaoExiste;

    void atualizaTipoProduto(String marca, String tipoProduto) throws ExceptionFornecedorNaoExiste;

    void atualizaDisponibilidade(String marca, boolean disponibilidade) throws ExceptionFornecedorNaoExiste;
}