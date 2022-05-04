package sucant;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		int a, ant, suc;
		//info
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		//print and count
		JOptionPane.showMessageDialog(null,"Seu número é:" + a);
		ant= a-1;
		JOptionPane.showMessageDialog(null,"Seu antecessor é:" + ant);
		suc=a+1;
		JOptionPane.showMessageDialog(null,"Seu sucessor é:" + suc);

	}

}
