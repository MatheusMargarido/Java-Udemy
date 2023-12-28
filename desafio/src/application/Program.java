package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("MENU");
		System.out.println("1 - CADASTRO CONTA");
		System.out.println("2 - DEPOSITO");
		System.out.println("3 - SAQUE");
		System.out.println("4 - MODIFICAR DADOS");
		
		int resposta = in.nextInt();
		
		switch(resposta) {
		
		case 1:
		System.out.println("CADASTRO CONTA BANCARIA");
		System.out.print("NUMERO DA CONTA: ");
		int numeroConta = in.nextInt();

		System.out.print("NOME: ");
		String nome = in.next();

		System.out.print(" DESEJA FAZER UM DEPOSITO INICIAL? (S|N) ");
		char r = in.next().charAt(0);

		if (r == 's') {
			System.out.print("INFORME O VALOR DE DEPOSITO: ");
			double valor = in.nextDouble();
			Conta conta = new Conta(numeroConta, nome, valor);

		} else {
			Conta conta = new Conta(numeroConta, nome);
		}
		break;
		
		case 2: 
		
			System.out.print("Valor de deposito: ");
			double valorDeposito = in.nextDouble();
			
					

		
		
		
		
		
		}
		
		in.close();

	}

}
