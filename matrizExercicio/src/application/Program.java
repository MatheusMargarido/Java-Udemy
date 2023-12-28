package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Informe as dimensões: ");
		int n = in.nextInt();
		int m = in.nextInt();

		Integer[][] mat = new Integer[n][m];

		System.out.println("Informe os valores");
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Posição: [%d][%d]: ", i, j);
				mat[i][j] = in.nextInt();
			}
		}
		System.out.print("Numero que deseja encontrar: ");
		int num = in.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == num) {

					System.out.println();
					
					System.out.printf("Posição: [%d][%d]%n", i, j);
					if (j > 0) {
						System.out.println("numero a esquerda: " + mat[i][j - 1]);
					} else {
						System.out.println("Nenhum numero a esquerda");
					}
					if (j < mat[i].length - 1) {
						System.out.println("numero a direita: " + mat[i][j + 1]);
					} else {
						System.out.println("Nenhum numero a direita");
					}
					if (i > 0) {
						System.out.println("numero a cima: " + mat[i + 1][j]);
					} else {
						System.out.println("Nenhum numero a cima");
					}
					if (i < mat.length - 1) {
						System.out.println("numero abaixo: " + mat[i - 1][j]);
					} else {
						System.out.println("Nenhum numero abaixo");
					}

				}
			}
		}

		in.close();
	}

}
