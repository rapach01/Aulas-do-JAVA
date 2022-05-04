package saldo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		double a = 0.01, balance=0;
		//users info
		balance = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu saldo: "));
		//count
		balance= balance+balance*a;
		//balance
		JOptionPane.showMessageDialog(null, balance);
	}

}
