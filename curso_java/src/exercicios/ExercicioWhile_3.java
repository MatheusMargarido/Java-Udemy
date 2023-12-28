package exercicios;

import java.util.Scanner;

public class ExercicioWhile_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Informe o numero das coordenadas: (x , y)");
		int x = in.nextInt();
		int y = in.nextInt();

		while (x != 0 || y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro");

			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");

			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");

			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");

			}
			x = in.nextInt();
			y = in.nextInt();
		}

		in.close();
	}

}
