package entities;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numeroConta, String nomeTitular, double depositoinicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoinicial);
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
		this.saldo += deposito;
	}

	public void saque(double saque) {
		this.saldo -= saque + 5;

	}

	public String toString() {
		return "NUMERO DA CONTA: " + numeroConta + "\nNOME: " + nomeTitular + "\nSALDO: " + String.format("%.2f", saldo);
	}

}
