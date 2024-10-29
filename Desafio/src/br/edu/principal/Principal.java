package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.print("Digite o número que deseja fazer em primo: ");
		num = scanner.nextInt();
		
		
		if (num == 0) {
			System.out.println("Não é possível realizar com esse número.");
		}
		
		int cont = 0;
		int armazena = 1;
		
		while(armazena <= num) {
			
			if((num % armazena) == 0) {
				cont++;
				System.out.println( num + " é divisível por " + armazena );
				
			}
			else {
				System.out.println( num + " não é divisível por " + armazena );
			}
			
			armazena++; 
			
			}
		
		if (cont == 2) {
			System.out.println( num + " é primo");
		}
		
		else {
			System.out.println( num + " não é primo");
		}
		
	}

}
