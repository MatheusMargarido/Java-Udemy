package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);
		
		//CRIANDO UM VETOR DE FILE QUE IRA LISTAR SOMENTE DIRETORIOS.
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//CRIANDO UM VETOR DE FILE QUE IRA LISTAR SOMENTE ARQUIVOS.
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//CRIANDO UMA SUBPASTA DENTRO DO DIRETORIO QUE FOI INFORMARDO E RETORNANDO SE FOI CRIADO OU NÃO.
		boolean sucess = new File(strPath + "\\ subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: "+ sucess);

		sc.close();
	}
}
