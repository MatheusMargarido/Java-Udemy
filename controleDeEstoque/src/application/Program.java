package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Produtos produtos = new Produtos();

		// LEITURA DOS DADOS DO PRODUTO

		System.out.println("Informaçoes do produto");
		System.out.print("Nome: ");
		produtos.nome = in.nextLine();
		System.out.print("Preco: ");
		produtos.preco = in.nextDouble();
		System.out.print("Quantidade: ");
		produtos.quantidade = in.nextInt();
		
		System.out.println(produtos);
		System.out.println();

		System.out.print("Quantidade de produtos para adicionar ao estoque: ");
		int qtd = in.nextInt();
		produtos.adicionarProduto(qtd);
		System.out.println("Atualização: " + produtos);
		System.out.println();

		System.out.print("Quantidade de produtos para remover do estoque: ");
		qtd = in.nextInt();
		produtos.removerProdutos(qtd);
		System.out.println("Atualização: " + produtos);

		in.close();

	}

}
