package br.edu.principal;

import javax.swing.JOptionPane;
public class Principal {

	public static void main(String[] args) {
		String nome, msg, m;
		double mf;
		
		nome = JOptionPane.showInputDialog("Digite sue nome: ");
		msg  = "Olá! Seja bem-vindo(a)" + nome;
		
		JOptionPane.showMessageDialog(null, msg);
		
		m = JOptionPane.showInputDialog("Digite sua média: ");
		mf = Double.parseDouble(m);
		JOptionPane.showMessageDialog(null, mf);

	}

}
