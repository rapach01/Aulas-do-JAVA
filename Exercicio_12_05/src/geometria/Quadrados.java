package geometria;

import javax.swing.JOptionPane;

public abstract class Quadrados implements Formas {
	
	public void periquad (double lado1 ) {
		JOptionPane.showMessageDialog(null,"A �rea do quadrilatero �: " + lado1);
	}
}
