package br.senai.sp.jandira.calculos_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculos_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculos_poligonos.model.Triangulo;

public class TrianguloDao {

public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um triangulo...");
		
		Triangulo triangulo1 = new Triangulo();
		
		System.out.print("Digite a medida de altura do triangulo:");
		triangulo1.setAltura(leitor.nextDouble());
		
		System.out.print("Digite a medida de base do triangulo:");
		triangulo1.setBase(leitor.nextDouble());
		
		triangulo1.exibirDados();
}
}
