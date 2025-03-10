package br.senai.sp.jandira.calculos_poligonos.model;

public class Triangulo {
	
	private double altura;
	private double base;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setBase (double base ) {
		this.base = base;
	}
	public double calcularArea() {
		double area = (base * altura)/2;
		return area;
	}
	public void exibirDados() {
		System.out.println("--------------------");
		System.out.println("DADOS DO Triangulo");
		System.out.println("--------------------");
		System.out.println("Tamanho da altura:" + altura);
		System.out.println("Tamanho da base:" + base);
        System.out.println("Area total:" + calcularArea());
		System.out.println("--------------------");
	}
}
