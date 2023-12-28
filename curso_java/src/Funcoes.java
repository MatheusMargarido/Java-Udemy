import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Informe 3 numeros: ");

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		in.close();
	}

	/*
	 * Public = A função pode ser chamada por outras classes. 
	 * static = A função pode ser chamada sem criar um objeto. 
	 * int = o valor que essa função vai retornar.
	 * max = nome da função.
	 * Não precisa ter  mesmo nome das variaveis dentro do parenteses.
	 * Oque esta dentro do parenteses é oque a função ira receber, por exemplo essa função esta recebendo 3 valores inteiros.
	 */

	public static int max(int x, int y, int z) {
		
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	/*
	 * Void = A função não retorna um valor de alguma operação, apensa escreve bonitinho.
	 */
	public static void showResult(int valor) {
		
		System.out.println("Higher = " + valor);
	}

}
