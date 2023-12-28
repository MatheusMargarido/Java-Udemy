package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Quartos[] vet = new Quartos[10];

		System.out.print("Informe quantas pessoas irão alugar: ");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.printf("Pessoa [%d]%n", i + 1);

			System.out.print("NOME: ");
			in.nextLine();
			String nome = in.nextLine();

			System.out.print("EMAIL: ");
			String email = in.next();

			System.out.print("QUARTO: ");
			int num = in.nextInt();

			vet[num] = new Quartos(nome, email, num);
			System.out.println();
		}
		System.out.println("Quartos alugados");
		System.out.println();

		for (int i = 0; i < vet.length; i++) {

			if (vet[i] != null) {
				System.out.println(vet[i]);
				System.out.println();
			}

		}

		in.close();

	}

}
