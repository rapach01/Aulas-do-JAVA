package sucant;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		int a, ant, suc;
		//info
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		//print and count
		JOptionPane.showMessageDialog(null,"Seu n�mero �:" + a);
		ant= a-1;
		JOptionPane.showMessageDialog(null,"Seu antecessor �:" + ant);
		suc=a+1;
		JOptionPane.showMessageDialog(null,"Seu sucessor �:" + suc);

	}

}
