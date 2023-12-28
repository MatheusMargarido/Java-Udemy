import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		char resposta;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double tempC = in.nextDouble();
			double fahrenheit = (9 * tempC / 5) + 32;

			System.out.printf("Equivalente em fahrenheit: %.1f%n ", fahrenheit);

			System.out.println("Deseja continuar? (s|n)");
			resposta = in.next().charAt(0);
		} while (resposta == 's');

		in.close();
	}

}
