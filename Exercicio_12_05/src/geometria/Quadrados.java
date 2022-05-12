package geometria;

import javax.swing.JOptionPane;

public abstract class Quadrados implements Formas {
	
	public void periquad (double lado1 ) {
		JOptionPane.showMessageDialog(null,"A área do quadrilatero é: " + lado1);
	}
}
