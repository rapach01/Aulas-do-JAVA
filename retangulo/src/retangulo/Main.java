package retangulo;

import javax.swing.JOptionPane;

public class Main {
//area class
	public static double CalculationArea(double base, double height) {
		double area = base*height;
		return area;
	}
//perimeter class	
	public static double CalculationPerimeter(double base, double height) {
		double perimeter = 2*height + 2*base;
		return perimeter;
	}
	public static void main(String[] args) {
		//variables
		int h, b;
		//info
		h = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do retangulo: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe a base do retangulo: "));
		//print
		JOptionPane.showMessageDialog(null, "O resultado da área do retângulo é: " + CalculationArea(h,b));
		JOptionPane.showMessageDialog(null, "O resultado do perímetro do retângulo é: " + CalculationPerimeter(h,b));
	}

}
