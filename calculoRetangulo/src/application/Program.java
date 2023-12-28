package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.println("Dados sobre o retangulo");
		System.out.print("Largura: ");
		retangulo.largura = in.nextDouble();
		System.out.print("Altura: ");
		retangulo.altura = in.nextDouble();

		System.out.printf("Area: %.2f%n", retangulo.area());
		System.out.printf("Perimetro: %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f%n", retangulo.diagonal());

		in.close();
	}

}
