
public class ExpCondicionalTernaria {

	public static void main(String[] args) {
		
		
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;
		}
		else {
		desconto = preco * 0.05;
		}
		
		// FORMA SIMPLIFICADA PARA ESCREVER A EXPRESSÃO ACIMA
		
		// double preco = 34.5;
		
		// PREÇO MENOR QUE 20? SE SIM PREÇO X 0.1 NÃO PREÇO X 0.05
		
		// double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	}

}
