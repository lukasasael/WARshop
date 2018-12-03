package compras;

import produto.Produto;

import java.util.Random;

import armas.Armas;

public class Compras {
	private Produto item;
	private Armas modeloArma;
	private boolean temCupom = false;
	private boolean compraRealizada = false;

	// Métodos públicos
	public int calcularFrete(int cep) {
		Random geradorFrete = new Random();
		int valor = geradorFrete.nextInt(20);
		return valor;
	}

	public int inserirCupom(int codCupom) {
		Random geradorDesconto = new Random();
		int valorDesconto = geradorDesconto.nextInt(5);
		return valorDesconto;

	}

	// Método Construtor
	public Compras(Produto item, Armas modeloArma, boolean temCupom, boolean compraRealizada) {
		super();
		this.item = item;
		this.modeloArma = modeloArma;
		this.temCupom = temCupom;
		this.compraRealizada = compraRealizada;
	}

	// Métodos Getters & Setters
	public Produto getItem() {
		return item;
	}

	public void setItem(Produto item) {
		this.item = item;
	}

	public Armas getModeloArma() {
		return modeloArma;
	}

	public void setModeloArma(Armas modeloArma) {
		this.modeloArma = modeloArma;
	}

	public boolean CompraRealizada() {
		return compraRealizada;
	}

	public void setCompraRealizada(boolean compraRealizada) {
		this.compraRealizada = compraRealizada;
	}

}