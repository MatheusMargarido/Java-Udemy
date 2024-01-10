package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();

		
		list.add(new SavingsAccount(1001, "alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Ana", 500.0, 500.0));

		double soma = 0.0;

		for (Account a : list) {
			soma += a.getBalance();
		}
		System.out.printf("Total Balance: %.2f%n", soma);

		for (Account a : list) {
			a.deposit(10.0);

		}
		for (Account a : list) {
			System.out.printf("Update balance for account %d: %.2f%n", a.getNumber(), a.getBalance());

		}
	}

}
