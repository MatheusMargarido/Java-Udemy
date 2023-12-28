package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		System.out.print("Infome as dimensoes: ");
		int n = in.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = in.nextInt();
			}
		}
		System.out.println("Main diagonal");

		for (int i = 0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		System.out.println();
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.print("Numeros negativos: " + cont);

		in.close();
	}

}
