package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		// VETOR DE DOUBLE COM O TAMANHO N ADQUIRIDO ANTES
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = in.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		double media = soma / n;

		System.out.printf("Media = %.2f%n", media);

		in.close();
	}

}
