package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nomes[] = new String[3];
		Scanner sc = new Scanner(System.in);
		
		double notas [] [] = new double [2] [3];
		for(int i = 0; i < 3; i++) {
			System.out.printf("Digite os nomes: ");
			nomes[i] = sc.next();
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				notas[i][j] = sc.nextDouble();
			}
		}	
		
		for (int i = 0; i < 3; i++) {
			
			if(i < 2 ) {
			System.out.printf("      " + nomes[i] + "       ");
			}
			
			else {
				System.out.println("     " + nomes[i] + "       ");
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf(notas[i][j] + "-");
			}
		}	
	}

}
