import java.util.Locale;

public class FormatacaoString {

	public static void main(String[] args) {

		String produto1 = "computador";
		String produto2 = "Mesa de trabalho";

		int idade = 30;
		int codigo = 5290;
		char genero = 'f';

		double preco1 = 2100.0;
		double preco2 = 650.50;
		double measure = 53.2345670;

		System.out.println("Produtos");
		System.out.printf("%s, o preço é $%.2f%n", produto1, preco1);
		System.out.printf("%s, o preço é $%.2f%n%n", produto2, preco2);
		
		System.out.printf("Record: %d anos de idade, codigo: %d e genero: %s%n%n", idade, codigo, genero);
	

		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);


		

	}

}
