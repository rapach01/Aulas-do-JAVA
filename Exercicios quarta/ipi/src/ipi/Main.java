package ipi;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		double ipi, qntd1, qntd2, part1, part2, result;
		
		qntd1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de peças 1: "));
		part1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da peça: "));
		qntd2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de peças 2: "));
		part2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da peça 2: "));
		ipi = Double.parseDouble(JOptionPane.showInputDialog("Informe o IPI: "));
		
		result = (qntd1*part1 + qntd2*part2)*(ipi/100+1);
		JOptionPane.showMessageDialog(null,"O IPI dos produtos é: " +result);

	}

}
