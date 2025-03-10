package br.senai.sp.jandira.calculos_poligonos;

import br.senai.sp.jandira.calculos_poligonos.model.Circunferencia;
import br.senai.sp.jandira.calculos_poligonos.model.Quadrado;
import br.senai.sp.jandira.calculos_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculos_poligonos.model.Trapézio;
import br.senai.sp.jandira.calculos_poligonos.model.Triangulo;

public class Poligonos {
	
	public static void main(String[] args) {
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(2);
	    quadrado1.exibirDados();
	
	    Retangulo retangulo1 = new Retangulo();
	    retangulo1.setAltura(2);		
	    retangulo1.setLargura(4);
	    retangulo1.exibirDados();

		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(5);
		triangulo1.setBase(8);
		triangulo1.exibirDados();
		
		Trapézio trapézio1 = new Trapézio();
		trapézio1.setAltura(5);
		trapézio1.setBaseMaior(12);
		trapézio1.setBaseMenor(7);
		trapézio1.exibirDados();
		
		Circunferencia circunferencia1 = new Circunferencia();
		circunferencia1.setRaio(20);
		circunferencia1.exibirDados();


	
	}
}
