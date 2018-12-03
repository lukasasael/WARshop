package servicos;

public class RepositorioArrayServico implements RepositorioServico {
    protected Servico[] arrayServico = new Servico[1000];
    protected int contador = 0;

    @Override
    public void inserir(Servico servico) throws ExceptionServicoJaExiste, ExceptionLimiteAtingidoServico {
        for (int i = 0; i < arrayServico.length; i++) {
            if (arrayServico[i].getNomeServico().equals(servico.getNomeServico())) {
                ExceptionServicoJaExiste e;
                e = new ExceptionServicoJaExiste();
                throw e;
            } else if (arrayServico[i] == null) {
                this.arrayServico[i] = servico;
                this.contador++;
            } else if (i == arrayServico.length - 1) {
                ExceptionLimiteAtingidoServico e;
                e = new ExceptionLimiteAtingidoServico();
                throw e;
            }
        }

    }

    @Override
    public void remover(String nome) throws ExceptionServicoNaoExiste {
        boolean achou = false;
        for (int i = 0; i < (this.contador) && (achou == false); i++) {
            if (this.arrayServico[i].getNomeServico().equals(nome)) {
                achou = true;
                for (int j = i; j < this.contador; j++) {
                    this.arrayServico[j] = this.arrayServico[j + 1];
                }
            }
        }
        if (achou == false) {
            ExceptionServicoNaoExiste e;
            e = new ExceptionServicoNaoExiste();
            throw e;
        } else {
            this.contador--;
        }
    }

    @Override
    public void atualizaNome(String nome, String descricao) throws ExceptionServicoNaoExiste {
        boolean achou = false;
        for (int i = 0; (i < this.contador) && (achou == false); i++) {
            if (this.arrayServico[i].getDescricaoServico().equals(descricao)) {
                this.arrayServico[i].setNomeServico(nome);
                achou = true;
            }
        }
        if (achou == false) {
            ExceptionServicoNaoExiste e;
            e = new ExceptionServicoNaoExiste();
            throw e;
        }

    }

    @Override
    public void atualizaDescricao(String descricao, String nome) throws ExceptionServicoNaoExiste {
        boolean achou = false;
        for (int i = 0; (i < this.contador) && (achou == false); i++) {
            if (this.arrayServico[i].getNomeServico().equals(nome)) {
                this.arrayServico[i].setDescricaoServico(descricao);
                achou = true;
            }
        }
        if (achou == false) {
            ExceptionServicoNaoExiste e;
            e = new ExceptionServicoNaoExiste();
            throw e;
        }
    }

    @Override
    public void atualizaValor(double valor, String nome) throws ExceptionServicoNaoExiste {
        boolean achou = false;
        for (int i = 0; (i < this.contador) && (achou == false); i++) {
            if (this.arrayServico[i].getNomeServico().equals(nome)) {
                this.arrayServico[i].setValorServico(valor);
                achou = true;
            }
        }
        if (achou == false) {
            ExceptionServicoNaoExiste e;
            e = new ExceptionServicoNaoExiste();
            throw e;
        }
    }

    @Override
    public void atualizaEntrega(int dias, String nome) throws ExceptionServicoNaoExiste {
        boolean achou = false;
        for (int i = 0; (i < this.contador) && (achou == false); i++) {
            if (this.arrayServico[i].getNomeServico().equals(nome)) {
                this.arrayServico[i].setDiasEntrega(dias);
                achou = true;
            }
        }
        if (achou == false) {
            ExceptionServicoNaoExiste e;
            e = new ExceptionServicoNaoExiste();
            throw e;
        }

    }

    @Override
    public Servico procurar(String nome) throws ExceptionServicoNaoExiste {
        Servico retorno = null;
        boolean achou = false;
        for (int i = 0; (i < this.contador) && (achou == false); i++) {
            if (this.arrayServico[i].getNomeServico().equals(nome)) {
                achou = true;
                retorno = this.arrayServico[i];
            }
        }
        if (achou == true) {
            return retorno;
        } else {
            ExceptionServicoNaoExiste e;
            e = new ExceptionServicoNaoExiste();
            throw e;

        }
    }

    @Override
    public boolean existe(String nome) {
        boolean retorno = false;
        for (int i = 0; i < arrayServico.length; i++) {
            if (arrayServico[i].getNomeServico().equals(nome)) {
                i = arrayServico.length;
                retorno = true;
            } else if (arrayServico[i] == null) {
                i = arrayServico.length;
                retorno = false;
            }
        }
        return retorno;
    }


}
