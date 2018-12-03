package usuarios.comuns;

public interface RepositorioUsuarioComumInterface {
    void inserir(UsuarioComum user) throws ExceptionUsuarioJaExiste, ExceptionLimiteAtingidoComum;

    UsuarioComum procurar(String CPF) throws ExceptionUsuarioNaoExiste;

    void deletar(String CPF) throws ExceptionUsuarioNaoExiste;

    boolean existe(String CPF);

    void atualizaNome(String CPF, String nome) throws ExceptionUsuarioNaoExiste;

    void atualizaIdade(String CPF, int idade) throws ExceptionUsuarioNaoExiste;

    void atualizaTelefone(String CPF, String telefone) throws ExceptionUsuarioNaoExiste;

    void atualizaCEP(String CPF, String CEP) throws ExceptionUsuarioNaoExiste;

    void atualizaNumeroCartao(String CPF, String numeroCartao) throws ExceptionUsuarioNaoExiste;
}
