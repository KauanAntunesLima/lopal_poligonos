package br.senai.sp.jandira.calculos_poligonos.ui;

import java.util.Scanner;

import br.senai.sp.jandira.calculos_poligonos.dao.QuadradoDao;
import br.senai.sp.jandira.calculos_poligonos.dao.RetanguloDao;
import br.senai.sp.jandira.calculos_poligonos.dao.TrianguloDao;
import br.senai.sp.jandira.calculos_poligonos.model.Retangulo;

public class Menu {

	static Scanner leitor = new Scanner(System.in);
	
	public static void criarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("---------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("6 - SAIR");
		System.out.println("---------------------------");
		System.out.print("Escolha uma opção (1-6):");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
		} else if (opcao == 2) {
			RetanguloDao.criar();
		} else if (opcao == 3) {
			TrianguloDao.criar();
		} else if (opcao == 4) {
			// Chamar o TrapezioDao
		} else if (opcao == 5) {
			// Chamar a CircunferenciaDao
		}else if (opcao ==6) {
			System.out.println("Encerrando o programa, Até mais!");
			System.exit(0);
		}else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 6!");
			criarMenu();
		}
			
		System.out.println("A opção escolhida foi " + opcao);

	}

	public static void retornar() {
		// Perguntar ao usuario se ele deseja criar outra forma
		System.out.print("Digite qualquer tecla e pressione ENTER para continuar...");
		leitor.next();
        criarMenu();
		
	}
	
}
