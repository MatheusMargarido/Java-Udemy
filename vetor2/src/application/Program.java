package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Informe o numero de produtos: ");
		int n = in.nextInt();

		Produto[] vetor = new Produto[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Nome: ");
			in.nextLine();
			String nome = in.nextLine();
			System.out.println("preco: ");
			double preco = in.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma/n;
		
		System.out.printf("Media preço: %.2f%n", media);

		in.close();

	}

}
