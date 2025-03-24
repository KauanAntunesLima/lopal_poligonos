package br.senai.sp.jandira.calculos_poligonos;

import java.util.Scanner;

import br.senai.sp.jandira.calculos_poligonos.model.Circunferencia;
import br.senai.sp.jandira.calculos_poligonos.model.Quadrado;
import br.senai.sp.jandira.calculos_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculos_poligonos.model.Trapezio;
import br.senai.sp.jandira.calculos_poligonos.model.Triangulo;
import br.senai.sp.jandira.calculos_poligonos.ui.Menu;

public class Poligonos {
	
	public static void main(String[] args) {
		
		// Looping / Laços de repetição
//		int contador = 0;
//		while(contador <=100) {
//            System.out.println("Kauan Antunes - " + contador);
//            contador = contador +1;
//		}
//		
//		String resposta = "s";
//		while(resposta.equals("s")) {
//			System.out.println("Estamos dando voltas ");
//			System.out.println("Gostaria de dar mais uma volta (s/n) ");
//			Scanner leitor = new Scanner(System.in);
//					resposta = leitor.next();
	//	}
		
		System.out.println("------Tabuada do 9---------");
	
		int resultado;
		int contador = 0;
		while(contador  <=10) {
		resultado = contador*9;
		System.out.println(contador + " x 9 = " + resultado);
		contador = contador + 1;
		}
	
		//Menu.criarMenu();
		
	}
}

	


