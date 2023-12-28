package util;

public class Calculator {

	/*
	 * Funções estáticas são frequentemente usadas para implementar métodos
	 * utilitários que não dependem do estado de instâncias específicas, mas estão
	 * relacionados à lógica da classe como um todo.
	 */
	public final static double PI = 3.14159;

	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3;
	}

}
