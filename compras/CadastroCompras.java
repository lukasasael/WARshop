package compras;
import produto.Produto;
import compras.RepositorioComprasArray;
import compras.RepositorioComprasInterface;

public class CadastroCompras {
	private RepositorioComprasInterface compras;
	
	public CadastroCompras(boolean tipo) {
		if(tipo) {
			this.compras = new RepositorioComprasArray();
		}else {
			this.compras = new RepositorioComprasArray();
		}
	}
	
	public void adicionarItem(Produto produto) {
		this.compras.adicionarItem(produto);
	}
	
	public void removerItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		this.compras.removerItem(nome);
	}
	
	public Produto procurarItem(String nome) throws ItemNaoEstaNoCarrinhoException {
		return this.compras.procurarItem(nome);
	}
	
	public boolean existe(String nome) {
		return this.compras.existe(nome);
	}
	
	public int inserirCupom(int codCupom) {
		return this.compras.inserirCupom(codCupom);
	}
	
	public int calcularFrete(int cep) {
		return this.compras.calcularFrete(cep);
	}
}
