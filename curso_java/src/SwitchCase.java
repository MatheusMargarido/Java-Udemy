import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Informe o valor (1 a 7): ");
		int valor = in.nextInt();
		String dia;

		switch (valor) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;

		}
		System.out.println("Dia informado: " + dia);

		in.close();
	}

}
