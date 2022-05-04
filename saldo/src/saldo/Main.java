package saldo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		double a = 0.01, balance=0;
		
		balance = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu saldo: "));
		
		balance= balance+balance*a;
		
		JOptionPane.showMessageDialog(null, balance);
		

	}

}
