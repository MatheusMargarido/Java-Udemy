package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		// CRIAÇÃO DE LISTAS NÃO PERMITE TIPOS PRIMITIVOS, SE ULTILIZA OS HYPERCLASS
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add("Matheus");

		// ADICIONANDO UMA PESSOA NA POSIÇÃO ESPECIFICA DA LISTA SEM PREJUDICALA
		list.add(2, "Marco");

		// A LISTA PODE REMOVER UM DADO COLOCANDO O NOME OU A POSIÇÃO
		list.remove("Ana");
		list.remove(0);

		// POSSO REMOVER TODOS QUE COMEÇA COM A LETRA 'M'
		 list.removeIf(x -> x.charAt(0) == 'M');

		// FILTRAR A LISTA E DEIXAR SOMENTE QUEM COMEÇAR COM 'A'
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		// MOSTRANDO O TAMANHO DA LISTA
		System.out.println("Tamanho da lista: " + list.size());

		// PARA CADA STRING X PERTECENTE A MINHA LIST
		for (String x : list) {
			System.out.println(x);
		}

		// ENCONTRANDO A POSIÇÃO DE UMA PESSOA
		System.out.println("Posição de Bob na lista: " + list.indexOf("Bob"));

		// QUANDO O INDEXOF NÃO ENCONTRA O ELEMENTO ELE RETORNA O VALOR -1
		System.out.println("Posição de Marco na lista: " + list.indexOf("Marco"));

		for (String x : result) {
			System.out.println(x);
		}
		
		//A STRING NOME IRA RECEBER O PRIMEIRO ELEMENTO QUE RETORNAR COM A LETRA 'A' SE NÃO IRA RETORNAR NULO
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	
		
	}

}
