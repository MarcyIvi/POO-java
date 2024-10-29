package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número entre 0 e 9: ");
		int num = scanner.nextInt();
		
		switch (num) {
		case 0:
			System.out.println("ZERO");
			break;
			
		case 1:
			System.out.println("UM");
			break;
			
		case 2:
			System.out.println("DOIS");
			break;
			
		case 3:
			System.out.println("TRÊS");
			break;
			
		case 4:
			System.out.println("QUATRO");
			break;
			
		case 5:
			System.out.println("CINCO");
			break;
			
		case 6:
			System.out.println("SEIS");
			break;
			
		case 7:
			System.out.println("SETE");
			break;
			
		case 8:
			System.out.println("OITO");
			break;
			
		case 9:
			System.out.println("NOVE");
			break;
			
		default:
			System.out.println("O número digitado está fora da faixa! Deixa de ser burro! Isso era INTUITIVO!");
		}
		
	}

}
