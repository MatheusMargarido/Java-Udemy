package entities;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Conta(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numeroConta, String nomeTitular, double saldo) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getsaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		this.saldo = saldo + deposito;
	}

	public String saque(double saque) {

		if (saldo > saque + 5) {
			this.saldo = saldo - saque;
			return "SALDO : " + saldo;
		} else {
			return "Saldo insuficiente";
		}

	}

}
