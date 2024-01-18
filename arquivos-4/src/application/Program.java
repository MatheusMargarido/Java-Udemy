package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	// BUFFEREDWRITER USADO PARA ESCREVER E CRIAR ARQUIVOS
	public static void main(String[] args) {

		// CRIANDO UM VETOR DE STRINGS JA PASSANDO OS PARAMETROS
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		// INFORMANDO O CAMINHO DO ARQUIVO
		String path = "c:\\temp\\out.txt";
		
		// PARA NÃO APAGAR O ARQUIVO EXISTENTE E SO ACRESCENTAR DADOS A ELE COLOCA O TRUE
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			//PARA CADA LINE NO VETOR LINES
			for (String line : lines) {
				
				// ESCREVA A LINHA (NO CASO A PRIMEIRA LINHA É "Good morning")
				bw.write(line);
				
				// PULE PARA PROXIMA LINHA
				bw.newLine();
			}
			// TRATAMENTO DE EXCESSÃO DO TIPO DE ARQUIVO
		} catch (IOException e) {
			
			// MOSTRA O CAMINHO DO ERRO
			e.printStackTrace();
		}
	}
}
