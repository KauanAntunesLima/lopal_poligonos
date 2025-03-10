package br.senai.sp.jandira.calculos_poligonos.model;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
		public void setLargura (double largura) {
			this.largura = largura ;
		}
		public double calcularArea() {
			double area = altura * largura;
			return area;
		}
		public double calcularPerimetro() {
			double area = (2*altura) + (2*largura);
			return area;
		}
		public void exibirDados() {
			System.out.println("--------------------");
			System.out.println("DADOS DO RETÂNGULO");
			System.out.println("--------------------");
			System.out.println("Tamanho da altura:" + altura);
			System.out.println("Tamanho da largura:" + largura);
            System.out.println("Area total:" + calcularArea());
			System.out.println("Perímetro:" + calcularPerimetro());
			System.out.println("--------------------");

	}

}
