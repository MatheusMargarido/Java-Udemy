package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com o numero da conta: ");
		int nConta = in.nextInt();
		System.out.print("titular da conta: ");
		in.nextLine();
		String tConta = in.nextLine();
		System.out.print("Deseja fazer um deposito inicial? (s|n)");
		char resp = in.next().charAt(0);
		
		if (resp == 's') {
			System.out.print("Digite o valor inicial do deposito: ");
			double valor = in.nextDouble();
			conta = new Conta(nConta, tConta, valor);
		} else {
			conta = new Conta(nConta, tConta);
		}

		System.out.println();
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor de deposito: ");
		double vdeposito = in.nextDouble();
		conta.deposito(vdeposito);
		System.out.println("Atualização da conta");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor de saque: ");
		double vsaque = in.nextDouble();
		conta.saque(vsaque);
		System.out.println("Atualização da conta");
		System.out.println(conta);

		in.close();

	}

}
