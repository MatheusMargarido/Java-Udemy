package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informaçoes do produto");
		
		// VARIAVEIS AUXILIAR PARA RECEBER OS ATRIBUTOS DO OBJETO QUE EU VOU CRIAR.
		
		System.out.print("Nome: ");
		String nome = in.nextLine();
		
		System.out.print("Preco: ");
		double preco = in.nextDouble();
		
		
		// CRIANDO O PRODUTO COM OS DADOS INFORMADOS E ARMAZENADOS NAS VARIAVEIS AUXILIARES
		
		Produtos produto = new Produtos(nome, preco);
		
		System.out.println(produto);
		System.out.println();

		System.out.print("Quantidade de produtos para adicionar ao estoque: ");
		int qtd = in.nextInt();
		produto.adicionarProduto(qtd);
		System.out.println("Atualização: " + produto);
		System.out.println();

		System.out.print("Quantidade de produtos para remover do estoque: ");
		qtd = in.nextInt();
		produto.removerProdutos(qtd);
		System.out.println("Atualização: " + produto);

		in.close();

	}

}
