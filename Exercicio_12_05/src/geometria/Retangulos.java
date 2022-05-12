package geometria;

import javax.swing.JOptionPane;

public abstract class Retangulos implements Formas {
	
	public void periret(double lado1, double lado2) {
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do lado 1"));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do lado 2"));

	}
}
