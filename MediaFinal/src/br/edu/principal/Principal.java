package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, curso, disciplina, resultado;
		int idade, ano, semestre;
		double n1, n2, m;
		
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		System.out.print("Digite o curso: ");
		curso = sc.next();
		
		System.out.print("Digite a disciplina: ");
		disciplina = sc.next();
		
		System.out.print("Digite o idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite o ano: ");
		ano = sc.nextInt();
		
		System.out.print("Digite o semestre: ");
		semestre = sc.nextInt();
		
		System.out.print("Digite a nota 1: ");
		n1 = sc.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		n2 = sc.nextDouble();
		
		m = (n1*2 + n2*3) / 5;
		
		resultado = (m >= 6 )?"Aprovado":"Reprovado";
		
		System.out.println("O resultado final foi: " + resultado);
		

	}

}
