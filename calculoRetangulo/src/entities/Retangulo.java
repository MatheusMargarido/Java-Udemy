package entities;

public class Retangulo {

	public double altura;
	public double largura;

	public double area() {
		double area = altura * largura;
		return area;
	}

	public double perimetro() {
		double perimetro = altura + largura;
		return perimetro;
	}
	public double diagonal() {
		double diagonal = altura + largura;
		return diagonal;
	}
	

}
