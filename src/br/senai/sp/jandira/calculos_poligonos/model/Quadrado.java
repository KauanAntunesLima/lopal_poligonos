package br.senai.sp.jandira.calculos_poligonos.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	public double calcularPerimetro( ) {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("--------------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("--------------------");
		System.out.println("Tamanho do lado:" + lado);
		System.out.println("Area total:" + calcularArea());
		System.out.println("Perímetro:" + calcularPerimetro());
		System.out.println("--------------------");

	}
}