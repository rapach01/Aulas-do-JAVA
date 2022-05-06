package stringefor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//variaveis
		String s ="";
		int i = 0;
		boolean verify = true;
		//la�o for
		for(i=0;i<10;i++) {
			//recebe a palavra/numero
			s = JOptionPane.showInputDialog("Informe um n�mero ou uma palavra");
			//variavel para o cast
			int n = 0;
			
			try {
				//tenta transformar em um int
				n = (Integer.parseInt(s));
				verify = true;
			} 
			//se nao, � palavra
			catch (NumberFormatException e) {
				verify = false;
			}
			//printa a verifica��o
			if(verify == true) {
				JOptionPane.showMessageDialog(null, "� n�mero");
			}else { 
				JOptionPane.showMessageDialog(null, "� palavra");
			}
		}
	}
}


