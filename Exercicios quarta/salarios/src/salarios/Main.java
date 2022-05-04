package salarios;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		double salary, salary2, qtd;
		
		salary2=Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário atual: "));
		salary=Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mínimo: "));
		
		qtd = salary2/salary;
		
		JOptionPane.showMessageDialog(null,"O seu salário cabem " + qtd +" salários mínimos");
	}

}
