package exercicios;

import java.util.Scanner;

public class ExercicioFor_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int dentro = 0;
		int fora = 0;

		for (int i = 0; i < x; i++) {

			int numero = in.nextInt();
			if (numero >= 10 && numero <= 20) {
				dentro++;

			} else {
				fora++;
			}
		}
		System.out.println("Dentro = " + dentro);
		System.out.println("Fora = " + fora);

		in.close();
	}

}
