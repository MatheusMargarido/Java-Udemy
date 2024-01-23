package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// MOSTRA SOMENTE O NOME
		System.out.println("getName: " + path.getName());

		// MOSTRA SOMENTE O CAMINHO SEM O NOME DO ARQUIVO
		System.out.println("getParent: " + path.getParent());
		
		// MOSTRA O CAMINHO COMPLETO
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}
}
