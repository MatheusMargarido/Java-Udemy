package entities;

public class Produtos {

	private String nome;
	private double preco;
	private int quantidade;
	
	
	
	//GET E SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
	
	/* 
	 * CONTRUTOR NÃO POSSUI O TIPO DE RETORNO E É O CARA QUE EXECULTA QUANDO CRIA UM OBJETO.
	 * CRIA-SE CONSTRUTOR PARA NÃO EXISTIR UM PRODUTO SEM PARAMETROS.
	 * O CONSTRUTOR IRA ATRIBUIR ESSES DADOS AOS ATRIBUTOS DO OBJETOS.
	 * ESSE THIS É USADO PARA SE REFERIR AO ATRIBUTO DA CLASSE.
	*/
	
	// CONSTRUTOR PADRAO
	public Produtos() {
		
	}
	public Produtos(String nome, Double preco, int quantidade) {
		
		//THIS = ATRIBUTOS DA CLASSE  NOME SEM NADA = NOME DO PARAMETRO RECEBIDO NO METODO
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;	
	}
	    // SOBRECARGA É TER MAIS DE UM CONSTRUTOR
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	
	
	
	
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
