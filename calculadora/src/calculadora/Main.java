package calculadora;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Main {
	//sum class
	public static double soma (double soma1, double soma2) {
		return soma1 + soma2;
	}
	//class subtraction
	public static double subtracao(double subtracao1, double subtracao2) {
		return subtracao1 - subtracao2;
	}
	//class multiplication
	public static double vezes (double vezes1, double vezes2) {
		return vezes1 * vezes2;
	}
	//class division
	public static double divisao (double divisao1, double divisao2) {
		return divisao1 * divisao2;
	}
	
	//main class
	public static void main(String[] args) {
		//variables
		double a1=0, a2=0;
		
		a1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um numero: "));
		a2 = Double.parseDouble(JOptionPane.showInputDialog("Informe mais um numero: "));
		//result variables
		double r1 = vezes (a1,a2);
		double r2 = divisao (a1,a2);

		//print
		JOptionPane.showMessageDialog(null, "A soma dos numeros é: " + soma(a1, a2));
		JOptionPane.showMessageDialog(null, "A subtração dos numeros é: " + subtracao(a1, a2));
		JOptionPane.showMessageDialog(null, "A multiplicação dos numeros é: " + new DecimalFormat("00.00").format(r1));
		JOptionPane.showMessageDialog(null, "A divisão dos numeros é: " + new DecimalFormat("00.00").format(r2));
	}

}
