package br.senai.sp.jandira.calculos_poligonos.model;

public class Trapézio {

	private double altura;
	private double baseMaior;
	private double baseMenor;

    public void setAltura(double altura) {
	this.altura = altura;
}
    public void setBaseMaior (double baseMaior ) {
	this.baseMaior = baseMaior;
}
    public void setBaseMenor (double baseMenor ) {
	this.baseMenor = baseMenor;
}
    public double calcularArea() {
	double area = (baseMaior + baseMenor) * altura/2;
	return area;
}
    public void exibirDados() {
		System.out.println("--------------------");
		System.out.println("DADOS DO Trapézio");
		System.out.println("--------------------");
		System.out.println("Tamanho da altura:" + altura);
		System.out.println("Tamanho da baseMaior:" + baseMaior);
		System.out.println("Tamanho da baseMenor:" + baseMenor);
        System.out.println("Area total:" + calcularArea());
		System.out.println("--------------------");
    }
}