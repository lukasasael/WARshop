package fornecedores;

public class CadastroFornecedor {
    private RepositorioFornecedorInterface fornecedor;

    CadastroFornecedor(boolean tipo) {
        if (tipo == true) {
            this.fornecedor = new RepositorioFornecedorLista();
        } else {
            this.fornecedor = new RepositorioFornecedorArray();
        }
    }

    public void inserir(Fornecedor marca) throws ExceptionFornecedorJaCadastrado, ExceptionLimiteAtingidoFornecedor {
        this.fornecedor.inserir(marca);
    }

    public Fornecedor procurar(String marca) throws ExceptionFornecedorNaoExiste {
        return this.fornecedor.procurar(marca);
    }

    public void deletar(String marca) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.deletar(marca);
    }

    public void atualizaMarca(String marca, String novaMarca) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaMarca(marca, novaMarca);
    }

    public void atualizaContato(String marca, String contato) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaContato(marca, contato);
    }

    public void atualizaTipoProduto(String marca, String tipoProduto) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaTipoProduto(marca, tipoProduto);
    }

    public void atualizaDisponibilidade(String marca, boolean disponibilidade) throws ExceptionFornecedorNaoExiste {
        this.fornecedor.atualizaDisponibilidade(marca, disponibilidade);
    }
}