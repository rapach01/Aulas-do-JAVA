package cast;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables	
		String a = "";
		//menu
		JOptionPane.showMessageDialog(null, "Soma de Numeros");
		//scan number
		a = JOptionPane.showInputDialog("Informe um n�mero");
		//cast
		int i1 = Integer.parseInt(a);
		float f1 = Float.parseFloat(a);
		double d1 = Double.parseDouble(a);
		//print
		JOptionPane.showMessageDialog(null, "N�mero Inteiro: " + i1);
		JOptionPane.showMessageDialog(null, "N�mero Float: " + f1);
		JOptionPane.showMessageDialog(null, "N�mero Double: " + d1);
		//sum
		i1+=f1 + d1;
		//print sum
		JOptionPane.showMessageDialog(null,"N�meros Somados: " + i1);
	}
}
