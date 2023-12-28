import java.util.Scanner;

public class EstruturasIfElse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Informe as horas: ");
		double i = in.nextDouble();

		if (i > 0 && i < 6) {
			System.out.println("Boa Madrugada!");

		} else if (i >= 6 && i < 12) {
			System.out.println("Bom Dia!");

		} else if (i >= 12 && i < 18) {
			System.out.println("Boa Tarde");

		} else {
			System.out.println("Boa noite!");
		}
		in.close();
	}

}
