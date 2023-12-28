package entities;

public class Quartos {

	private String nome;
	private String email;
	private int num;

	public Quartos(String nome, String email, int num) {

		this.nome = nome;
		this.email = email;
		this.num = num;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String toString() {
		return "n° " + num +"\nNOME: " + nome + "\nEMAIL: " + email;
	}

}
