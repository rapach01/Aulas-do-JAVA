package idade;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variables
		int day, year, month, age;
		
		//user's info
		year = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos anos você tem: "));
		month = Integer.parseInt(JOptionPane.showInputDialog("Informe agora quantos meses você tem, além dos anos: "));
		day = Integer.parseInt(JOptionPane.showInputDialog("Informe agora quantos dias de idade você tem, além dos anos e meses: "));
		
		//count
		year*= 365;
		month*=30;
		
		age= year + month + day;
		
		//print
		JOptionPane.showMessageDialog(null, age);
	}

}
