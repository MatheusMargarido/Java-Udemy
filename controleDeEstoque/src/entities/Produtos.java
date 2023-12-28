package entities;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;

	// CRIAÇÃO DE METODOS PUBLICOS COM RETORNOS DOUBLE E VOID

	public double valorEstoque() {
		double total = preco * quantidade;
		return total;
	}

	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;

	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "Informacoes do produto: " + nome + ", $" + String.format("%.2f", preco) + ", " + quantidade
				+ " unidades, Total: $" + String.format("%.2f", valorEstoque());
	}

}
