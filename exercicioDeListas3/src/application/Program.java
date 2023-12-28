package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.print("Informe o numero de funcionarios que ira cadastrar: ");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("CADASTRO #" + (i + 1));
			System.out.print("ID: ");
			int id = in.nextInt();

			if (hasId(list, id)) {
				System.out.println("Tente outro ID");
				id = in.nextInt();
			}
			System.out.print("NOME: ");
			in.nextLine();
			String nome = in.nextLine();
			System.out.print("SALARIO: ");
			double salario = in.nextDouble();

			list.add(new Funcionario(id, nome, salario));

		}

		System.out.println();
		System.out.print("Informe o ID do funcionario que receberar o aumento");
		int id = in.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Funcionario não encontrado");
		}

		System.out.println();
		for (Funcionario obj : list) {

			System.out.println(obj);
		}

		in.close();

	}

	private static boolean hasId(List<Funcionario> list, int id) {

		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func!= null;
	}

}
