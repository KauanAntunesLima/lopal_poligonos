package br.senai.sp.jandira.calculos_poligonos.dao;

import java.util.Scanner;

import br.senai.sp.jandira.calculos_poligonos.model.Retangulo;
import br.senai.sp.jandira.calculos_poligonos.ui.Menu;



public class RetanguloDao {

public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um retangulo...");
		
		Retangulo retangulo1 = new Retangulo();
		
		System.out.print("Digite a medida de largura do retangulo:");
		retangulo1.setLargura(leitor.nextDouble());
		
		System.out.print("Digite a medida de altura do retangulo:");
		retangulo1.setAltura(leitor.nextDouble());
		
		retangulo1.exibirDados();
		
		Menu.retornar();
		
	
}
}
