package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		int codigo[] = new int [100];
		
		int cont = 0;
		for(int i = 0; i < 100; i ++) {
			codigo[i] = i;
			cont += 2;		
			}
		
		for (int i = 0; i < 100; i ++) {
			System.out.print(codigo[i] + " ");
		}

	}

}
