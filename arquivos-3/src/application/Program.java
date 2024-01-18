package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.txt";
		
		// FILEREADER É PARA LER ARQUIVOS E O BUFFEREDREADER É UM OTIMIZADOR
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			// INSTANCIANDO UMA STRING LINHA E PASSANDO O COMANDO PARA LER A LINHA
			String line = br.readLine();

			// VAI LER O ARQUIVO ENQUANTO A LINHA FOR DIFERENTE DE NULA
			while (line != null) {
				
				// MOSTRANDO NA TELA O QUE A LINHA TEM ESCRITO
				System.out.println(line);
				// ENQUANTO ESSA LINHA AQUI NÃO RETORNAR NULA O LINE NÃO VAI ESTAR NULO
				line = br.readLine();
			}
		} 
		// TRATAMENTO DE EXCESSÃO DE ARQUIVOS
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
	}
}
