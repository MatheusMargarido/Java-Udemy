import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {

			int x = in.nextInt();
			soma += x;

		}
		System.out.println("Soma = " + soma);

		in.close();
	}

}
