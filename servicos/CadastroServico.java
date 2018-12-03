package servicos;

public class CadastroServico {
    private RepositorioServico servicos;

    public CadastroServico(boolean tipo) {
        if (tipo) {
            this.servicos = new RepositorioListaServico();
        } else {
            this.servicos = new RepositorioArrayServico();
        }
    }

    public void cadastrar(Servico servico) throws ExceptionLimiteAtingidoServico, ExceptionServicoJaExiste {
        this.servicos.inserir(servico);
    }

    public void remover(String nome) throws ExceptionServicoNaoExiste {
        this.servicos.remover(nome);
    }

    public Servico procurar(String nome) throws ExceptionServicoNaoExiste {
        return this.servicos.procurar(nome);
    }

    public boolean existe(String nome) {
        return this.servicos.existe(nome);
    }

    public void atualizaNome(String nome, String decricao) throws ExceptionServicoNaoExiste {
        this.servicos.atualizaNome(nome, decricao);
    }

    public void atualizaDescricao(String descricao, String nome) throws ExceptionServicoNaoExiste {
        this.servicos.atualizaDescricao(descricao, nome);
    }

    public void atualizaValor(double valor, String nome) throws ExceptionServicoNaoExiste {
        this.servicos.atualizaValor(valor, nome);
    }

    public void atualizaEntrega(int dias, String nome) throws ExceptionServicoNaoExiste {
        this.atualizaEntrega(dias, nome);
    }
}
