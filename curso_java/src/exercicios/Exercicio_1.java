package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		double conta = 50.0;

		System.out.println("Informe o valor de minutos do cliente: ");
		int minutos = in.nextInt();
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		System.out.println("Valor da conta: " + conta);

		in.close();
	}

}
