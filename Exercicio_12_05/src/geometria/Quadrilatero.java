package geometria;

import javax.swing.JOptionPane;

public abstract class Quadrilatero implements Formas{
	
	public double perimeter(double perimetere) {
		JOptionPane.showMessageDialog(null,"A área do quadrilatero é: " + perimetere);
	}

}
