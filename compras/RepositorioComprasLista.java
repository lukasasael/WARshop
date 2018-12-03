package compras;

import java.util.Random;

import produto.Produto;

public class RepositorioComprasLista implements RepositorioComprasInterface {
	private Produto produto;
	private int qtdProduto;
	private RepositorioComprasLista proximo;

	public RepositorioComprasLista() {
	}

	@Override
	public void adicionarItem(Produto produto) {
		if (this.produto.getNome() == null) {
			this.produto = produto;
			this.proximo = new RepositorioComprasLista();
		} else if (this.produto.getNome() == produto.getNome()) {
			qtdProduto++;
		}

	}

	@Override
	public void removerItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		if (this.produto != null) {
			if (this.produto.getNome().equals(nome)) {
				this.produto = this.proximo.produto;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.removerItem(nome);
			}
		} else {
			throw new ItemNaoEstaNoCarrinhoException();
		}
	}

	@Override
	public Produto procurarItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		Produto p = null;
		if (this.produto != null) {
			if (this.produto.getNome().equals(nome)) {
				p = this.produto;
				return p;
			} else {
				this.proximo.procurarItem(nome);
				return this.proximo.procurarItem(nome);
			}
		} else {
			throw new ItemNaoEstaNoCarrinhoException();
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
		
		// TODO Auto-generated method stub
		return codCupom;
	}

	@Override
	public int calcularFrete(int cep) {
		Random geradorFrete = new Random();
		int valor = geradorFrete.nextInt(20);
		return valor;
	}
	
}