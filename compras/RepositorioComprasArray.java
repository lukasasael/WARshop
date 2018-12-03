package compras;

import produtos.arma.Arma;
import produtos.produto.*;

import java.util.Random;

public class RepositorioComprasArray implements RepositorioComprasInterface {
	private Produto[] arrayCarrinho = new Produto[1000]; // Compras de Acessórios

	// Adicionar Item no Carrinho
	public void inserir(Produto produto) throws ExceptionLimiteAtingidoCompras {
		for (int i = 0; i < arrayCarrinho.length; i++) {
			if (arrayCarrinho[i].getNome() == produto.getNome()) {
				this.arrayCarrinho[i].setQuantidade(arrayCarrinho[i].getQuantidade() + produto.getQuantidade());
			} else if (arrayCarrinho[i] == null) {
				this.arrayCarrinho[i].setQuantidade(produto.getQuantidade());
				break;
			} else if (i == arrayCarrinho.length) {
				if (arrayCarrinho[i] == null) {
					this.arrayCarrinho[i] = produto;
					this.arrayCarrinho[i].setQuantidade(1);
					break;
				} else {
					throw new ExceptionLimiteAtingidoCompras();
				}
			}
		}
	}

	// Remover Item do Carrinho
	@Override
	public void remover(String nome) throws ExceptionItemNaoEstaNoCarrinho {
		for (int i = 0; i < arrayCarrinho.length; i++) {
			if (arrayCarrinho[i].getNome().equals(nome)) {
				int posicaoEncontrada = i;
				for (int j = posicaoEncontrada; j < arrayCarrinho.length; j++) {
					if ((arrayCarrinho[j] != null) && (arrayCarrinho[j].getQuantidade() > 1) && arrayCarrinho[j].getNome().equals(nome)) {
						arrayCarrinho[j].setQuantidade(arrayCarrinho[j].getQuantidade()-1);
					} else if((arrayCarrinho[j] != null) && (arrayCarrinho[j].getQuantidade() == 1)){
						arrayCarrinho[j] = arrayCarrinho[j+1];
					}
				}
			} else if (arrayCarrinho[i] == null) {
				throw new ExceptionItemNaoEstaNoCarrinho();
			}
		}
	}

	// Procurar Item no Carrinho
	@Override
	public Produto procurar(String nome) throws ExceptionItemNaoEstaNoCarrinho {
		for (int i = 0; i < this.arrayCarrinho.length; i++) {
			if (this.arrayCarrinho[i].getNome().equals(nome)) {
				return this.arrayCarrinho[i];
			} else {
				throw new ExceptionItemNaoEstaNoCarrinho();
			}
		}
		return null;
	}

	// Verificar se item existe no carrinho
	@Override
	public boolean existe(String nome) {
		for (int i = 0; i < this.arrayCarrinho.length; i++) {
			if (this.arrayCarrinho[i].getNome().equals(nome)) {
				return true;
			} else if (this.arrayCarrinho[i] == null) {
				return false;
			}
		}return false;
	}

	// Adicionar algum cupom de Desconto
	@Override
	public int inserirCupom(int codCupom) {
		Random geradorDesconto = new Random();
		int valorDesconto = geradorDesconto.nextInt(5);
		return valorDesconto;
	}

	// Calcular Frete de envio
	@Override
	public int calcularFrete(int cep) {
		Random geradorFrete = new Random();
		int valor = geradorFrete.nextInt(20);
		return valor;
	}
}