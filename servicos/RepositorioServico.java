package servicos;

public interface RepositorioServico {
    public void inserir(Servico servico) throws ExceptionServicoJaExiste, ExceptionLimiteAtingidoServico;

    public void remover(String nome) throws ExceptionServicoNaoExiste;

    public void atualizaNome(String nome, String decricao) throws ExceptionServicoNaoExiste;

    public void atualizaDescricao(String descricao, String nome) throws ExceptionServicoNaoExiste;

    public void atualizaValor(double valor, String nome) throws ExceptionServicoNaoExiste;

    public void atualizaEntrega(int dias, String nome) throws ExceptionServicoNaoExiste;

    public Servico procurar(String nome) throws ExceptionServicoNaoExiste;

    public boolean existe(String nome);
}
