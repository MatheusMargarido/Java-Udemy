package util;

public class CurrencyConverter {

	public static double calcularDolar(double dolar, double compDolar) {
		double valorReais = dolar * compDolar;
		return valorReais * 0.06 + valorReais;
	}

}
