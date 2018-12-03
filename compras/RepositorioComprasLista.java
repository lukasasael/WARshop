package compras;

import java.util.Random;

import produtos.produto.*;

public class RepositorioComprasLista implements RepositorioComprasInterface {
    private Produto produto;
    private RepositorioComprasLista proximo;

    public RepositorioComprasLista() {
    }

    @Override
    public void inserir(Produto produto) {
        if (this.produto == null) {
            this.produto = produto;
            this.proximo = new RepositorioComprasLista();
        } else if (this.produto.getNome() == produto.getNome()) {
            this.produto.setQuantidade(this.produto.getQuantidade() + 1);
        } else {
            this.proximo.inserir(produto);
        }
    }

    @Override
    public void remover(String nome) throws ExceptionItemNaoEstaNoCarrinho {
        if (this.produto != null) {
            if (this.produto.getNome().equals(nome)) {
                this.produto = this.proximo.produto;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(nome);
            }
        } else {
            throw new ExceptionItemNaoEstaNoCarrinho();
        }
    }

    @Override
    public Produto procurar(String nome) throws ExceptionItemNaoEstaNoCarrinho {
        if (this.produto != null) {
            if (this.produto.getNome().equals(nome)) {
                return this.produto;
            } else {
                return this.proximo.procurar(nome);
            }
        } else {
            throw new ExceptionItemNaoEstaNoCarrinho();
        }
    }

    @Override
    public boolean existe(String nome) {
        if (this.produto != null) {
            if (this.produto.getNome().equals(nome)) {
                return true;
            } else {
                return this.proximo.existe(nome);
            }
        } else {
            return false;
        }
    }

    @Override
    public int inserirCupom(int codCupom) {
        Random geradorDesconto = new Random();
        int valorDesconto = geradorDesconto.nextInt(5);
        return valorDesconto;
    }

    @Override
    public int calcularFrete(int cep) {
        Random geradorFrete = new Random();
        int valor = geradorFrete.nextInt(20);
        return valor;
    }

}