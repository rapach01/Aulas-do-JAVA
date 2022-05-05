package imc;

import javax.swing.JOptionPane;

public class Main {
	//imc calculation
	public static double IMC(double heigh, double weight) {
		double result = weight/Math.pow(heigh, 2); 
		return result;
	}
	//main class
	public static void main(String[] args) {
		//variables
		double w, h;
		//user's info
		h = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
		w = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
		//conditions
		if(IMC(h,w) <= 18.4) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
		}
		else if (IMC(h,w) >= 18.5 && IMC(h,w) <= 24.9) {
			JOptionPane.showMessageDialog(null, "Você está no Peso Ideal");
		}
		else if (IMC(h,w) >= 25.0 && IMC(h,w) <= 29.9) {
			JOptionPane.showMessageDialog(null, "Você está com Sobrepeso");
		}
		else if (IMC(h,w) >= 30.0 && IMC(h,w) <= 34.9) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade Grau 1");
		}
		else if (IMC(h,w) >= 35.0 && IMC(h,w)<= 39.9) {
			JOptionPane.showMessageDialog(null, "Você está com Obesidade Grau 2");
		}
		else if (IMC(h,w) >= 40.0){
			JOptionPane.showMessageDialog(null, "Você está com Obesidade Grau 3");
		}
	}

}
