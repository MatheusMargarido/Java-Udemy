package exercicios;

import java.util.Scanner;

public class ExercicioWhile_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("informe a senha: ");
		int senha = in.nextInt();

		while (senha != 2002) {

			System.out.println("Senha invalida");
			senha = in.nextInt();
		}
		System.out.println("Acesso Permitido!");
		in.close();
	}

}
