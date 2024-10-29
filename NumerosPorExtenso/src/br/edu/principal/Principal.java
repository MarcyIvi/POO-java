package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número entre 0 e 9: ");
		int num = scanner.nextInt();
		
		if (num == 0) {
			System.out.println("ZERO");
		}
		else if (num == 1) {
			System.out.println("UM");
		}
		
		else if (num == 2) {
			System.out.println("DOIS");
		}
		
		else if (num == 3) {
			System.out.println("TRÊS");
		}
		
		else if (num == 4) {
			System.out.println("QUATRO");
		}
		
		else if (num == 5) {
			System.out.println("CINCO");
		}
		
		else if (num == 6) {
			System.out.println("SEIS");
		}
		
		else if (num == 7) {
			System.out.println("SETE");
		}
		
		else if (num == 8) {
			System.out.println("OITO");
		}
		
		else if (num == 9) {
			System.out.println("NOVE");
		}
		
		else {
			System.out.println("O número digitado está fora da faixa! Deixe de ser burro! Seu animal!!!!");
		}


	}

}
