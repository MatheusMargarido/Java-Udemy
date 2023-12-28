package apliccation;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.print("Qual o preco do dolar? ");
		double dolar = in.nextDouble();

		System.out.print("Quantos dolars voce ira comprar? ");
		double compDolar = in.nextDouble();

		System.out.println("Valor a pagar em reais: " + CurrencyConverter.calcularDolar(dolar , compDolar));

		in.close();
	}

}
