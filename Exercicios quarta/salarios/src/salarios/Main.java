package salarios;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		double salary, salary2, qtd;
		
		salary2=Double.parseDouble(JOptionPane.showInputDialog("Informe o seu sal�rio atual: "));
		salary=Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio m�nimo: "));
		
		qtd = salary2/salary;
		
		JOptionPane.showMessageDialog(null,"O seu sal�rio cabem " + qtd +" sal�rios m�nimos");
	}

}
