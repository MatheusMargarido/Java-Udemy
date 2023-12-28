package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		List<Produto> list = new ArrayList<>();
		Integer resposta = null;

		do {
			System.out.println();
			System.out.println("<< MENU >>");
			System.out.println();
			System.out.println("1 - CADASTRAR PRODUTO");
			System.out.println("2 - REMOVER PRODUTO");
			System.out.println("3 - INFORMAÇOES DOS PRODUTOS");
			System.out.println("4 - ADICIONAR AO ESTOQUE");
			System.out.println("5 - REMOVER DO ESTOQUE");
			System.out.println("6 - TOTAL EM ESTOQUE");
			System.out.println("7 - EXIT");
			System.out.println();
			System.out.print("OPÇÃO: ");
			resposta = in.nextInt();

			switch (resposta) {
			case 1:
				System.out.println();
				System.out.print("INFORME A QUANTIDADE DE PRODUTOS QUE IRA CADASTRAR: ");
				int q = in.nextInt();

				for (int i = 0; i < q; i++) {
					
					System.out.println();
					System.out.println("PRODUTO #" + (i + 1));
					System.out.print("CODIGO: ");
					int cod = in.nextInt();
					
					// COLOCAR UM METODO DE VERIFICAÇÃO DE CODIGO
					
					System.out.print("NOME: ");
					in.nextLine();
					String nome = in.nextLine();
					System.out.print("PRECO: ");
					double preco = in.nextDouble();
					System.out.print("QUANTIDADE: ");
					int quantidade = in.nextInt();
					Produto produto = new Produto(cod, nome, preco, quantidade);
					list.add(produto);
				}
				break;

			case 2:
				System.out.print("INFORME O CODIGO DO PRODUTO: ");
				int cod = in.nextInt();
				Produto prod = list.stream().filter(x -> x.getCodigo() == cod).findFirst().orElse(null);

				if (prod == null) {
					System.out.println("PRODUTO NãO ENCONTRADO");
					break;
				} else {
					list.remove(prod);
				}
				break;

			case 3:
				System.out.println("PRODUTOS EM ESTOQUE");
				System.out.println();
				for (Produto obj : list) {
					System.out.println(obj);
					System.out.println();
				}
				break;
				
			case 4:
				System.out.print("INFORME O CODIGO DO PRODUTO: ");
				cod = in.nextInt();
				prod = list.stream().filter(x -> x.getCodigo() == cod).findFirst().orElse(null);

				if (prod == null) {
					System.out.println("PRODUTO NãO ENCONTRADO");
					break;
				} else {
					System.out.print("INFORME A QUANTIDADE: ");
					int qtd = in.nextInt();
					prod.adicionar(qtd);
				}
				break;
				
			case 5:
				System.out.print("INFORME O CODIGO DO PRODUTO: ");
				cod = in.nextInt();
				prod = list.stream().filter(x -> x.getCodigo() == cod).findFirst().orElse(null);

				if (prod == null) {
					System.out.println("PRODUTO NãO ENCONTRADO");
					break;
				} else {
					System.out.print("INFORME A QUANTIDADE: ");
					int qtd = in.nextInt();
					prod.remover(qtd);
				}
				break;
				
			case 6:
				double total = 0.0;
				for (Produto obj : list) {
					total += (obj.getPreco() * obj.getQuantidade());
				}
				System.out.printf("VALOR DE ESTOQUE: R$ %.2f", total);
				System.out.println();
				break;

			case 7:
				System.out.println("Fim do programa");
				break;

			default:
				System.out.println("A OPÇÃO NÃO EXISTE");
				break;
			}

		} while (resposta != 7);

		in.close();

	}

}
