package br.senai.sp.jandira.calculos_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculos_poligonos.model.Trapezio;

public class TrapezioDao {
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um trapézio...");
		
		Trapezio trapezio = new Trapezio();
		
		System.out.print("Digite a medida de altura do trapézio:");
		trapezio.setAltura(leitor.nextDouble());
		
		System.out.print("Digite a medida da Base Maior do trapézio:");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Digite a medida de Base Menor do trapézio:");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		trapezio.exibirDados();
}
}
