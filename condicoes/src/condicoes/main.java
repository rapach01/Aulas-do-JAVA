package condicoes;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
			
		//variables
		int age;
	
		//user's info
		JOptionPane.showMessageDialog(null, "Seja bem vindo ao nosso programa!");
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua Idade"));
	
		//conditions
		if(age<18) {
			JOptionPane.showMessageDialog(null, "Voc� ainda � menor de idade!");
		}
		else if(age==18) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acabou de completar maior idade!");
		}else {
			JOptionPane.showMessageDialog(null, "ta ficando velho!");
		}
	}

}
