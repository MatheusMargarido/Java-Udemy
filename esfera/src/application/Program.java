package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		

		System.out.print("Informe o raio: ");
		double raio = in.nextDouble();

		// POSSO CHAMAR O METODO DA CLASSE INDEPENDENTE DE CRIAR UM OBJETO POIS O METODO É STATICO
		// APENAS COLOCANDO O NOME DA CLASSE E CHAMANDO O METODO.
		
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);

		
		System.out.printf("Circunferencia  = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		System.out.printf("Valor PI = %.2f%n", Calculator.PI);

		in.close();

	}

}
