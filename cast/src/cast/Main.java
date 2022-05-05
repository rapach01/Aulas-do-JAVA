package cast;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables	
		String a = "";
		//menu
		JOptionPane.showMessageDialog(null, "Soma de Numeros");
		//scan number
		a = JOptionPane.showInputDialog("Informe um número");
		//cast
		int i1 = Integer.parseInt(a);
		float f1 = Float.parseFloat(a);
		double d1 = Double.parseDouble(a);
		//print
		JOptionPane.showMessageDialog(null, "Número Inteiro: " + i1);
		JOptionPane.showMessageDialog(null, "Número Float: " + f1);
		JOptionPane.showMessageDialog(null, "Número Double: " + d1);
		//sum
		i1+=f1 + d1;
		//print sum
		JOptionPane.showMessageDialog(null,"Números Somados: " + i1);
	}
}
