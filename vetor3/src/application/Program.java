package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = in.nextInt();

		Pessoa[] vetor = new Pessoa[n];
		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("REGISTRO [%d]%n", i + 1);
			System.out.print("NOME: ");
			in.nextLine();
			String nome = in.nextLine();

			System.out.print("IDADE: ");
			int idade = in.nextInt();

			System.out.print("ALTURA: ");
			Double altura = in.nextDouble();

			vetor[i] = new Pessoa(nome, idade, altura);
			System.out.println();
		}
		System.out.println("Pessoas menores de 16 anos");
		int menor16 = 0;
		double altura = 0.0;

		for (int i = 0; i < vetor.length; i++) {

			altura = altura + vetor[i].getAltura();
			
			if (vetor[i].getIdade() < 16) {
				menor16++;
				System.out.printf("NOME: %s%nIDADE: %d%n", vetor[i].getNome(), vetor[i].getIdade());
				System.out.println();
			}

		}
		double porMenor16 = menor16 * 100 / n;
		double porAlt = altura/ n;

		System.out.printf("PORCENTAGEM DE PESSOAS COM MENOS DE 16 ANOS: %.1f%%\n", porMenor16);
		System.out.printf("MEDIA DE ALTURA: %.2f%n", porAlt);

		in.close();

	}

}
