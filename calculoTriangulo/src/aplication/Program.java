package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		// INFORMEI QUE X E Y SÃO DO TIPO TRIANGULO

		Triangulo x, y;

		// CREIEI O OBJETO TRIANGULO PARA X E PARA Y

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Enter the measures of triangle x: ");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();

		System.out.println("Enter the measures of triangle y: ");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();

		// CHAMEI O METODO CRIADO PARA CALCULAR A AREA DO TRIANGULO

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: y");
		}
		in.close();
	}

}
