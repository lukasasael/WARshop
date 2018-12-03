package usuarios.admins;

public interface RepositorioUsuarioAdminInterface {
    void inserir(UsuarioAdmin admin) throws ExceptionAdminJaExiste, ExceptionLimiteAtingidoAdmin;

    UsuarioAdmin procurar(String CPF) throws ExceptionAdminNaoExiste;

    void deletar(String CPF) throws ExceptionAdminNaoExiste;

    boolean existe(String CPF);

    void atualizaNome(String CPF, String nome) throws ExceptionAdminNaoExiste;

    void atualizaIdade(String CPF, int idade) throws ExceptionAdminNaoExiste;

    void atualizaTelefone(String CPF, String telefone) throws ExceptionAdminNaoExiste;

    void atualizaCEP(String CPF, String CEP) throws ExceptionAdminNaoExiste;

    void atualizaCodigoFuncionario(String CPF, String codigoFuncionario) throws ExceptionAdminNaoExiste;
}
